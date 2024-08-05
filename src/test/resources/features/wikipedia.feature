Feature: Iniciando en Wikipedia
  Yo como un usuario de wikipedia
  quiero poder crear una cuenta en wikipedia
  para así poder hacer busquedas mas personalizadas.
  Background:
    When los usuarios ingresen a la pagina principal de wikipedia

  @bienvenida
  Scenario: Bienvenida en la pagina principal de Wikipedia
    Then ellos podran visualizar un titulo de Bienvenidos a Wikipedia

  @busqueda
  Scenario: Hacer una busqueda en wikipedia y validar palabras claves durante el texto
    And le de click en el buscador y busque la palabra Sistema
    Then podra visualizar en el texto el subtitulo Analisis CEEM


