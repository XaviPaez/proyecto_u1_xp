package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriRepository;
	
	@Override
	public void ingresarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriRepository.insertar(m);
	}

	@Override
	public Matricula buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.matriRepository.buscar(nombre);
	}

	@Override
	public void actualizarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		this.matriRepository.actualizar(e);
	}

	@Override
	public void borrarMatrcula(String nombre) {
		// TODO Auto-generated method stub
		this.matriRepository.eliminar(nombre);
	}

}
