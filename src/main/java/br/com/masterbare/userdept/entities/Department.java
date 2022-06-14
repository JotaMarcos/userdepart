package br.com.masterbare.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Criado o mapeamento (do objeto relacional das classes) da classe Department para ser convertida na tabela tb_department no banco de dados*/

@Entity
@Table(name = "tb_department")
public class Department {
	
	// Declaração das variáveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	/*	Declaração do Construtor -> Classe pode ser instanciada 
		sem passar nenhum argumento
	*/
	public Department() {
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
	
	
	
	
}
