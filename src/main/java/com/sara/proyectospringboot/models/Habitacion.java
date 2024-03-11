package com.sara.proyectospringboot.models;
import java.util.List;

import jakarta.persistence.*;



@Entity
@Table(name = "habitacion")
public class Habitacion {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "numero")
    private int numero;
	
	@Column(name = "precio")
    private Double precio;
	
	@Column(name = "detalle")
    private String detalle;
	
	@Column(name = "imagen")
    private String imagen;
	
	@Column(name = "disponibilidad")
	private String dispo;
	
	@Column(name = "tipo")
    private String tipo;
	
	@ManyToOne
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    private Hotel hotel;

	@OneToMany (mappedBy = "habitacion")
	private List<Reserva> reservas;
	
	public Habitacion() {
	}


	public Habitacion(Long id, int numero, Double precio, String detalle, String imagen, String dispo, String tipo) {
		this.id = id;
		this.numero = numero;
		this.precio = precio;
		this.detalle = detalle;
		this.imagen = imagen;
		this.dispo = dispo;
		this.tipo = tipo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getDispo() {
		return dispo;
	}


	public void setDispo(String dispo) {
		this.dispo = dispo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	
}
