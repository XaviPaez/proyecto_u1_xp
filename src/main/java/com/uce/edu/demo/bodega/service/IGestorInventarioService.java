package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;

public interface IGestorInventarioService {

	public void ingresarProducto(List<Producto> listaProductos);
	
	public Inventario buscarInventario(LocalDateTime fechaIngreso);
	
	public Inventario transformar(Producto p);
}
