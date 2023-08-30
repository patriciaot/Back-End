package org.generation.Colibri.repository;

import java.util.Optional;

import org.generation.Colibri.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository2 extends JpaRepository<Productos, Long> {
Optional<Productos> findByNombre (String nombre);

}//interface ProductosRepository
