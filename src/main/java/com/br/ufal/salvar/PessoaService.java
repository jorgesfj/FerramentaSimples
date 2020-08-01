package com.br.ufal.salvar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository repository;
	
	public List<Pessoa> findAll(){
		return repository.findAll();
	}
	
	public Pessoa save(Pessoa pessoa) {
		return repository.save(pessoa);
	}
}
