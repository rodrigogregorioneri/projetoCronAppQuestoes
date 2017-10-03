var app = (function() {

	return angular
			.module(
					'MyApp',
					['ui.router', 'ui.select', 'ui-select-infinity',
							'ngResource', 'ngSanitize', 'custom.controllers',
							'custom.services', 'datasourcejs', 'chart.js',
							'ngMask', 'ngJustGage', 'pascalprecht.translate',
							'tmh.dynamicLocale', 'ui-notification',
							'ui.bootstrap', 'ngFileUpload'])

			.constant('LOCALES', {
				'locales' : {
					'pt_br' : 'Portugues (Brasil)',
					'en_us' : 'English'
				},
				'preferredLocale' : 'pt_br'
			})
			.config(
					[
							'$httpProvider',
							function($httpProvider) {
								var interceptor = [
										'$q',
										'$rootScope',
										function($q, $rootScope) {
											var service = {
												'request' : function(config) {
													var _u = JSON
															.parse(sessionStorage
																	.getItem('_u'));
													if (_u && _u.token) {
														config.headers['X-AUTH-TOKEN'] = _u.token;
														window.uToken = _u.token;
													}
													return config;
												}
											};
											return service;
										}];
								$httpProvider.interceptors.push(interceptor);
							}])
			.config(
					function($stateProvider, $urlRouterProvider,
							NotificationProvider) {
						NotificationProvider.setOptions({
							delay : 5000,
							startTop : 20,
							startRight : 10,
							verticalSpacing : 20,
							horizontalSpacing : 20,
							positionX : 'right',
							positionY : 'top'
						});

						// Set up the states
						$stateProvider

						.state('login', {
							url : "",
							controller : 'LoginController',
							templateUrl : 'views/login.view.html'
						})

						.state('cadastrar', {
							url : "/cadastrar",
							templateUrl : 'views/cadastrar.view.html'
						})

						.state('main', {
							url : "/",
							controller : 'LoginController',
							templateUrl : 'views/login.view.html'
						})

						.state('home', {
							url : "/home",
							controller : 'HomeController',
							templateUrl : 'views/logged/home.view.html'
						})

						.state('home.form', {
							url : "/form",
							templateUrl : 'views/formularioPesquisa.view.html'
						})

						.state('home.pages', {
							url : "/{name:.*}",
							controller : 'PageController',
							templateUrl : function(urlattr) {
								return 'views/' + urlattr.name + '.view.html';
							}
						})

						.state('404', {
							url : "/error/404",
							controller : 'PageController',
							templateUrl : function(urlattr) {
								return 'views/error/404.view.html';
							}
						})

						.state('403', {
							url : "/error/403",
							controller : 'PageController',
							templateUrl : function(urlattr) {
								return 'views/error/403.view.html';
							}
						});

						// For any unmatched url, redirect to /state1
						$urlRouterProvider.otherwise("/error/404");
					})

			.config(
					function($translateProvider, tmhDynamicLocaleProvider) {

						$translateProvider.useMissingTranslationHandlerLog();

						$translateProvider.useStaticFilesLoader({
							prefix : 'i18n/locale_',
							suffix : '.json'
						});

						$translateProvider.registerAvailableLanguageKeys([
								'pt_br', 'en_us'], {
							'en*' : 'en_us',
							'pt*' : 'pt_br',
							'*' : 'pt_br'
						});

						var locale = (window.navigator.userLanguage
								|| window.navigator.language || 'pt_br')
								.replace('-', '_');

						$translateProvider.use(locale.toLowerCase());
						$translateProvider.useSanitizeValueStrategy('escaped');

						tmhDynamicLocaleProvider
								.localeLocationPattern('plugins/angular-i18n/angular-locale_{{locale}}.js');
					})

			.directive(
					'crnValue',
					[
							'$parse',
							function($parse) {
								return {
									restrict : 'A',
									require : '^ngModel',
									link : function(scope, element, attr,
											ngModel) {
										var evaluatedValue;
										if (attr.value) {
											evaluatedValue = attr.value;
										} else {
											evaluatedValue = $parse(
													attr.crnValue)(scope);
										}
										element.attr("data-evaluated", JSON
												.stringify(evaluatedValue));
										element
												.bind(
														"click",
														function(event) {
															scope
																	.$apply(function() {
																		ngModel
																				.$setViewValue(evaluatedValue);
																	}
																			.bind(element));
														});
									}
								};
							}])

			// General controller
			.controller(
					'PageController',
					[
							"$scope",
							"$stateParams",
							"$location",
							"$http",
							"$rootScope",
							"$translate",
							function($scope, $stateParams, $location, $http,
									$rootScope, $translate) {

								app.registerEventsCronapi($scope, $translate);

								console.log(sessionStorage.getItem("_u"));

								var valores = {};

								$scope.dados = [];

								$scope.empresaDados = {};

								$scope.salvaPesquisa = function(perguntas) {
									var profissional = $rootScope.Profissionais.data[0]
									var idUsuarioLogado = $rootScope.session.user.id;

									valores = $rootScope.Pergunta.data;
									myobject = {};
									for (i = 0; i < valores.length; i++) {
										if (valores[i].componente.tipo_questao === "disertativa") {

											myobject = {
												'respostaCorreta' : valores[i].resposta,
												'profissionais' : profissional,
												'idUserLogado'  : idUsuarioLogado
											}
											$http(
													{
														method : 'POST',
														url : 'api/rest/cronapp/app/Respostas',
														data : myobject,
														headers : {
															'Content-Type' : 'application/json'
														}
													}).success(
													function(data, status,
															headers, config) {

													}).error(function() {
											});

										} else {
											opcoes = $rootScope.OpcaoPerguntas.data;
											for (j = 0; j < opcoes.length; j++) {

												if (opcoes[j].id == "true"
														&& opcoes[j].pergunta.perguntas === valores[i].perguntas) {
													myobject = {
														'respostaCorreta' : opcoes[j].opcao,
														'profissionais' : profissional,
														 'idUserLogado'  : idUsuarioLogado
													}
												
												}
											}
											$http(
													{
														method : 'POST',
														url : 'api/rest/cronapp/app/Respostas',
														data : myobject,
														headers : {
															'Content-Type' : 'application/json'
														}
													}).success(
													function(data, status,
															headers, config) {
													}).error(function() {
											});
										}
									}
								}

								$scope.inseriUsuario = function(user) {
									$http({
										method : 'POST',
										url : 'api/security/User',
										data : user,
										headers : {
											'Content-Type' : 'application/json'
										}
									}).success(
											function(data, status, headers,
													config) {
													  console.log("foi");

											}).error(function() {
											  console.log("Não foi");
									});
								}

								// save state params into scope
								$scope.params = $stateParams;
								$scope.$http = $http;

								// Query string params
								var queryStringParams = $location.search();
								for ( var key in queryStringParams) {
									if (queryStringParams.hasOwnProperty(key)) {
										$scope.params[key] = queryStringParams[key];
									}
								}

								//Components personalization jquery
								$scope.registerComponentScripts = function() {
									//carousel slider
									$('.carousel-indicators li')
											.on(
													'click',
													function() {
														var currentCarousel = '#'
																+ $(this)
																		.parent()
																		.parent()
																		.parent()
																		.attr(
																				'id');
														var index = $(
																currentCarousel
																		+ ' .carousel-indicators li')
																.index(this);
														$(
																currentCarousel
																		+ ' #carousel-example-generic')
																.carousel(index);
													});
								}

								$scope.registerComponentScripts();
							}])

			.run(
					function($rootScope, $state) {
						$rootScope.$on('$stateChangeError', function() {
							if (arguments.length >= 6) {
								var requestObj = arguments[5];
								if (requestObj.status === 404
										|| requestObj.status === 403) {
									$state.go(requestObj.status.toString());
								}
							} else {
								$state.go('404');
							}
						});
					});

}(window));

app.userEvents = {};

//Configuration
app.config = {};
app.config.datasourceApiVersion = 2;

app.registerEventsCronapi = function($scope, $translate) {
	for ( var x in app.userEvents)
		$scope[x] = app.userEvents[x].bind($scope);

	$scope.vars = {};

	try {
		if (cronapi) {
			$scope['cronapi'] = cronapi;
			$scope['cronapi'].$scope = $scope;
			$scope.safeApply = safeApply;
			if ($translate) {
				$scope['cronapi'].$translate = $translate;
			}
		}
	} catch (e) {
		console.info('Not loaded cronapi functions');
		console.info(e);
	}
	try {
		if (blockly)
			$scope['blockly'] = blockly;
	} catch (e) {
		console.info('Not loaded blockly functions');
		console.info(e);
	}
};

window.safeApply = function(fn) {
	var phase = this.$root.$$phase;
	if (phase == '$apply' || phase == '$digest') {
		if (fn && (typeof (fn) === 'function')) {
			fn();
		}
	} else {
		this.$apply(fn);
	}
};
