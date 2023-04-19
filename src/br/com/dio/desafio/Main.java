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

	/*	System.out.println(curso );
		System.out.println(curso3 );
		System.out.println("");
		System.out.println(curso2 );
		System.out.println(mentoria ); */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java devolop");
		bootcamp.setDescricao("descrição bootcamp java devolop");
		bootcamp.getConteudo().add(curso);
		bootcamp.getConteudo().add(curso2);
		bootcamp.getConteudo().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.increverBootcamp(bootcamp);
		System.out.println("conteudos incritos do Aluno(a) : " + devCamila.getNome()+" " + devCamila.getConteudoInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("conteudos incritos do Aluno(a) : " + devCamila.getNome()+" " + devCamila.getConteudoInscritos());
		System.out.println("conteudos concluidos" + devCamila.getConteudoConcluido());
		System.out.println("XP "+ devCamila.calcularTotalXp());
		
		System.out.println("-------------------------------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.increverBootcamp(bootcamp);
		System.out.println("conteudos incritos do Aluno(a) : " +devJoao.getNome()+" " + devJoao.getConteudoInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("conteudos incritos do Aluno(a) : " +devJoao.getNome()+" " + devJoao.getConteudoInscritos());
		System.out.println("conteudos concluidos" + devJoao.getConteudoConcluido());
		System.out.println("XP "+ devJoao.calcularTotalXp());
		
	}

}
