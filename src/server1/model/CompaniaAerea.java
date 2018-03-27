package server1.model;

import java.util.List;

public class CompaniaAerea {
	List<Voo> voos;
	String nomeComp;

	public List<Voo> getVoos() {
		return voos;
	}
	public void setVoos(List<Voo> voos) {
		this.voos = voos;
	}
	public String getNomeComp() {
		return nomeComp;
	}
	public void setNomeComp(String nomeComp) {
		this.nomeComp = nomeComp;
	}

}
