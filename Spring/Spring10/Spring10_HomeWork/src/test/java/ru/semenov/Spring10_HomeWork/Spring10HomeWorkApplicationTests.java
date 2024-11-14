package ru.semenov.Spring10_HomeWork;

import org.apache.catalina.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.http.MockHttpOutputMessage;
import ru.semenov.Spring10_HomeWork.model.Session;
import ru.semenov.Spring10_HomeWork.model.Users;
import ru.semenov.Spring10_HomeWork.repository.SessionRepository;
import ru.semenov.Spring10_HomeWork.repository.UserRepository;
import ru.semenov.Spring10_HomeWork.service.UserService;

import java.util.Optional;

@SpringBootTest
class Spring10HomeWorkApplicationTests {


	@Mock
	private UserRepository userRepository;

	@Mock
	private SessionRepository sessionRepository;

	@InjectMocks
	private UserService userService;


	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testRegister() {
		Users user = new Users();
		user.setUsername("user");
		user.setPassword("user");
		userService.register(user);

		Mockito.verify(userRepository, Mockito.times(1)).save(user);
	}

	@Test
	public void testLogout() {
		Long userId = 1L;
		Users user = userService.getUserRepository().findById(userId).orElse(null);
		Long sessionId = user.getSession().getId();
		userService.logout(userId);

		Mockito.verify(sessionRepository, Mockito.times(1)).deleteById(sessionId);
	}


	@Test
	public void testLogin() {
		Users users = new Users();
		users.setUsername("user");
		users.setPassword("user");

		Mockito.when(userRepository.findByUsername("users")).thenReturn(Optional.of(users));

		Session session = userService.login("user", "user").getSession();

		Mockito.verify(sessionRepository, Mockito.times(1)).save(session);
	}
}
