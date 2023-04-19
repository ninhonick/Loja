package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setTitulo("Java");
		curso.setDescricao("descricao do java agora");
		curso.setCargaHoraria(8);
		
		Curso curso2 = new Curso ();
		curso2.setTitulo("javascrip");
		curso2.setDescricao(" descricao js");
		curso2.setCargaHoraria(4);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("github");
		curso3.setDescricao("mais um exemplo de curso");
		curso3.setCargaHoraria(6);
		
		
		Mentoria mentoria =new Mentoria ();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao ment");
		mentoria.setData(LocalDate.now());

		System.out.println(curso );
		System.out.println(curso3 );
		System.out.println("");
		System.out.println(curso2 );
		System.out.println(mentoria );
	}

}
