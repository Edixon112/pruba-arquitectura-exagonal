package co.com.alpha.domain.service;

import java.util.List;

import co.com.alpha.domain.model.Material;


public interface MaterialService {
	
	List<Material> findAll();
	
	void save(Material material);
	
	void update(Material material);
	
	void eliminarid(Integer id);

}
