package br.edu.unoesc.desafiofullstackunoesc.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.dao.DadosApiDao;
import br.edu.unoesc.desafiofullstackunoesc.model.DadosApi;

@Service @Transactional(readOnly = false)
public class DadosApiServiceImpl implements DadosApiService{

	private DadosApiDao dao;
	
	@Override
	public void salvar(DadosApi dadosApi) {
		//dao.save(dadosApi);
	}

	@Override
	public List<DadosApi> buscarTodos() {
		return dao.findAll();
	}


}
