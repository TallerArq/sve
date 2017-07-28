# language: es
Característica: votar
  Para emitir un voto de una elección
  Como un Votante
  Quiero elegir opciones de acuerdo a las reglas definidas para la elección

  Esquema del escenario: Votar de acuerdo a regla
    Dado que el votante con nombre de usuario "<nombreUsuario>" se logeo ok en el sistema
    Y selecciono un voto pendiente con <cantidadOpciones> opciones posibles
    Y se definio regla que describe como maxima cantidad de elementos a seleccionar <maximoSeleccionables> y minima <minimosSeleccionables>
    Cuando selecciona <opciones>
    Y presiona el botón "<boton>"
    Entonces se genero correctame un nro unico de confirmacion
    Y se envio la notificacion correctamente de acuerdo al "<tipoDeContacto>" establecido por el votante
    Y el Votante ya no puede emitir el voto

    Ejemplos: 
      | nombreUsuario | cantidadOpciones | maximoSeleccionables | minimosSeleccionables | opciones | boton  | tipoDeContacto |
      | franco.sabino |                5 |                    3 |                     0 | 1, 2, 3  | enviar | mail           |
      | franco.sabino |                5 |                    3 |                     0 | 1, 2     | enviar | whatsapp       |
      | franco.sabino |                5 |                    3 |                     0 | 2, 3     | enviar | sms            |
      | franco.sabino |                3 |                    2 |                     0 | 1, 3     | enviar | mail           |
      | franco.sabino |                2 |                    2 |                     0 |        2 | enviar | mail           |
      | franco.sabino |                1 |                    1 |                     0 |          | enviar | mail           |
