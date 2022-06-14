package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.bodega.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;
import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {

	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

		BigDecimal interes= this.bancaria.calcularInteres("1231");
		System.out.println(interes);
		
		
	
	}

}
