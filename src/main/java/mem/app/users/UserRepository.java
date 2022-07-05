package mem.app.users;

import org.springframework.data.jpa.repository.JpaRepository;

import mem.app.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
