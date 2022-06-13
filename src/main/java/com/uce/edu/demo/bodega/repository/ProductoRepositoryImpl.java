package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el producto a la base de datos: "+ p);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el producto: "+p);
	}

	@Override
	public Producto consultar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el producto: "+ id);
		Producto producto=new Producto();
		producto.setCodigo(id);
		return producto;
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el producto: "+ id);
	}


	}


