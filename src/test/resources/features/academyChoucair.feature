#language: es
#Autor: Neyla Martinez

@Historia
Característica: Academia Choucair
Como Usuraio, quiero aprender a automatizar en screamplay
en la academia choucair con el curso de automatizacion
  @Escenario1:
  Escenario: Burcar un curso de automatizacion
    Dado que Neyla quiere aprender automatizacion en la academia Choucair
      | usuario    | password   |
      | nmartinezd | F62856far1 |
    Cuando el busca el curso en la plataforma de la academia Choucair
      | course                    |
      | Automatización de Pruebas |
    Entonces el encuentra el curso llamado
      | course                    |
      | Automatización de Pruebas |