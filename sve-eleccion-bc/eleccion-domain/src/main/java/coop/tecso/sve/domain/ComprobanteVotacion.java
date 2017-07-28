package coop.tecso.sve.domain;

import coop.tecso.sve.domain.base.ValueObject;

public class ComprobanteVotacion extends ValueObject {
	private Votante votante;
	private Eleccion eleccion;
	private Firma firmaAutoridad;
}
