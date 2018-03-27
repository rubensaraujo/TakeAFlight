package client.view;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import client.controller.UsuarioController;

public class TelaPrincipal {
	
	UsuarioController userController = new UsuarioController();
	List<String> form = new ArrayList<String>();
	Scanner in = new Scanner(System.in);
	TelaBuscaVoos telaBuscaVoos = new TelaBuscaVoos();
	
	public boolean tela() throws ParseException {
		System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
		System.out.print("\n\n\n");
		System.out.println("1 - Crie seu cadastro");
		System.out.println("2 - Já sou cadastrado");
		System.out.println("3 - Sair");
		int option = in.nextInt();
		
		if(option == 1) {
			System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
			System.out.print("\n\n\n");
			System.out.println("Cadastro de Usuario");
			System.out.print("\n\n");
			
			System.out.print("Nome: ");
			String nome = in.next();
			
			System.out.print("Sobrenome: ");
			String sobrenome = in.next();
			
			System.out.print("Data de Nascimento (DD-MM-AAAA): ");
			String dataNascimento = in.next();
			
			System.out.print("CPF: ");
			String cpf = in.next();
			
			System.out.print("Senha: ");
			String senha = in.next();
			
			System.out.println("Confira seu cadastro\n");
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Data de Nascimento: " + dataNascimento);
			System.out.println("CPF: " + cpf);
			System.out.println("\n\n");
			System.out.println("Confirma? 1- Sim 2- Não");
			int confirma = in.nextInt();
			if(confirma == 1) {
				form.add(nome);
				form.add(sobrenome);
				form.add(dataNascimento);
				form.add(cpf);
				form.add(senha);
				
				userController.cadastrarUserBD(form);
				return false;
			}
		}
		else if(option == 2) {
			System.out.println("TakeAFlight - Sistema de reserva de passagens Aereas v0.1");
			System.out.print("\n\n\n");
			System.out.println("Login de Usuario");
			System.out.print("\n\n");
			
			System.out.println("CPF: ");
			String cpfL = in.next();
			System.out.println("Senha: ");
			String senhaL = in.next();
			userController.loginUserBD(cpfL, senhaL);
			telaBuscaVoos.buscaVoos();
		}
		else if(option == 3) {
			in.close();
			return true;
		}
		return true;
	}
}
