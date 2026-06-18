package com.itsqmet.conexion_db_ves.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoria(String categoria);

    List<Producto> findByNombre(String nombre);

    List<Producto> findByCategoriaAndPrecioLeesthanEqual(String categoria, Double precio);

}
