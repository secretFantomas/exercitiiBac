package com.home.HotelAppGradle;

import com.home.HotelAppGradle.model.User;
import com.home.HotelAppGradle.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelAppGradleApplicationTests {

	@Autowired
	private UserService userService;

	@Before
	public void initDb() {
		User newAdmin = new User("admin", "admin@example.com", "123456");
		userService.createAdmin(newAdmin);

		User newUser = new User("test", "test@example.com", "123456");
		userService.createUser(newUser);
	}

	@Test
	public void testUser() {
		Optional<User> admin = userService.getUser(1);
		assertEquals("admin@example.com", admin.get().getEmail());

		Optional<User> user = userService.getUser(2);
		assertNotNull(user);
	}

}
