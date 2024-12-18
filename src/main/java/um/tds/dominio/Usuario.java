package um.tds.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nombre;
	private String movil;
	private String contrasena;
	private String imagen;
	//IsPremium
	private List<Contacto> contactos;
	private Descuento descuento;
	
	public Usuario(String nombre, String movil, String contrasena, String imagen, Descuento descuento) {
		this.nombre = nombre;
		this.movil = movil;
		this.contrasena = contrasena;
		this.imagen = imagen;
		this.contactos = new ArrayList<Contacto>();
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Descuento getDescuento() {
		return descuento;
	}

	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	
}
