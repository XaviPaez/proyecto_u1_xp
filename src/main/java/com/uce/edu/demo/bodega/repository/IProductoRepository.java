package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.Producto;

public interface IProductoRepository {

	public void insertarProducto(Producto p);
	
	public void actualizar(Producto p);
	
	public  Producto consultar(String id);
	
	public void eliminar(String id);
	

}
