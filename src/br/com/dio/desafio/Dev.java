package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	
	public void increverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudo());
		bootcamp.getDevInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo>conteudo = this.conteudoInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		}else {
			System.out.println("voce não esta matriculado em nenhum conteudo");
		} 
	}
		
	public double calcularTotalXp() {
	return	this.conteudoConcluido.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluido, conteudoInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluido, other.conteudoConcluido)
				&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(nome, other.nome);
	}
	
		
	

}
