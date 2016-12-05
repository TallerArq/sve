package coop.tecso.sve.domain.votar;


import java.util.List;

import coop.tecso.sve.domain.base.EntityRoot;

public class Voto extends EntityRoot {
	
	private Eleccion eleccion;
	
	private List<Opcion> opcionesSeleccionadas;
}
