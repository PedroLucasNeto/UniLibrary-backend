package br.com.UniLibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.UniLibrary.model.User;
import br.com.UniLibrary.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void createUser(User user) {
		userRepository.save(user);
	}

}
