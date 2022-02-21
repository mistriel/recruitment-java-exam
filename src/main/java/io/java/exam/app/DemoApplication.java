package io.java.exam.app;

import io.java.exam.app.repository.ArtistRepository;
import io.java.exam.app.repository.UserRepository;
import io.java.exam.app.service.MusicService;
import io.java.exam.app.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@EnableJpaRepositories("io.java.exam.app.repository")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	UserService userService(UserRepository userRepository){
		return new UserService(userRepository);
	}

	@Bean
	MusicService musicService(ArtistRepository artistRepository){
		return new MusicService(artistRepository);
	}
}
