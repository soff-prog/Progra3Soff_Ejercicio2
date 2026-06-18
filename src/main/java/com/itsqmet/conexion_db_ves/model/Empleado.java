package com.itsqmet.conexion_db_ves.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.*;

@Entity
@Table(name = "empleados")

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El campo nombre no puede estar vacio")
    @Size(min = 5, max = 10, message = ("El nombre no cumple con el rango de caracteres de 5-10"))
    @Column(nullable = false)
    private String nombre;

    @NotBlank(message = "El campo apellido no puede estar vacio")
    @Size(min = 5, max = 20, message = ("El apellido no cumple con el rango de caracteres de 5-10"))
    @Column(nullable = false)
    private String apellido;

    @NotBlank(message = "El número de cédula es obligatorio")
    @Size(min = 10, max = 10, message = "La cédula debe tener 10 dígitos")
    @Column(unique = true, nullable = false)
    private String cedula;

    @NotBlank(message = "El correo electrónico es obligatorio")
    @Email(message = "Debe ser un correo válido")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "El teléfono es obligatorio")
    @Size(min = 7, max = 15, message = "El teléfono debe tener entre 7 y 15 dígitos")
    private String telefono;

    public Empleado() {

    }

    public Empleado(Long id, String nombre, String apellido, String cedula, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
