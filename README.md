Sistema de Gerenciamento de RPG

Informações Gerais sobre o Projeto
Descrição:
O Sistema de Gerenciamento de RPG é uma aplicação desenvolvida em Java que permite a criação e gerenciamento de personagens e vilões e simulação de combates. O objetivo principal é aplicar conceitos de orientação a objetos, tratamento de exceções, persistência de dados e controle de versão.

Objetivos:

Desenvolver uma aplicação completa utilizando Java.
Implementar funcionalidades além de um simples CRUD.
Demonstrar habilidades de trabalho colaborativo e controle de versão com Git.

Funcionalidades Principais:

Cadastro de personagens e vilões com atributos específicos.
Organização e filtragem de personagens e vilões.
Simulação de combates entre personagens e vilões.
Persistência de dados em arquivos de texto ou JSON.

Classes Principais:

Personagem (Classe Abstrata):

Atributos: nome, nível, pontos de vida, atributos (força e bônus da classe).
Guerreiro, Mago, Suporte, Vilão (Classes Concretas):

Herança da classe Personagem.

Combate:

Atributos: personagem1(Guerreiro, Mago ou Suporte) vs personagem2(Vilão).

Relações:

Composição:
A classe Combate compõe dois objetos Personagem.

Como Executar o Projeto

Pré-requisitos:

Java JDK 11 ou superior.
Git.
IDE de sua preferência (Eclipse, IntelliJ, etc.).
Passos para Configuração e Execução:

Clone o repositório do projeto:

bash
Copiar código
git clone <URL_DO_REPOSITORIO>
cd <NOME_DO_REPOSITORIO>
Importe o projeto em sua IDE:

Abra sua IDE e selecione "Importar projeto".
Navegue até o diretório clonado e selecione-o para importar.
Compile e execute a aplicação:

Na sua IDE, encontre a classe principal (Main.java).
Execute a classe principal para iniciar a aplicação.
Teste as funcionalidades:

Utilize a interface de linha de comando ou a interface gráfica (se implementada) para testar as funcionalidades de cadastro, organização, missões, combates e estatísticas.

Uso do ChatGPT

Como o ChatGPT foi Utilizado:

O ChatGPT foi utilizado para auxiliar na estruturação do projeto, incluindo a definição das funcionalidades, organização das classes e relações, e elaboração deste README.
Além disso, foi utilizado para obter sugestões e resolver dúvidas técnicas durante o desenvolvimento do projeto.
