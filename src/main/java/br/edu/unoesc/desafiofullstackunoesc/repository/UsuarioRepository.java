package br.edu.unoesc.desafiofullstackunoesc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query("select u from Usuario u where u.username like :username")
	Usuario findByUsername(@Param("username") String username);

}
