package co.com.alpha.domain.service;

import java.util.List;

import co.com.alpha.domain.model.Cliente;


public interface ClienteService {
	
	List<Cliente> findAll();

	void save(Cliente cliente);
	
	void update(Cliente cliente);
	
	void eliminarid(Integer id);
	
}