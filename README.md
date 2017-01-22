# Test

[![Software License](https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat-square)](LICENSE.txt)


[Test para tecnologia](https://github.com/eduardofpu/Test) is a rapid development framework for JAVA 
Projeto criado com finalidade de teste de conhecimento em linguagem java .

## Deploy

Para realizar deploy no heroku :
[Composer](https://devcenter.heroku.com/articles/heroku-cli). configure conforme a documentação do site.

## Download and install
``` bash
$  brew install heroku
```

## Windows

Download and run the Windows installer 32-bit 64-bit.

1. Copy `phpunit.xml.dist` to `phpunit.xml`.
2. Add the relevant database credentials to your `phpunit.xml` if you want to run tests against
   a non-SQLite datasource.
3. Run `phpunit`.

## Debian/Ubuntu
``` bash
  Run the following to add our apt repository and install the CLI:
$ sudo apt-get install software-properties-common # debian only
$ sudo add-apt-repository "deb https://cli-assets.heroku.com/branches/stable/apt ./"
$ curl -L https://cli-assets.heroku.com/apt/release.key | sudo apt-key add -
$ sudo apt-get update
$ sudo apt-get install heroku
```

## Verify your installation
``` bash
$   heroku --version
heroku-cli/5.6.0-010a227 (darwin-amd64) go1.7.4
```

## Getting started

``` bash
$   cd ~/myapp
$ heroku create
Creating app... done, ? sleepy-meadow-81798
https://sleepy-meadow-81798.herokuapp.com/ | https://git.heroku.com/sleepy-meadow-81798.git
```
## Primeiro e preciso ter instalado o git

começando:
ex; D:\Test
git init
git status: verifica o que sera baixado
git add .
git commit -m 'Primeiro commit'

##
heroku login
heroku create aw-biblioteca : obs esse nome não pode ja existir no heroku

##
para voltar no git
git remote -v

##
enviar o codigo para o heroku
git push heroku master

``` bash
heroku logs --tail: Verificar o log da aplicação
```
``` bash
heroku open: abrir o browser
```

## Para adicionar o banco de dados: free

heroku addons:add heroku-postgresql:hobby-dev


Host #######	
Database  #######
User   #######
Port ######
Password #######
Psql ######
Url #######

