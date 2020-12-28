package co.com.alpha.adapter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.alpha.domain.model.Material;
import co.com.alpha.domain.service.MaterialService;
import co.com.alpha.repository.MaterialRepository;

@Service
public class MaterialAdapter implements MaterialService {

	@Autowired
	private MaterialRepository materialRepository;

	@Override
	public List<Material> findAll() {
		return materialRepository.findAll();
	}

	@Override
	public void save(Material material) {
		materialRepository.save(material);

	}

	@Override
	public void update(Material material) {
		materialRepository.save(material);
	}

	@Override
	public void eliminarid(Integer id) {
		materialRepository.deleteById(id);

	}

}
