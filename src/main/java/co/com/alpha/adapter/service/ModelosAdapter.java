package co.com.alpha.adapter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.alpha.domain.model.Modelo;
import co.com.alpha.domain.service.ModelosService;
import co.com.alpha.repository.ModelosRepository;

@Service
public class ModelosAdapter implements ModelosService {

	@Autowired
	private ModelosRepository modelosRepository;

	@Override
	public List<Modelo> findAll() {
		return modelosRepository.findAll();
	}

	@Override
	public void save(Modelo modelos) {
		modelosRepository.save(modelos);

	}

	@Override
	public void ubdate(Modelo modelos) {
		modelosRepository.save(modelos);

	}

	@Override
	public void eliminarid(Integer id) {
		modelosRepository.deleteById(id);

	}

	@Override
	public void save(Modelo idMaterial, Modelo idModelo) {
		modelosRepository.save(idMaterial);
		modelosRepository.save(idModelo);
		
	}


}
