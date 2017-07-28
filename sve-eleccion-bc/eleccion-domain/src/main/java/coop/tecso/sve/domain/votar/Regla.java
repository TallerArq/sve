package coop.tecso.sve.domain.votar;

import coop.tecso.sve.domain.base.Entity;

public abstract class Regla extends Entity {
	private String titulo;
	private String descripcion;
	private String codigo;
	
	public abstract boolean run();
}
