package com.sistemaRH.sistemaRH.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sistemaRH.sistemaRH.model.Candidato;
import com.sistemaRH.sistemaRH.model.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {
	
	Iterable<Candidato>findByVaga(Vaga vaga);
	
	Candidato findByRg(String rg);
	
	Candidato findById(long id);
	
	List<Candidato>findByNomeCandidato(String nomeCandidato);
}