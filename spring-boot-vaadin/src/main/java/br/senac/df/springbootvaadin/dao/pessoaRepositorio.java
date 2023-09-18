package br.senac.df.springbootvaadin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.df.springbootvaadin.model.Pessoa;

public interface pessoaRepositorio extends JpaRepository<Pessoa, Long> {
	
}
