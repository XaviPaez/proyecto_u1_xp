package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;

public interface IInventarioService {

	public void insertarInventario(Inventario i);
	
	public void insertarProducto(Producto p);
	
	public void actualizar(Inventario i);
	
	public  Inventario consultar(LocalDateTime fechaIngreso);
	
	public void eliminar(String id);
	
	public List<Inventario> consultar(List<Inventario> lista, LocalDateTime fecha);
}
