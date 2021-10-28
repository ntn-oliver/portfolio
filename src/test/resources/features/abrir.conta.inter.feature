#Author: your.email@your.domain.com

@tag
Feature: abrir conta digital no banco inter
 como usuario quero enviar o formulario de abertura de conta para abrir  uma nova conta

  @tag1
  Scenario: Enviar formulario de abertura de conta
    Given que eu acesse o site do banco inter "https://www.bancointer.com.br/"
    When clico em abrir sua conta
    And digitar o nome "Adriano Santos Silva"
    And digitar o telefone "11985688598"
    And digitar o email "adriano1231@hotmail.com"
    And digitar o cpf "52395577057"
    And digitar a data de nascimento "20081990"
    And clico em autorizar politica de privacidade
    And clico no botao continuar do do formulario
    Then formulario enviado com sucesso
   
    
    
    
   
 