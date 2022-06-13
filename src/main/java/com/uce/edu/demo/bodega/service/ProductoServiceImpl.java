package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertarProducto(p);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public Producto buscar(String id) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.consultar(id);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(id);
	}

	@Override
	public List<Producto> consultar(List<Producto> lista, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
