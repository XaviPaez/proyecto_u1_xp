package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface IDepositoRepository {

	public void insertarDeposito(Deposito d);

	public void actualizar(Deposito d);

	public Deposito buscar(String numero);

	public void eliminar(String identidicador);

	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
