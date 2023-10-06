### Docker compose do mongo

https://hub.docker.com/_/mongo

### Acessando o container do mongo:

```docker exec -it mongo-test bash```


### Acessando o mongo dentro do container:

1. ```mongosh``` para executar o mongo
2. ```use admin``` para acessar como admin
3. Efetue o login ```db.auth('root', passwordPrompt())``` depois digite a senha ```example```
4. ```show dbs```

### Executando comandos diversos

1. trocando para um DB novo ```use carros```
2. criando collection ```db.createCollection("carros")```
3. visualizando nova collection ```show dbs```

### Executando o Linter do KTLint
https://blog.mindorks.com/code-formatting-in-kotlin-using-ktlint/

1. ```brew install ktlint```
2. ```./gradlew ktlintCheck```
3. ```./gradlew ktlintFormat```