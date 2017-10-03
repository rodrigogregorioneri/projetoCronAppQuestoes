# template.springboot.angularjs API documentation version 0.0.1
/

---

## ChangePassword Resource
ChangePassword Resource

### /changePassword

* **post**: post

## ChangeTheme Resource
ChangeTheme Resource

### /changeTheme

* **post**: post

## Api Resource
Api Resource

### /api/rest
Rest Resource

### /api/rest/cronapp
Cronapp Resource

### /api/rest/cronapp/app
App Resource

### /api/rest/cronapp/app/Cargo
Cargo Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Cargo/{cargoId}
{cargoId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Cargo/{cargoId}/Profissionais
Profissionais Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Cargo/{cargoId}/Profissionais/{profissionaisId}
{profissionaisId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Cargo/{cargoId}/Empresa
Empresa Resource

* **get**: ManyToMany Relationship GET
 @generated

* **post**: ManyToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Cargo/{cargoId}/Empresa/{EmpresaId}
{EmpresaId} Resource

* **delete**: ManyToMany Relationship DELETE
 @generated

### /api/rest/cronapp/app/Cidades
Cidades Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Cidades/{cidadesId}
{cidadesId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Cidades/{cidadesId}/Estados
Estados Resource

* **get**: findEstados
* **put**: putEstados
* **post**: postEstados

### /api/rest/cronapp/app/Cidades/{cidadesId}/Estados/{estadosId}
{estadosId} Resource

* **delete**: deleteEstados

### /api/rest/cronapp/app/Cidades/Empresa
Empresa Resource

### /api/rest/cronapp/app/Cidades/Empresa/{empresaId}
{empresaId} Resource

* **get**: findCidadessByEmpresa

### /api/rest/cronapp/app/Cidades/Profissionais
Profissionais Resource

### /api/rest/cronapp/app/Cidades/Profissionais/{profissionaisId}
{profissionaisId} Resource

* **get**: findCidadessByProfissionais

### /api/rest/cronapp/app/Empresa
Empresa Resource

* **put**: @generated
* **post**: @generated
* **get**: listParams

### /api/rest/cronapp/app/Empresa/{empresaId}
{empresaId} Resource

* **get**: get
* **put**: put
* **delete**: @generated

### /api/rest/cronapp/app/Empresa/{empresaId}/Profissionais
Profissionais Resource

* **get**: findProfissionais
* **put**: putProfissionais
* **post**: postProfissionais

### /api/rest/cronapp/app/Empresa/{empresaId}/Profissionais/{profissionaisId}
{profissionaisId} Resource

* **delete**: deleteProfissionais

### /api/rest/cronapp/app/Empresa/{empresaId}/Cidades
Cidades Resource

* **get**: findCidades
* **put**: putCidades
* **post**: postCidades

### /api/rest/cronapp/app/Empresa/{empresaId}/Cidades/{cidadesId}
{cidadesId} Resource

* **delete**: deleteCidades

### /api/rest/cronapp/app/Empresa/{empresaId}/Cargo
Cargo Resource

* **get**: listCargo
* **post**: postCargo

### /api/rest/cronapp/app/Empresa/{empresaId}/Cargo/{CargoId}
{CargoId} Resource

* **delete**: deleteCargo

### /api/rest/cronapp/app/Empresa/{empresaId}/Profissionais_2
Profissionais_2 Resource

* **get**: listProfissionais_2
* **post**: postProfissionais_2

### /api/rest/cronapp/app/Empresa/{empresaId}/Profissionais_2/{Profissionais_2Id}
{Profissionais_2Id} Resource

* **delete**: deleteProfissionais_2

### /api/rest/cronapp/app/Estados
Estados Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Estados/{estadosId}
{estadosId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Estados/{estadosId}/Territorio
Territorio Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Estados/{estadosId}/Territorio/{territorioId}
{territorioId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Estados/Cidades
Cidades Resource

### /api/rest/cronapp/app/Estados/Cidades/{cidadesId}
{cidadesId} Resource

* **get**: Foreign Key cidades
 @generated

### /api/rest/cronapp/app/OpcaoPerguntas
OpcaoPerguntas Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/OpcaoPerguntas/{opcaoPerguntasId}
{opcaoPerguntasId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/OpcaoPerguntas/{opcaoPerguntasId}/RespostasOpcaoPerguntas
RespostasOpcaoPerguntas Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/OpcaoPerguntas/{opcaoPerguntasId}/RespostasOpcaoPerguntas/{respostasOpcaoPerguntasId}
{respostasOpcaoPerguntasId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/OpcaoPerguntas/{opcaoPerguntasId}/findRespostasIdOpcaoPerguntas
FindRespostasIdOpcaoPerguntas Resource

* **get**: findRespostasIdOpcaoPerguntas

### /api/rest/cronapp/app/OpcaoPerguntas/{opcaoPerguntasId}/Respostas
Respostas Resource

* **get**: ManyToMany Relationship GET
 @generated

* **post**: ManyToMany Relationship POST
 @generated

### /api/rest/cronapp/app/OpcaoPerguntas/{opcaoPerguntasId}/Respostas/{RespostasId}
{RespostasId} Resource

* **delete**: ManyToMany Relationship DELETE
 @generated

### /api/rest/cronapp/app/OpcaoPerguntas/Pergunta
Pergunta Resource

### /api/rest/cronapp/app/OpcaoPerguntas/Pergunta/{perguntaId}
{perguntaId} Resource

* **get**: Foreign Key pergunta
 @generated

### /api/rest/cronapp/app/Pergunta
Pergunta Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Pergunta/{perguntaId}
{perguntaId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Pergunta/{perguntaId}/Respostas
Respostas Resource

* **get**: listRespostas
* **post**: postRespostas

### /api/rest/cronapp/app/Pergunta/{perguntaId}/Respostas/{RespostasId}
{RespostasId} Resource

* **delete**: deleteRespostas

### /api/rest/cronapp/app/Pergunta/{perguntaId}/OpcaoPerguntas
OpcaoPerguntas Resource

* **get**: findOpcaoPerguntas
* **put**: putOpcaoPerguntas
* **post**: postOpcaoPerguntas

### /api/rest/cronapp/app/Pergunta/{perguntaId}/OpcaoPerguntas/{opcaoPerguntasId}
{opcaoPerguntasId} Resource

* **delete**: deleteOpcaoPerguntas

### /api/rest/cronapp/app/Pergunta/{perguntaId}/PerguntaRespostas
PerguntaRespostas Resource

* **get**: findPerguntaRespostas
* **put**: putPerguntaRespostas
* **post**: postPerguntaRespostas

### /api/rest/cronapp/app/Pergunta/{perguntaId}/PerguntaRespostas/{perguntaRespostasId}
{perguntaRespostasId} Resource

* **delete**: deletePerguntaRespostas

### /api/rest/cronapp/app/Pergunta/Pesquisa
Pesquisa Resource

### /api/rest/cronapp/app/Pergunta/Pesquisa/{pesquisaId}
{pesquisaId} Resource

* **get**: findPerguntasByPesquisa

### /api/rest/cronapp/app/Pergunta/PesquisaDaPergunta
PesquisaDaPergunta Resource

### /api/rest/cronapp/app/Pergunta/PesquisaDaPergunta/{pesquisaId}
{pesquisaId} Resource

* **get**: findPerguntasByPesquisaDaPergunta

### /api/rest/cronapp/app/PerguntaRespostas
PerguntaRespostas Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/PerguntaRespostas/{perguntaRespostasId}
{perguntaRespostasId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/PerguntaRespostas/Pergunta
Pergunta Resource

### /api/rest/cronapp/app/PerguntaRespostas/Pergunta/{perguntaId}
{perguntaId} Resource

* **get**: Foreign Key pergunta
 @generated

### /api/rest/cronapp/app/PerguntaRespostas/Respostas
Respostas Resource

### /api/rest/cronapp/app/PerguntaRespostas/Respostas/{respostasId}
{respostasId} Resource

* **get**: Foreign Key respostas
 @generated

### /api/rest/cronapp/app/Pesquisa
Pesquisa Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Pesquisa/{pesquisaId}
{pesquisaId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Pesquisa/{pesquisaId}/Pergunta
Pergunta Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Pesquisa/{pesquisaId}/Pergunta/{perguntaId}
{perguntaId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Pesquisa/{pesquisaId}/Pergunta_2
Pergunta_2 Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Pesquisa/{pesquisaId}/Pergunta_2/{pergunta_2Id}
{pergunta_2Id} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Profissionais
Profissionais Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}
{profissionaisId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Empresa
Empresa Resource

* **get**: ManyToMany Relationship GET
 @generated

* **post**: ManyToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Empresa/{EmpresaId}
{EmpresaId} Resource

* **delete**: ManyToMany Relationship DELETE
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Respostas
Respostas Resource

* **get**: OneToMany Relationship GET
 @generated

* **post**: OneToMany Relationship POST
 @generated

* **put**: OneToMany Relationship PUT
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Respostas/{respostasId}
{respostasId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Cidades
Cidades Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Cidades/{cidadesId}
{cidadesId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Tecnologias
Tecnologias Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Profissionais/{profissionaisId}/Tecnologias/{tecnologiasId}
{tecnologiasId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Profissionais/Cargo
Cargo Resource

### /api/rest/cronapp/app/Profissionais/Cargo/{cargoId}
{cargoId} Resource

* **get**: Foreign Key cargo
 @generated

### /api/rest/cronapp/app/Profissionais/Empresa
Empresa Resource

### /api/rest/cronapp/app/Profissionais/Empresa/{empresaId}
{empresaId} Resource

* **get**: Foreign Key empresa
 @generated

### /api/rest/cronapp/app/Ramo
Ramo Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Ramo/{ramoId}
{ramoId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/RespostasOpcaoPerguntas
RespostasOpcaoPerguntas Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/RespostasOpcaoPerguntas/{respostasOpcaoPerguntasId}
{respostasOpcaoPerguntasId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/RespostasOpcaoPerguntas/Respostas
Respostas Resource

### /api/rest/cronapp/app/RespostasOpcaoPerguntas/Respostas/{respostasId}
{respostasId} Resource

* **get**: Foreign Key respostas
 @generated

### /api/rest/cronapp/app/RespostasOpcaoPerguntas/OpcaoPerguntas
OpcaoPerguntas Resource

### /api/rest/cronapp/app/RespostasOpcaoPerguntas/OpcaoPerguntas/{opcaoPerguntasId}
{opcaoPerguntasId} Resource

* **get**: Foreign Key opcaoPerguntas
 @generated

### /api/rest/cronapp/app/Respostas
Respostas Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}
{respostasId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/RespostasOpcaoPerguntas
RespostasOpcaoPerguntas Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/RespostasOpcaoPerguntas/{respostasOpcaoPerguntasId}
{respostasOpcaoPerguntasId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/PerguntaRespostas
PerguntaRespostas Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/PerguntaRespostas/{perguntaRespostasId}
{perguntaRespostasId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/OpcaoPerguntas
OpcaoPerguntas Resource

* **get**: ManyToMany Relationship GET
 @generated

* **post**: ManyToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/OpcaoPerguntas/{OpcaoPerguntasId}
{OpcaoPerguntasId} Resource

* **delete**: ManyToMany Relationship DELETE
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/Pergunta
Pergunta Resource

* **get**: ManyToMany Relationship GET
 @generated

* **post**: ManyToMany Relationship POST
 @generated

### /api/rest/cronapp/app/Respostas/{respostasId}/Pergunta/{PerguntaId}
{PerguntaId} Resource

* **delete**: ManyToMany Relationship DELETE
 @generated

### /api/rest/cronapp/app/Respostas/Profissionais
Profissionais Resource

### /api/rest/cronapp/app/Respostas/Profissionais/{profissionaisId}
{profissionaisId} Resource

* **get**: Foreign Key profissionais
 @generated

### /api/rest/cronapp/app/Tecnologias
Tecnologias Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Tecnologias/{tecnologiasId}
{tecnologiasId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Tecnologias/Funcionarios
Funcionarios Resource

### /api/rest/cronapp/app/Tecnologias/Funcionarios/{profissionaisId}
{profissionaisId} Resource

* **get**: Foreign Key funcionarios
 @generated

### /api/rest/cronapp/app/Territorio
Territorio Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/rest/cronapp/app/Territorio/{territorioId}
{territorioId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/rest/cronapp/app/Territorio/Estados
Estados Resource

### /api/rest/cronapp/app/Territorio/Estados/{estadosId}
{estadosId} Resource

* **get**: Foreign Key estados
 @generated

### /api/security
Security Resource

### /api/security/Role
Role Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/security/Role/{roleId}
{roleId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/security/Role/{roleId}/User
User Resource

* **get**: ManyToMany Relationship GET
 @generated

* **post**: ManyToMany Relationship POST
 @generated

### /api/security/Role/{roleId}/User/{userId}
{userId} Resource

* **delete**: ManyToMany Relationship DELETE
 @generated

### /api/security/Role/{roleId}/UserRole
UserRole Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/security/Role/{roleId}/UserRole/{userRoleId}
{userRoleId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/security/User
User Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/security/User/{userId}
{userId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/security/User/{userId}/Role
Role Resource

* **get**: ManyToMany Relationship GET
 @generated

* **post**: ManyToMany Relationship POST
 @generated

### /api/security/User/{userId}/Role/{roleId}
{roleId} Resource

* **delete**: ManyToMany Relationship DELETE
 @generated

### /api/security/User/{userId}/UserRole
UserRole Resource

* **get**: OneToMany Relationship GET
 @generated

* **put**: OneToMany Relationship PUT
 @generated

* **post**: OneToMany Relationship POST
 @generated

### /api/security/User/{userId}/UserRole/{userRoleId}
{userRoleId} Resource

* **delete**: OneToMany Relationship DELETE 
 @generated

### /api/security/User/findByRole
FindByRole Resource

### /api/security/User/findByRole/{roleid}
{roleid} Resource

* **get**: NamedQuery findByRole
 @generated

### /api/security/User/findByLogin
FindByLogin Resource

### /api/security/User/findByLogin/{login}
{login} Resource

* **get**: NamedQuery findByLogin
 @generated

### /api/security/UserRole
UserRole Resource

* **put**: Serviço exposto para salvar alterações de acordo com a entidade fornecida
 
 @generated

* **post**: Serviço exposto para novo registro de acordo com a entidade fornecida
 
 @generated

* **get**: NamedQuery list
 @generated

### /api/security/UserRole/{userRoleId}
{userRoleId} Resource

* **get**: Serviço exposto para recuperar a entidade de acordo com o id fornecido
 
 @generated

* **put**: Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
 
 @generated

* **delete**: Serviço exposto para remover a entidade de acordo com o id fornecido
 
 @generated

### /api/security/UserRole/User
User Resource

### /api/security/UserRole/User/{userId}
{userId} Resource

* **get**: Foreign Key User
 @generated

### /api/security/UserRole/Role
Role Resource

### /api/security/UserRole/Role/{roleId}
{roleId} Resource

* **get**: Foreign Key Role
 @generated

### /api/security/UserRole/findByRole
FindByRole Resource

### /api/security/UserRole/findByRole/{roleid}
{roleid} Resource

* **get**: NamedQuery findByRole
 @generated

### /api/security/UserRole/findByLogin
FindByLogin Resource

### /api/security/UserRole/findByLogin/{login}
{login} Resource

* **get**: NamedQuery findByLogin
 @generated

### /api/security/UserRole/findByUser
FindByUser Resource

### /api/security/UserRole/findByUser/{user}
{user} Resource

* **get**: NamedQuery findByUser
 @generated

### /api/security/UserRole/findByEmail
FindByEmail Resource

### /api/security/UserRole/findByEmail/{email}
{email} Resource

* **get**: NamedQuery findByEmail
 @generated

