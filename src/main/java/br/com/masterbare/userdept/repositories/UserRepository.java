package br.com.masterbare.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.masterbare.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
