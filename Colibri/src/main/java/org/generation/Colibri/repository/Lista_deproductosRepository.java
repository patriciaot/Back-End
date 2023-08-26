package org.generation.Colibri.repository;

import java.util.Optional;

import org.generation.Colibri.model.Lista_deproductos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Lista_deproductosRepository extends JpaRepository<Lista_deproductos, Long> {
	
	Optional<Lista_deproductos> findByNombre (String lista_deproductos);
	
}//Lista_deproductosRepository
