
# 💻 API Rest desenvolvida para um cardápio digital

## 🤓 Arquitetura simples, utilizando os métodos básicos de CRUD

### 👨‍💻 Desenvolvida utilizando SpringBoot + Spring Data JPA + H2 Database

## 📙 Resumos

| Tema | Resumo |
| ---- | ------ |
| SpringBoot | [Documentação](https://docs.spring.io/spring-boot/index.html) |
| Spring Data JPA | [Documentação](https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#reference) |
| H2 Database | [Documentação](https://h2database.com/html/main.html) |

### 🔎 Passo a Passo para rodar a aplicação na linha de comando


#### ✅ Se caso você já possuir o JDK 17 instalado na sua máquina:

Na diretório raiz do projeto digite o seguinte comando:

```
java -jar target\cardapio-0.0.1-SNAPSHOT.jar
```

#### ❌ Se caso não possuir te ajudarei na instalação:

- Visite o site oficial da Oracle, na seção [Java Downloads](https://www.oracle.com/br/java/technologies/downloads/#java22);
- Escolha a opção JDK 17;
- Escolha a opção para download segundo o sistema operacional desejado, no meu caso estou utilizando windows;
- Se estiver utilizando também selecione o [x64 Installer](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe) e faça o download;
- Execute o instalador após o download;

- Siga as instruções e escolha o diretório padrão sugerido pelo instalador;

- Após a instalação vocÊ precisará configurar as variáveis de ambiente do sistema;

- Abra o prompt de comando;

- Digite o seguinte comando:
```
setx JAVA_HOME "C:\Program Files\Java\jdk-17"
```
- Logo após digite esse outro comando:
```
setx PATH "%PATH%;C:\Program Files\Java\jdk-17\bin"
```

- Após a conclusão, verifique se o java foi instalado com sucesso digitando o seguinte comando:
```
java --version
```

- Se a versão do java aparecer a instalação foi concluída com sucesso;

- Então rode o projeto digitando o seguinte comando no diretório raíz do projeto:

```
java -jar target\cardapio-0.0.1-SNAPSHOT.jar
```

## 🔎 Endpoints presentes na aplicação

- Endpoint para criação de um produto
```
http://localhost:8090/food/save
```

- Endpoint para vizualiar os produtos criados
```
http://localhost:8090/food/
```

## 🔎 Também criei testes para o controlador

### ☢️ Você precisará ter o maven instalado na sua máquina para rodar os testes

#### ✅ Se caso você já possuir o maven instalado na sua máquina:

- Na cmd ou prompt, localizado no diretório raiz do projeto, digite o seguinte comando:

```
mvn test
```
#### ❌ Se caso não possuir te ajudarei na instalação:

- Visite o site Oficial [Apache Maven](https://maven.apache.org/download.cgi) na sessão de downloads;

- Faça download do arquivo [Binary Zip Archive](https://dlcdn.apache.org/maven/maven-3/3.9.9/binaries/apache-maven-3.9.9-bin.zip);

- Após baixar, descompacte o arquivo no diretório incicado:
```
C:\Program Files\Apache\maven
```

- Em seguida abra o prompt de comando do seu computador e digite os seguintes comandos, para configurar o maven nas variáveis de ambiente do windows:
```
setx MAVEN_HOME "C:\Program Files\Apache\maven\apache-maven-3.9.9"
```
```
setx PATH "%PATH%;C:\Program Files\Apache\maven\apache-maven-3.9.9\bin"

```

- Para testar se deu certo a instalação, digite o seguinte comando:
```
mvn -v
```

- Se estiver tudo ok, aparecendo a versão do maven, agora você pode rodar os testes usando o seguinte comando:
```
mvn test
```





### 👀 Lembrando que o H2 Database é um banco de dados em memória, ou seja, toda vez que reiniciar a aplicação os dados armazenado não existirão.
