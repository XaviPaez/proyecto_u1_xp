package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriRepository;
	
	@Autowired
	private ProfesorGeneral general;
	
	@Autowired
	private ProfesorMateria materia;
	
	private Materia materia1;
	@Override
	public void ingresarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Singelton "+ this.general);
		System.out.println("DI desde Prototype "+ this.materia);
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
