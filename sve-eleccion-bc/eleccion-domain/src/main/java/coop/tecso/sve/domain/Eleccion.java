package coop.tecso.sve.domain;

import java.util.Date;
import java.util.List;

import coop.tecso.sve.domain.base.Entity;

public abstract class Eleccion extends Entity {
	private Date inicio;
	private Date fin;

	private List<Candidato> candidatos;
	private Padron padron;

	private List<Voto> urna;

	public abstract void comenzar();

	public abstract void reprogramar(Date inicio, Date fin);

	/**
	 * Obtiene un voto en blanco sobre el cual el votante va a seleccionar uno o
	 * mas candidatos dependiendo de las reglas definidas para la eleccion.
	 * 
	 * @param votante
	 * @return
	 */
	public abstract Voto getVoto(Votante votante);

	/**
	 * El votante emite su voto, el voto refleja ahora la decision del votante.
	 * Probablemente el voto ya no va a ser mas "voto en blanco".
	 * 
	 * @param voto
	 * @param firmaVotante
	 * @return
	 */
	public abstract void emitirVoto(Voto voto);

	/**
	 * Tras emitir el voto, el votante debe confirmarlo a traves de su firma.
	 * 
	 * @param firma
	 * @return Comprobante que va ser entregado al votante certificando su
	 *         votacion.
	 */
	public abstract ComprobanteVotacion firmarPadron(Firma firma);
}
