package com.uce.edu.demo.bodega;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {
	
	private String nombre;
	private LocalDateTime fechaIngreso;
	private int cantidadProductos;
	private List<Producto> inventario ;
	


	
	//SET Y GET
	
	
	

	@Override
	public String toString() {
		return "Inventario [nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + ", cantidadProductos="
				+ cantidadProductos + ", inventario=" + inventario + "]";
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public List<Producto> getInventario() {
		return inventario;
	}
	public void setInventario(List<Producto> inventario) {
		this.inventario = inventario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	

	
	
	
}
