package coop.tecso.sve.domain.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class VotarSteps {
	@Dado("^que el votante con nombre de usuario \"([^\"]*)\" se logeo ok en el sistema$")
	public void que_el_votante_con_nombre_de_usuario_se_logeo_ok_en_el_sistema(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^selecciono un voto pendiente para concejo con id (\\d+)$")
	public void selecciono_un_voto_pendiente_para_concejo_con_id(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Dado("^se definio regla con id (\\d+) que describe como maxima cantidad de elementos a seleccionar (\\d+) y minima (\\d+)$")
	public void se_definio_regla_con_id_que_describe_como_maxima_cantidad_de_elementos_a_seleccionar_y_minima(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Cuando("^selecciona (\\d+), (\\d+), (\\d+)$")
	public void selecciona(int arg1, int arg2, int arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Cuando("^presiona el botón enviar enviar$")
	public void presiona_el_botón_enviar_enviar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Entonces("^se envio el mail correctamente true$")
	public void se_envio_el_mail_correctamente_true() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Entonces("^el Votante ya no puede emitir el voto con id (\\d+)$")
	public void el_Votante_ya_no_puede_emitir_el_voto_con_id(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
