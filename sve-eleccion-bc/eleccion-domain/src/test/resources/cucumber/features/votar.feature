# language: es
Característica: votar
  Para emitir un voto de una elección
  Como un Votante
  Quiero elegir opciones de acuerdo a las reglas definidas para la elección

  Esquema del escenario: Votar de acuerdo a regla
    Dado que el votante con nombre de usuario "<nombreUsuario>" se logeo ok en el sistema
    Y selecciono un voto pendiente para concejo con id <idVoto>
    Y se definio regla con id <idRegla> que describe como maxima cantidad de elementos a seleccionar <maximoSeleccionables> y minima <minimosSeleccionables>
    Cuando selecciona <opciones>
    Y presiona el botón "<boton>" enviar
    Entonces se envio el mail correctamente <correctamente>
    Y el Votante ya no puede emitir el voto con id <idVoto>

    Ejemplos: 
      | nombreUsuario | idVoto | idRegla | maximoSeleccionables | minimosSeleccionables | opciones | boton  | correctamente |
      | franco.sabino |      1 |       1 |                    3 |                     0 | 1, 2, 3  | enviar | true          |
