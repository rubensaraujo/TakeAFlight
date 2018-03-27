package client.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;
//import java.util.ArrayList;
import java.util.List;

import client.dao.UsuarioDao;
import client.model.Usuario;

public class UsuarioController {
	
	
	Usuario user = new Usuario();
	UsuarioDao userDao = new UsuarioDao();
	Calendar dataNasc = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public void cadastrarUserBD(List<String> form) throws ParseException {
		//user.setId(count + 1);
		user.setNome(form.get(0));
		user.setSobrenome(form.get(1));
		dataNasc.setTime(sdf.parse(form.get(2)));
		user.setDataNascimento(dataNasc);
		user.setCpf(form.get(3));
		user.setSenha(form.get(4));
		
		userDao.adiciona(user);
	}
	
	public void loginUserBD(String cpf, String senha) {
		
	}
	
}
