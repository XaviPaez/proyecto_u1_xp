package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Bidi;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Autowired
	private IInventarioService inventarioService;
	
	@Override
	public void ingresarProducto(List<Producto> listaProductos) {
		// TODO Auto-generated method stub
		List<Producto> lista=new ArrayList<>();
		Inventario inventario=new Inventario();
		for(Producto producto : listaProductos) {
			producto.setPrecioVenta(producto.getPrecioCompra().add(producto.getPrecioCompra().multiply(new BigDecimal(0.1)).add(producto.getPrecioCompra().multiply(new BigDecimal(0.12)))).setScale(2,  RoundingMode.FLOOR));
		lista.add(producto);
	
		}
		
		inventario.setInventario(lista);
		this.inventarioService.insertarInventario(inventario);

	}

	@Override
	public Inventario buscarInventario(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		List<Producto> lista=new ArrayList<>();
		Inventario inventario=new Inventario();
		inventario=inventarioService.consultar(fechaIngreso);
		List<Producto> listaProductos = inventario.getInventario();
	
		for (Producto producto:listaProductos) {
			if(producto.getFechaIngreso().isAfter(fechaIngreso)||producto.getFechaIngreso().isEqual(fechaIngreso)) {
				lista.add(producto);
			}
		}
		inventario.setInventario(lista);
		return inventario;
	}

	@Override
	public Inventario transformar(Producto p) {
		// TODO Auto-generated method stub
		return this.transformar(p);
	}

}
