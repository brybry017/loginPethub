package com.poc.petbook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.petbook.Entities.Users;
import com.poc.petbook.Repositories.UsersRepositories;

@RestController
public class Login {

	@Autowired
	UsersRepositories usersRepositories;
	
	@RequestMapping(method=RequestMethod.POST,value="/login")
	public ResponseEntity<String> login(@RequestBody Users users) {
		try {
			Users user1 = usersRepositories.findByusernameAndpassword(users.getUsername(), users.getPassword());
			if(user1.equals(null)) {
				return new ResponseEntity<String>("No Such User Found",HttpStatus.NOT_FOUND);
			}else {
				return new ResponseEntity<String>("Success ",HttpStatus.OK);
			}
		}catch(Exception e) {
			return new ResponseEntity<String>("No Such User Found",HttpStatus.BAD_REQUEST);
		}
	}
}
