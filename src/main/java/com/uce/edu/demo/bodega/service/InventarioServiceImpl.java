package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.Inventario;
import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	
	@Autowired
	private IInventarioRepository iInventarioRepository;
	@Autowired
	private IProductoService iProductoService;
	
	
	@Override
	public void insertarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertarInventario(i);
	}
	@Override
	public void insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.insertarProducto(p);
	}
	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(i);
	}
	@Override
	public Inventario consultar(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.consultar(fechaIngreso);
	}
	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(id);
	}
	@Override
	public List<Inventario> consultar(List<Inventario> lista, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return null;
	}
	






}
