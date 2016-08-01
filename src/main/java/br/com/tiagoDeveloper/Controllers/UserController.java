package br.com.tiagoDeveloper.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.tiagoDeveloper.models.User;
import br.com.tiagoDeveloper.models.UserDao;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;

	@RequestMapping("/create")
	@ResponseBody
	public String create(String email, String nome){
		
		String userId = "";
		
		try{
			
			User user = new User(email, nome);
			
			userDao.save(user);
			
			userId = String.valueOf(user.getId());
			
		}catch(Exception e){
			return "Erro  ao criar o usuario: "+ e.toString();
		}
		return "Usuario criado com id "+userId+" sucesso!!!";
	}
	
	
}
