package com.sara.proyectospringboot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;
    
    @Column(name = "dni")
    private String dni;
    
    @Column(name = "phoneNumber")
    private String phoneNumber;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    
    @ManyToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "id")
    private Rol rol;

	public Usuario() {
		
	}

	public Usuario(Long id, String name, String lastname, String dni, String phoneNumber, String email, String password, Rol rol) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.rol = rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
