package client.model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
//import java.util.Date;

public class Usuario {
	
	
	//int id;
	String nome;
	String sobrenome;
	Calendar dataNascimento;
	String cpf;
	String senha;
	List<Reserva> reservas;
	
	public Usuario() {
		nome = "";
		sobrenome = "";
		dataNascimento = Calendar.getInstance();
		cpf = "";
	} 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
