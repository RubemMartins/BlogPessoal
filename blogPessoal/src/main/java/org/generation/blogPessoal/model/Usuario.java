package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O nome não pode estar em branco e nem ser preenchido somente por espaços.")
	@Size(min = 2, max = 100, message = "O nome deve conter entre 2 e 100 caracteres.")
	private String nome;
	
	@NotBlank(message = "O usuario não pode estar em branco e nem ser preenchido somente por espaços.")
	@Size(min = 5, max = 100, message = "O usuario deve conter entre 5 e 100 caracteres.")
	private String usuario;
	
	@NotBlank(message = "A senha não pode estar em branco e nem ser preenchido somente por espaços.")
	@Size(min = 5, max = 100, message = "A senha deve conter entre 5 e 100 caracteres.")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
