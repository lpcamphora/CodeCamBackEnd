# CodeCam - Backend

Backend Spring Boot responsável pela geração e validação de senha de conexão entre o PC e o aplicativo mobile.

## ✅ Funcionalidades

- Gera senha aleatória de 3 dígitos.
- Exibe a senha via API REST.
- Valida senha enviada pelo aplicativo.
- Permite gerar nova senha.

## ✅ Endpoints

| Método | Rota                  | Descrição                           |
|-------- | -------------------- | ----------------------------------- |
| GET     | `/senha`             | Retorna a senha atual gerada.       |
| POST    | `/senha/validar`     | Valida a senha enviada no body.     |
| POST    | `/senha/nova`        | Gera uma nova senha aleatória.      |

## ✅ Como rodar o projeto

1. **Pré-requisitos**:
   - Java 17+
   - Maven

2. **Clone o repositório**:

```bash
git clone https://github.com/lpcamphora/CodeCamBackEnd.git
cd CodeCamBackEnd
