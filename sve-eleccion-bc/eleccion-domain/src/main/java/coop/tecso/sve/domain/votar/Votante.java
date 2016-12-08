package coop.tecso.sve.domain.votar;

import coop.tecso.sve.domain.base.Entity;

public class Votante extends Entity {
	private Usuario usuario;
	private Eleccion eleccion;
	
	private EstadoVotacion estado;
}
