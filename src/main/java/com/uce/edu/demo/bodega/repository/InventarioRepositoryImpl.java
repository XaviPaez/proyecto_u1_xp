package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el inventario en la base de datos: "+ i);
	
	}

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un producto en el inventario: "+ p);
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el inventario: "+ i);
	}

	@Override
	public Inventario consultar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el inventario desde la fecha: "+ fechaIngreso);
		List<Producto> listaproductos=new ArrayList<Producto>();
		List<Producto> listaFinal=new ArrayList<Producto>();
		Inventario inventario=new Inventario();	
		Producto producto=new Producto();

	
		producto.setCantidad(22);
		producto.setNombre("Coca-Cola");
		producto.setCodigo("123");
		producto.setFechaIngreso(LocalDateTime.of(2022, 4, 13, 2, 0));
		producto.setPrecioVenta(new BigDecimal(1.50));
		
		listaproductos.add(producto);
	
	
		inventario.setInventario(listaFinal);
		return inventario;
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el inventario: "+ id);
	}



}
