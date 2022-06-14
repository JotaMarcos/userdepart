package br.com.masterbare.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// Criado o mapeamento (do objeto relacional das classes) da classe User para ser convertida na tabela tb_user no banco de dados

@Entity
@Table(name = "tb_users")

public class User {
	
	// Declaração das variáveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	
	/*	Cria a relação com a classe Department, ou seja,
		cria a relação entre entidades 
	*/
	
	@ManyToOne
	@JoinColumn(name = "department_id") // Configura o nome da chave estrangeira no banco de dados
	private Department department;
	
	/*
		Declaração do Construtor -> Classe pode ser instanciada
		sem passar nenhum argumento
	*/
	public User() {
	}
	
	// Criando os métodos de acesso
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
		

}
