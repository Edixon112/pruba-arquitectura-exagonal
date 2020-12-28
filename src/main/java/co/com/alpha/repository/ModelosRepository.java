package co.com.alpha.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import co.com.alpha.domain.model.Modelo;

public interface ModelosRepository extends JpaRepository<Modelo, Integer> {


}
