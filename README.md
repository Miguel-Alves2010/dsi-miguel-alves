
  

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

package aula01; //Mostra que o arquivo pertence ao pacote aula01;

  

  

public  class  Main { //Identifica a criação de uma classe e seu nome

  

public  static  void  main(String[] args) { //ponto de início do programa

  

System.out.println("Hello World"); //serve para printar uma mensagem no console

  

}

  

}

```

  

  

O código apresentado é um programa simples em Java que exibe uma mensagem ("Hello World) na tela. Ele começa com **package aula01;**, e indica que o arquivo pertence ao pacote chamado aula01, usado para organizar os arquivos do projeto. Em seguida, é criada uma classe chamada **Main** (Maíusculo), pois em Java todo programa precisa estar dentro de uma classe. Dentro dessa classe está o **main** (Minúsculo), que é o ponto de início do programa, ou seja, é por ele que o Java começa a executar o código. Dentro do **main** (Minúsculo) existe a instrução **System.out.println("Hello World");**, que serve para printar essa mensagem no console.

  

  

  

# Regras do java

  

  

  

- Case sensitive (**Diferenciação de letras minúsculas e maíusculas**);

  

  

- O programa precisa estar dentro de uma classe para funcionar.
# Javac

Muitas vezes, quando o java está com problemas na utilização, existem alguns códigos que você utiliza no terminal para ajudar isso:

 - cd .\dsi-miguel-alves\aula01\         (Exemplo usando meu repositório e minha pasta)
 - javac .\Main.java 
 - java .\Main.java 

Com esses códigos, isso vai fazer com que o seu computador consiga entender melhor a linguagem, solucionado possíveis erros com o entendimento da linguagem na máquina.
