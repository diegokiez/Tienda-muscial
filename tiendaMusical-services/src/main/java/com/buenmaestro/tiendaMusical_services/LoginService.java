/**
 * 
 */
package com.buenmaestro.tiendaMusical_services;

import com.buenmaestro.tiendaMusicalentities.entities.Persona;

/**
 * @author diegokiez
 *
 */
public interface LoginService {
	
	/**
	 * @author diegokiez
	 * Metodo que permite consultar un usuario que trata de ingresar a sesion en la tienda musical
	 * @param usuario {@link String} usuario capturado por la persona
	 * @param password {@link String} contraseña capturada por la persona
	 * @return {@link Persona} usuario encontrado en la base de datos
	 * 
	 */
	Persona consultarUsuarioLogin(String usuario, String password);

}
