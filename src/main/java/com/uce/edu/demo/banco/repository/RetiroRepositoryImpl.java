package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;


@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertarRetiro(Retiro d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el retiro: " + d);
	}

	@Override
	public void actualizar(Retiro d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el retiro: " + d);

	}

	@Override
	public Retiro buscar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("Se busca el retiro: "+ numero);
		Retiro retiro=new Retiro();
		retiro.setNumeroCuenta(numero);
		return retiro;
	
	}

	@Override
	public void eliminar(String identidicador) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el retiro: "+ identidicador);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiros=new ArrayList<>();
		
		Retiro reti1=new Retiro();
		reti1.setFecha(LocalDateTime.of(2022, 12, 20, 13, 34,10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumeroCuenta("1239");
		listaRetiros.add(reti1);
		
		return listaRetiros;
	}

}
