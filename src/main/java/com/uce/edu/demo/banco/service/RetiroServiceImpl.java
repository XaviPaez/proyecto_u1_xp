package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository iRetiroRepository;
	
	
	@Override
	public void realizarRetiro(String numeroCta, BigDecimal monto) {

		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.subtract(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Retiro retiro=new Retiro();
		retiro.setFecha(LocalDateTime.now());
		retiro.setNumeroCuenta(numeroCta);
		retiro.setMonto(monto);
		this.iRetiroRepository.insertarRetiro(retiro);
		
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizar(r);
	}

	@Override
	public Retiro buscarRetiro(String identidicador) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.buscar(identidicador);
	}

	@Override
	public void eliminarRetiro(String identificador) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.eliminar(identificador);
	}

}
