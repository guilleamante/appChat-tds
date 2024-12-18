package um.tds.dominio;

import java.util.List;

public class Contacto {
	
	private List<Mensaje> mensajes;
	
	public Contacto(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public List<Mensaje> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
}
