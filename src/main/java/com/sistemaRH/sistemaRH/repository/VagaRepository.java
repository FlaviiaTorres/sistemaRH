package com.sistemaRH.sistemaRH.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sistemaRH.sistemaRH.model.Vaga;

public interface VagaRepository extends CrudRepository<Vaga, Long> {
	Vaga findByCodigo(long codigo);
	List<Vaga> findByNome(String nome);
}
