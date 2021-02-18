# **PROVA TÉCNICA JAVA - SELEÇÃO GENERATION 01**

São 4 Projetos desenvolvidos na linguagem Java, trabalhando conceitos de Orientação à Objetos.

## Instalação

Instale a versão mais recente do Java (Java SE 15) [Oracle](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html) .


## Uso

Acesse a pasta principal e execute os comandos abaixo em cada projeto.

**Exemplo:**

```java
javac projeto01/*.java
```
Na pasta do Projeto, crie o arquivo manifest.txt com o seguinte conteúdo:

```java
Main-Class: projeto01.TestaCarro
Name: projeto01.TestaCarro.class
Java-Bean: True
```

Execute os comandos abaixo para gerar o arquivo JAR e Executar a aplicação:

```java
jar cfm TestaCarro.jar projeto01/manifest.txt projeto01/*.class
java -jar TestaCarro.jar
```

## Licença
[MIT](https://choosealicense.com/licenses/mit/)
