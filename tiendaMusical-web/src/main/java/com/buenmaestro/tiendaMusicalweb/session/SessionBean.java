/**
 * 
 */
package com.buenmaestro.tiendaMusicalweb.session;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.buenmaestro.tiendaMusicalentities.entities.Persona;

/**
 * @author diegokiez
 * Clase que mantendrá la información en la sesión del usuario
 */
@ManagedBean
@SessionScoped
public class SessionBean {
	
	private Persona persona;
	
	public void init() {
		System.out.println("Creando sesion....");
	}

	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
