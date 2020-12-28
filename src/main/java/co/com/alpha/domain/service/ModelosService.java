package co.com.alpha.domain.service;

import java.util.List;

import co.com.alpha.domain.model.Modelo;

public interface ModelosService {

	List<Modelo> findAll();
	
	void save(Modelo modelos);
	
	void ubdate(Modelo modelos);
	
	void eliminarid(Integer id);

	void save(Modelo idMaterial, Modelo idModelo);
	

}
