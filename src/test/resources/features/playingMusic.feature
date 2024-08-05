Feature: Reproduciendo música en Yotube
  Yo como un usuario de Youtube
  quiero poder reproducir la canción 'Locked out of heaven'
  para validar el titulo en la pantalla

  Background:
    Given el usuario ingresa a la pagina principal de youtube
  @VerificarNombre
  Scenario Outline: Validar Nombre de la cancion
    When el usuario le de click en buscar la cancion por su <nombre>
    Then el usuario podra ver que el titulo en pantalla coincide con el <nombre>
    Examples:
      |nombre  |
      |Locked Out Of Heaven |

  @AccederYoutube
  Scenario: Acceder con cuenta a Youtube
    When el usuario ingresa los datos del formulario
    Then el usuario podra ver la pantalla de validar cuenta
