package com.miapp.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ListaReproduccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String descripcion;

	@ManyToMany
	@JoinTable(name = "cancion_lista_reproduccion", 
	joinColumns = @JoinColumn(name = "lista_reproduccion_id"), 
	inverseJoinColumns = @JoinColumn(name = "cancion_id"))
	private List<Cancion> canciones = new ArrayList<>();

}
