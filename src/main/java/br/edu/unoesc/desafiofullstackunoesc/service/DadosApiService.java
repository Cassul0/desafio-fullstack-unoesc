package br.edu.unoesc.desafiofullstackunoesc.service;

import java.util.List;

import br.edu.unoesc.desafiofullstackunoesc.model.DadosApi;

public interface DadosApiService {

	void salvar(DadosApi dadosApi);
	
	List<DadosApi> buscarTodos();
}
