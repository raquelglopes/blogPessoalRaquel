package org.generation.blogPessoalRaquel.repository;

import java.util.List;

import org.generation.blogPessoalRaquel.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long> { 
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
