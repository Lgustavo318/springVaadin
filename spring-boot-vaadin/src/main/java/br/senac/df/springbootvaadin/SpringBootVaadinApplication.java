package br.senac.df.springbootvaadin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.senac.df.springbootvaadin.dao.pessoaRepositorio;
import br.senac.df.springbootvaadin.model.Pessoa;

@SpringBootApplication
public class SpringBootVaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVaadinApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner loadData(pessoaRepositorio repository) {
        return (args) -> {
            // Add some data to database
            repository.save(new Pessoa(1,"Michel", "Ivan","@gmail"));
            repository.save(new Pessoa(2,"Taissa", "Klein", "@gmail"));
        };
    }


}
