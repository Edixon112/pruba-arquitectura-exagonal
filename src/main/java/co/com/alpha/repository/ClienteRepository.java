package co.com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.alpha.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	
}