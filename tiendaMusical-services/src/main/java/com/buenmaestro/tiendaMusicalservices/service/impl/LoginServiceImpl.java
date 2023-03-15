/**
 * 
 */
package com.buenmaestro.tiendaMusicalservices.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buenmaestro.tiendaMusical_services.LoginService;
import com.buenmaestro.tiendaMusicaldata.dao.PersonaDAO;
import com.buenmaestro.tiendaMusicalentities.entities.Persona;

/**
 * @author diegokiez
 *
 */
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private PersonaDAO personaDAOImpl;

	@Override
	public Persona consultarUsuarioLogin(String usuario, String password) {
		
		return this.personaDAOImpl.findByUsuarioAndPassword(usuario, password);
	}

}
