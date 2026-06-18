package com.itsqmet.conexion_db_ves.controller;


import com.itsqmet.conexion_db_ves.model.Empleado;
import com.itsqmet.conexion_db_ves.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/empleado")
@CrossOrigin("*")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<List<Empleado>> obtenerEmpleados(){
        List<Empleado> empleados = empleadoService.obtenerEmpleados();
        return ResponseEntity.ok(empleados);
    }



}
