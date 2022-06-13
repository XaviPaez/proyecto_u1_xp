package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.Producto;

public interface IProductoService {

	public void insertar(Producto p);
	
	public void actualizar(Producto p);
	
	public  Producto buscar(String id);
	
	public void eliminar(String id);
	
	public List<Producto> consultar(List<Producto> lista, LocalDateTime fecha);

}
