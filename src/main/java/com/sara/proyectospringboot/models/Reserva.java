package com.sara.proyectospringboot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "fechaEntrada")
    private String fechaEntrada;
	
	@Column(name = "fechaSalida")
    private String fechaSalida;
	
	@Column(name = "precio")
    private Double precio;
	
	@Column(name = "estado")
    private String estado;
	
	@Column(name = "checkIn")
    private String checkIn;
	
	@Column(name = "checkOut")
    private String checkOut;
	
	@ManyToOne
    @JoinColumn(name = "habitacion_id", referencedColumnName = "id")
    private Habitacion habitacion;

	public Reserva() {
	}



	public Reserva(Long id, String fechaEntrada, String fechaSalida, Double precio, String estado, String checkIn,
			String checkOut) {
		super();
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.precio = precio;
		this.estado = estado;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFechaEntrada() {
		return fechaEntrada;
	}



	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}



	public String getFechaSalida() {
		return fechaSalida;
	}



	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getCheckIn() {
		return checkIn;
	}



	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}



	public String getCheckOut() {
		return checkOut;
	}



	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	
	
}