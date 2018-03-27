package server1.model;

import java.util.Calendar;
//import java.util.Date;

public class Voo {
	
	String origem;
	String destino;
	float preco;
	Calendar data_voo;
	int capacidade;

	
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Calendar getData_voo() {
		return data_voo;
	}
	public void setData_voo(Calendar data_voo) {
		this.data_voo = data_voo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
