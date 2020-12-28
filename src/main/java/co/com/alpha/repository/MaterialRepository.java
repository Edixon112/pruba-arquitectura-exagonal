package co.com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.alpha.domain.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer> {
	

}
