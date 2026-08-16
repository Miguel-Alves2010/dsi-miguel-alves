
  

  

# Desenvolvimento de Software I

  

  

  

  

Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java.

  

  

  

  

  

# Configuração principal do repositório do GH na máquina

  

  

  

  

Para fazer a configuração do repositório na máquina utilizando o git bash, são necessários alguns códigos, sendo eles:

  

  

  

  

- $ git config --global user.name '_nome_'

  

  

  

- $ git config --global user.email _email_

  

  

  

- $ git clone _URL copiada do repositório desejado_

  

  

  

  

# Instalação do java na máquina

  

  

  

  

Para realizar essa instalação, é necessário acessar o site "**Adoptium**", e nele, baixar o OpenJDK. Ao fazer isso, você executa o instalador e finaliza a instalação. Assim que completo, você precisa entrar no seu gerenciador de arquivos, buscar a pasta do Adoptium onde o Java foi instalado e copiar o caminho dessa pasta.

  

  

  

  

Quando baixado o OpenJDK, geralmente, o PATH já vem configurado, porém, é importante checarmos isso antes de qualquer tipo de uso e, para isso, digitamos "**Editar as variáveis de ambiente do sistema**" no Windows e, ao iniciar, você precisa clicar em "Variáveis do ambiente", no canto inferior direito da janela. Após isso, foque na seção "**Variáveis do sistema**" e procure por "**PATH**" e, logo em seguida, clique para editá-lo. Ao fazer isso, você precisa ver se há o caminho da sua pasta do adoptium. Se sim, está tudo certo, porém, caso não haja qualquer tipo de caminho ligado ao Java recém baixado, **você precisa clicar em "Novo" e colar esse caminho que foi copiado na pasta do adoptium**, salvando e confirmando em todos "Ok" das janelas.

  

  

  

  

Para confirmar que tudo está correto após todas essas etapas, apenas é necessário abrir o **CMD** e digitar:

  

  

  

  

**java --version**

  

  

  

  

# Explicação do código em Java (Hello world)

  

  

  

  

**O código na qual estamos falando é:**

  

  

  

```java

  

package  aula01;

  

  

public  class  Main {

  

public  static  void  main(String[] args) {

  

System.out.println("Hello World");

  

}

  

}

  

```

  

  

  

O código apresentado é um programa simples em Java que exibe uma mensagem ("Hello World) na tela. Ele começa com **package aula01;**, e indica que o arquivo pertence ao pacote chamado aula01, usado para organizar os arquivos do projeto. Em seguida, é criada uma classe chamada **Main** (Maíusculo), pois em Java todo programa precisa estar dentro de uma classe. Dentro dessa classe está o **main** (Minúsculo), que é o ponto de início do programa, ou seja, é por ele que o Java começa a executar o código. Dentro do **main** (Minúsculo) existe a instrução **System.out.println("Hello World");**, que serve para printar essa mensagem no console.

  

  

  

  

# Regras do java

  

  

  

  

- Case sensitive (**Diferenciação de letras minúsculas e maíusculas**);

  

  

  

- O programa precisa estar dentro de uma classe para funcionar.

# Javac

  

Muitas vezes, quando o java está com problemas na utilização, existem alguns códigos que você utiliza no terminal para ajudar isso:

  

- cd .\dsi-miguel-alves\aula01\ (Exemplo usando meu repositório e minha pasta)

- javac .\Main.java

- java .\Main.java

  

Com esses códigos, isso vai fazer com que o seu computador consiga entender melhor a linguagem, solucionado possíveis erros com o entendimento da linguagem na máquina.


## SPRING BOOT: O que é e como criar um projeto.
O Spring boot é, basicamente, um framework criado para facilitar o desenvolvimento de aplicações em Java, fazendo códigos muito menores e de forma mais eficiente. 

Para criar projetos utilizando o Spring Boot é muito fácil, e existem duas formas rápidas e fáceis de fazer isso.


**1- Spring initializr  (Navegador):**
Na barra de pesquisa, pesquisando por Spring Initializr e entrando no primeiro link, você entra em um site que cria automaticamente a base para o seu projeto Spring boot de acordo com as opções que você escolher, seja  um projeto Gradle (Groovy ou Kotlin) ou Maven, a versão do Spring boot, a versão do Java, dependências etc... 
Após fazer a seleção do seu projeto, o site cria automaticamente uma pasta com a base do projeto, bastando apenas fazer o download e abrir no VScode, por exemplo.

**2- Spring initializr (VScode):**
Por mais que o nome "Spring initializr" seja o mesmo, essa segunda etapa é bem mais rápida e simples para as pessoas que usam o VSCode para editar seus códigos. Para criar a base do seu projeto, exatamente da mesma forma do navegador, basta instalar a extensão "Spring Boot Extension Pack", reiniciar o seu VSCode (Recomendado) e pronto. 
Após isso, o usuário apenas precisa usar o atalho *ctrl + shift + p* e, assim que abrir a barra de pesquisa, digitar "Spring initializr" e clicar *enter*. Então, feito tudo isso, vai ocorrer as mesmas etapas que foram feitas no chrome: Selecionar o tipo do projeto, versão do java, dependencias etc, criando a base do seu projeto Spring Boot automaticamente no seu VSCode :) .
