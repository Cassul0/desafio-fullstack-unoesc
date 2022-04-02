package br.edu.unoesc.desafiofullstackunoesc.dao;

import java.util.List;

import br.edu.unoesc.desafiofullstackunoesc.model.DadosApi;

public interface DadosApiDao {

	void save(DadosApi dadosApi);

	List<DadosApi> findAll();
}
