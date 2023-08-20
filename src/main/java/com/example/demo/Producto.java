package com.example.demo;


import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;

@Entity
public class Producto {

    private @Id @GeneratedValue Long id;

	private String nombre;
    private double precio;

    
    public Producto(){}

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Producto p = (Producto) o;
		return Objects.equals(id, p.id) &&
			Objects.equals(nombre, p.nombre)&&
            Objects.equals(precio, p.precio);
	}	

	@Override
	public int hashCode() {

		return Objects.hash(id, nombre, precio);
	}

	@Override
	public String toString() {
		return "Producto{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
            ", precio='" + precio + '\'' +
			'}';
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
