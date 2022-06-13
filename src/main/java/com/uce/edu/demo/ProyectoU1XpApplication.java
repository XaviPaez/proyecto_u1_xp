package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {

	@Autowired
	private IInventarioService iInventarioService;
	@Autowired
	private IGestorInventarioService gestorInventarioService;
	@Autowired
	private IProductoService iProductoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("MEGA SANTA MARIA");
		System.out.println();
		List<Producto> lista=new ArrayList<Producto>();
		Producto producto=new Producto();
		Producto producto2=new Producto();
		Producto producto3=new Producto();
		Producto producto4=new Producto();
		Producto producto5=new Producto();
		System.out.println();
		
		producto.setCantidad(22);
		producto.setNombre("Coca-Cola");
		producto.setCodigo("123");
		producto.setFechaIngreso(LocalDateTime.of(2022, 4, 13, 2, 0));
		producto.setPrecioVenta(new BigDecimal(1.50));
		this.iProductoService.insertar(producto);
		System.out.println();
		
		producto2.setCantidad(12);
		producto2.setNombre("Ruffles");
		producto2.setCodigo("1234");
		producto2.setFechaIngreso(LocalDateTime.of(2022, 5, 13, 2, 0));
		producto2.setPrecioVenta(new BigDecimal(0.50));
		this.iProductoService.insertar(producto2);
		System.out.println();
	
		producto3.setCantidad(22);
		producto3.setNombre("Galletas Amor");
		producto3.setCodigo("12345");
		producto3.setFechaIngreso(LocalDateTime.of(2022, 6, 3, 2, 0));
		producto3.setPrecioVenta(new BigDecimal(1.25));
		this.iProductoService.insertar(producto3);
		System.out.println();
		
		producto4.setCantidad(22);
		producto4.setNombre("Doritos");
		producto4.setCodigo("123456");
		producto4.setFechaIngreso(LocalDateTime.of(2022, 6, 1, 4, 0));
		producto4.setPrecioVenta(new BigDecimal(1.0));
		this.iProductoService.insertar(producto4);
		System.out.println();
		
		producto5.setCantidad(22);
		producto5.setNombre("Aceite");
		producto5.setCodigo("1234567");
		producto5.setFechaIngreso(LocalDateTime.of(2022, 6, 5, 10, 0));
		producto5.setPrecioVenta(new BigDecimal(4.50));
		this.iProductoService.insertar(producto5);
		
		System.out.println();
		lista.add(producto);
		lista.add(producto2);
		lista.add(producto3);
		lista.add(producto4);
		lista.add(producto5);
		System.out.println();
		
		System.out.println(this.gestorInventarioService.buscarInventario(LocalDateTime.of(2022, 4,5,10,0)));
		
	
	}

}
