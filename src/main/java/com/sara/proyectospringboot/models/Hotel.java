package com.sara.proyectospringboot.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "nombre")
    private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "clasificacion")
	private String clasificacion;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@OneToMany (mappedBy = "hotel")
	private List<Habitacion> habitaciones;
	
	public Hotel() {
	
	}
	
	public Hotel(String nombre, String direccion, String clasificacion, String imagen, String ciudad ) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.clasificacion = clasificacion;
		this.imagen = imagen;
		this.ciudad = ciudad;	
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	
}
