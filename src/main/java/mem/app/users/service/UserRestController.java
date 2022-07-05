package mem.app.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mem.app.users.UserRepository;
import mem.app.users.entities.User;


@RestController
@CrossOrigin(origins = "*")
public class UserRestController {
	@Autowired
	UserRepository userRepository;
	@RequestMapping(value ="/login/{username}",method = RequestMethod.GET)
	public User getUserByUsername(@PathVariable("username") String 
	username) {
	return userRepository.findByUsername(username);
	}


}
