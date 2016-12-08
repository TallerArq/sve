package coop.tecso.sve.domain.votar;

import java.util.Date;
import java.util.List;

import coop.tecso.sve.domain.base.EntityRoot;

public class Eleccion extends EntityRoot {
	/* atributos descriptivos*/
	private String titulo;
	private String descripcion;
	private Date inicio;
	private Date fin;
	
	/* atributos de relacion */
	private Eleccion padre;	
	private List<Opcion> opciones;
	private List<Regla> reglas;
	private List<AutoridadMesa> autoridadesMesa;	
	private List<Votante> padron;
	private List<Voto> votos;
	
	public void votar(Voto voto) {
		/* 
		 * TODO: 
		 * 1- validar reglas de dominio.
		 * 2- Enviar eventos a demas contextos limitados.
		 * 3- Enviar notificaciones.
		 * 4- Cambia el estado del votante a PENDIENTE_CONFIRMACION.
		 */
		
		votos.add(voto);
	}
	
	public void confirmarVoto(String nroConfirmacion) {
		/*
		 * TODO: 
		 * 1- Cambia el estado del votante a YA_VOTO
		 * 2- Se notifica el evento a los demas contextos limitados.
		 */
	}
}
