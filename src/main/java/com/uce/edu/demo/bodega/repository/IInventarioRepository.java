package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;

public interface IInventarioRepository {

	public void insertarInventario(Inventario i);
	
	public void insertarProducto(Producto p);
	
	public void actualizar(Inventario i);
	
	public  Inventario consultar(LocalDateTime fechaIngreso);
	
	public void eliminar(String id);
	

}
