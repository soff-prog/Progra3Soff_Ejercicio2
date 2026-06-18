package com.itsqmet.conexion_db_ves.service;

import com.itsqmet.conexion_db_ves.model.Empleado;
import com.itsqmet.conexion_db_ves.model.EmpleadoRepository;
import com.itsqmet.conexion_db_ves.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> buscarporId(Long id){
        return empleadoRepository.findById(id);
    }

    public Empleado crearempelado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }
}
