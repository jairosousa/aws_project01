# AWS Project 01
Projeto utilizado para o curso: Criando microsserviços em Java com AWS ECS e Fargate

## Criando a imagem Docker

* Faça o build com o maven da aplicação Java
```
mvn clean package
```

* Crie a imagem docker com Dokerfile. importante definir tag
```
docker build -t jnsousa/aws_project01:latest .
```
## Enviando a imagem docker
```
docker push jnsousa/aws_project01:latest
```

### Repita o processo quendo fazwer alterações na api