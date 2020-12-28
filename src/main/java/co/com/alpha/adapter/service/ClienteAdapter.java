package co.com.alpha.adapter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.alpha.domain.model.Cliente;
import co.com.alpha.domain.service.ClienteService;
import co.com.alpha.repository.ClienteRepository;


@Service
public class ClienteAdapter implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public void save(Cliente cliente) {
		clienteRepository.save(cliente);
		
	}
	
	@Override
	public void update(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	public void eliminarid(Integer id) {
		clienteRepository.deleteById(id);
		
	}
	
}