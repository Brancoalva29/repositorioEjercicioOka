
@Login
Feature: CP01 - Validar inicio de sesion

  Background: Validar el incio de sesion con credenciales validas e invalidas

  @LoginUsuarioValido
  Scenario: Login con usuario válido
    Given El usuario ingresa a la pagina
    When ingresa credenciales validas
    Then Se debe logear de manera correcta

  @LoginUsuarioInvalido
  Scenario: Login con usuario inválido
    Given El usuario ingresa a la pagina
    When credenciales invalidas
    Then Se debe logear de manera incorrecta

