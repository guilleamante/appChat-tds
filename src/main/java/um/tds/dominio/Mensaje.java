package um.tds.dominio;

import java.time.LocalTime;

public class Mensaje {
	
	private String texto;
	private LocalTime hora;
	//emoticono
	//tipo
	
	public Mensaje(String texto, LocalTime hora) {
		this.texto = texto;
		this.hora = hora;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
}
