/**
 * 
 */
package com.buenmaestro.tiendaMusicaldata.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author diegokiez
 * Clase generica que representa los métodos del CRUD que se reutilizan en todas las entidades del proyecto
 */
public class CommonDAO<E, R extends PagingAndSortingRepository<E, Long>> {
	
	@Autowired
	protected R repository;
	
	/**
	 * @author diegokiez
	 * Metodo que permite consultar una lista de datos paginable de una entidad
	 * @param desde {@link Integer} indica que a partir de que valor se obtendran los resultados
	 * @param hasta {@link Integer} indica el límite de resultados paginados a obtener
	 * @param orderBy {@link String} indica a partir de que campo se van a ordenar los registros
	 * @return {@link List} Lista con los datos consultados paginados.
	 */
	public List<E> consultarListaPaginable(int desde, int hasta, String orderBy){
		Pageable pageable = PageRequest.of(desde, hasta, Sort.by(orderBy));
		Page<E> page = this.repository.findAll(pageable);
		return page.getContent();
	}
	
	/**
	 * @author diegokiez
	 * Metodo que permite persistir la informacion de cualquier entidad 
	 * @param e {@link Object} Objeto o entidad a persistir
	 * @return {@link Object} Objeto recuperado despues de persistir el registro
	 */
	public E guardar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * @author diegokiez
	 * Metodo que permite actualizar la informacion de cualquier entidad 
	 * @param e {@link Object} Objeto o entidad a actualizar
	 * @return {@link Object} Objeto recuperado despues de actualizar el registro
	 */
	public E actualizar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * @author diegokiez
	 * Metodo que permite eliminar la informacion de cualquier entidad 
	 * @param e {@link Object} Objeto o entidad a eliminar
	 */
	public void eliminar(E e) {
		this.repository.delete(e);
	}

}
