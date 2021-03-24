<h1 align="center">
    <p>Projeto de modelo de springboot, mongodb e webflux</p>
</h1>

<h4 align="center"> 
	♻️ Concluído 🚀 
</h4>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-funcionalidades">Funcionalidades</a> •
 <a href="#-layout">Layout</a> • 
 <a href="#-como-executar-o-projeto">Como executar</a> • 
 <a href="#-tecnologias">Tecnologias</a> • 
 <a href="#-contribuidores">Contribuidores</a> • 
 <a href="#-autor">Autor</a> • 
 <a href="#user-content--licença">Licença</a>
</p>


## 💻 Sobre o projeto

♻️ Pokemons - é uma das formas para conectar uma aplicação Java springboot, mongodb e webflux

Projeto desenvolvido como modelo.

---

## ⚙️ Funcionalidades

- [x] Pokemon:
  - [x] Obter todos os Pokemons
  - [x] Obter um Pokemon pelo seu id
  - [x] Inserir um novo Pokemon
  - [x] Trabalhar com o exemplo de eventos assíncronos

- [x] Tecnologias:
  - [x] Java 11
  - [x] SpringBoot
    - Rest/Json
    - SpringData
  - [x] MongoDB

---

## 🚀 Como executar o projeto

O projeto necessita:
1. SpringToolSuite4 (ide)
2. Instalar o mongoDB ou rodar um container
3. Studio 3T (client para fazer as pesquisas na base nosql) opcional
4. Postman: fazer requisições rest
5. Navegador: chrome ou firefox

### 🚀 Exemplo para verificar o funcionamento de eventos assíncronos do webflux

1. Abrir uma aba do navegador
2. Informar: http://localhost:8080/pokemons/events
3. Aguardar em torno de 15 segundos - a cada 5 segundos será visualizado um novo evento
4. Abrir outra aba do navegador e informar a mesma url: http://localhost:8080/pokemons/events
5. Verificar que os eventos são assíncronos

### 🚀 Screenshots de eventos assíncronos
1. Primeira aba
![image](https://user-images.githubusercontent.com/1674340/112302200-dd98b180-8cab-11eb-8b17-2658d3ea26ac.png)

2. Segunda aba
![image](https://user-images.githubusercontent.com/1674340/112302418-1e90c600-8cac-11eb-9318-a65328d189ad.png)

3. Visualizando múltiplas abas
![image](https://user-images.githubusercontent.com/1674340/112302508-39633a80-8cac-11eb-9280-71f25f7f229d.png)

---

##  Versões do README

[Português 🇧🇷](./README.md)  |  [Inglês sem emojis 🇺🇸](./README-en.md) | [Portugues sem logo  🇧🇷](./README-sem-logo.md) 
