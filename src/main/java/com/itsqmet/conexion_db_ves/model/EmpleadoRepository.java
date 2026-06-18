package com.itsqmet.conexion_db_ves.model;

import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Log> {

    List<Empleado> findByNombre(String nombre);
}
