package mem.app.users;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mem.app.users.entities.User;

@SpringBootTest
class UsersMsApplicationTests {
	
	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void textUsername(){
		User u = userRepository.findByUsername("admin");
		System.out.println(u);
	}

}
