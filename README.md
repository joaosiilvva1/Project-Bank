💰 Project Bank - Sistema Bancário Simples
Olá! Este é o Project Bank, um sistema bancário simples desenvolvido em Python como parte de um projeto para praticar programação orientada a objetos, manipulação de arquivos e lógica de negócios.

Ele simula operações básicas de um banco, como criar contas, fazer depósitos, saques, transferências e consultar extratos. Tudo isso funcionando via linha de comando (CLI) de forma interativa.

✨ Funcionalidades
Criar conta corrente com agência e número da conta

Depositar valores na conta

Sacar valores (com limite de até 3 saques diários e máximo de R$ 500,00 por saque)

Transferir valores entre contas

Consultar extrato com histórico de movimentações

Listar todas as contas cadastradas

Persistência de dados em arquivo JSON

Interface amigável via linha de comando

🚀 Como executar o projeto
Pré-requisitos
Python 3.6 ou superior

Passos
Clone este repositório:

bash
git clone https://github.com/joaosiilvva1/Project-Bank.git
Entre na pasta do projeto:

bash
cd Project-Bank
Execute o arquivo principal:

bash
python main.py
Siga as instruções no menu interativo! 🎉

🏗️ Estrutura do projeto
text
Project-Bank/
│
├── main.py              # Arquivo principal com o menu interativo
├── bank.py              # Classe principal do banco e lógica de negócios
├── account.py           # Classe Conta com operações bancárias
├── client.py            # Classe Cliente para gerenciar usuários
├── database.py          # Funções para persistência em JSON
└── README.md            # Este arquivo
💡 Como usar
Ao executar o programa, você verá um menu como este:

text
=== SISTEMA BANCÁRIO ===

1. Criar conta
2. Depositar
3. Sacar
4. Transferir
5. Consultar extrato
6. Listar contas
0. Sair

Escolha uma opção:
📝 Exemplo de fluxo:
Criar uma conta: Digite 1, informe nome, CPF, agência e número da conta

Fazer um depósito: Digite 2, informe número da conta e valor

Consultar extrato: Digite 5 para ver todas as movimentações

Os dados são salvos automaticamente no arquivo data.json!

🛠️ Tecnologias utilizadas
Python 3 - Linguagem principal

JSON - Para persistência de dados

POO - Programação Orientada a Objetos

Datetime - Para registro de horários das transações

🤝 Contribuindo
Encontrou um bug? Tem uma ideia para melhorar? Sinta-se à vontade para:

Fork este repositório

Criar uma branch (git checkout -b feature/nova-feature)

Commit suas mudanças (git commit -am 'Adiciona nova feature')

Push para a branch (git push origin feature/nova-feature)

Abrir um Pull Request

👨‍💻 Autor
Feito com 💜 por João Silva
GitHub | LinkedIn

📄 Licença
Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

Nota: Este é um projeto educacional para fins de aprendizado. Não utilize para operações bancárias reais! 😄

Espero que goste do projeto! Se tiver alguma dúvida, é só abrir uma issue aqui no GitHub.

