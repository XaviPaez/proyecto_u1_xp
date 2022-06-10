package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication

public class ProyectoU1XpApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private IDepositoService depositoService;
	@Autowired
	private IRetiroService retiroService;
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1XpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("CUENTA BANCARIA"+"\n");
		
		CuentaBancaria bancaria=new CuentaBancaria();
		bancaria.setNumero("123");
		bancaria.setSaldo(new BigDecimal(100));
		this.bancariaService.insertar(bancaria);
		this.bancariaService.actualizar(bancaria);
		this.bancariaService.buscar("XAV123");
		this.bancariaService.eliminar("Xav123");
		
		System.out.println("");
		
		System.out.println("TRANSFERENCIA"+"\n");
		
		Transferencia transferencia=new Transferencia();
		transferencia.setNumeroCuentaDestino("12");
		transferencia.setNumeroCuentaOrigen("13");
		transferencia.setMontoTransferir(new BigDecimal(20));
		transferencia.setFechaTransferencia(LocalDateTime.now());
		this.iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		this.iTransferenciaService.buscarTransferencia("TRANSFER001");
		this.iTransferenciaService.actualizarTransferencia(transferencia);
		this.iTransferenciaService.eliminarTransferencia("1231231");
		System.out.println("");
		
		System.out.println("DEPOSITO"+"\n");
		Deposito deposito=new Deposito();
		deposito.setNumeroCuentaDestino("14");
		deposito.setMonto(new BigDecimal(50));
		deposito.setFecha(LocalDateTime.now());
		this.depositoService.realizarDeposito("14", new BigDecimal(50));
		this.depositoService.actualizarDeposito(deposito);
		this.depositoService.buscarDeposito("123DEP");
		this.depositoService.eliminarDeposito("123DEP");
		System.out.println("");
		
		System.out.println("RETIRO"+"\n");
		this.retiroService.realizarRetiro("11", new BigDecimal(80));
		Retiro retiro=new Retiro();
		retiro.setNumeroCuenta("11");
		retiro.setMonto(new BigDecimal(80));
		retiro.setFecha(LocalDateTime.now());
		this.retiroService.actualizarRetiro(retiro);
		this.retiroService.buscarRetiro("123RET");
		this.retiroService.eliminarRetiro("123RET");
		System.out.println("");
	
	}

}
