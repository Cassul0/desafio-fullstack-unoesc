package br.edu.unoesc.desafiofullstackunoesc.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import br.edu.unoesc.desafiofullstackunoesc.dao.UsuarioDao;
import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;

public class UsuarioServiceImpl {
	
	@Autowired
	private UsuarioDao dao;
	
	@Transactional(readOnly = false)
	public void salvar(Usuario usuario) {
		dao.save(usuario);
	}
}
