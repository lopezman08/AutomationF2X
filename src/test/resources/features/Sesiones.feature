Feature: Funcionalidades seccion Sesiones del modulo de Administracion
  Description: Yo como usuario quiero usar ejecutar las diferentes funcionalidades de la seccion Sesiones para validar su correcto funcionamiento

  Background: 
    Given El usuario esta en la pagina de inicio de sesion de F2XT10
    When Ingresa las credenciales "F2XOL" y "1234"
    Then Inicia sesion exitosamente y visualiza el nombre del usuario "F2XOL"

  Scenario: Anular sesion de un usuario con nivel mayor al propio
    Given El usuario inicia sesion exitosamente y esta ubicado en la pagina principal del Modulo de Administracion
    And selecciona la opcion Sesiones y visualiza el listado de usuarios
    When Marca con un check una de las sesiones del listado que posee mayor nivel al propio
    And despliega el menu de acciones y selecciona la opcion Anular sesion de usuario
    And selecciona la opcion Aceptar del mensaje que pregunta si esta seguro de terminar la sesion del usuario seleccionado
    Then visualiza un nuevo mensaje con el texto No puede anular la sesión de un Usuario con un nivel mayor al propio
    And selecciona el boton Ok del mensaje y es direccionado nuevamente al listado de sesiones
@test
  Scenario: Anular dos sesiones de usuario que estan marcadas
    Given El usuario inicia sesion exitosamente y esta ubicado en la pagina principal del Modulo de Administracion
    And selecciona la opcion Sesiones y visualiza el listado de usuarios
    When Marca con un check dos de las sesiones del listado
    And despliega el menu de acciones
    Then No puede seleccionar la opcion Anular sesion de usuario debido a que se encuentra deshabilitada
    
