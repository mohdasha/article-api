package com.bitwse.article;

import com.bitwse.article.dao.ArticlesRepository;
import com.bitwse.article.dao.UserRepository;
import com.bitwse.article.domain.Article;
import com.bitwse.article.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ArticlesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticlesApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(UserRepository userRepository, ArticlesRepository articlesRepository) throws Exception {
		return (String[] args) -> {
			UUID josh = UUID.fromString("7603da73-04f9-4c7f-b745-46e2fb723e8a");
			UUID carol = UUID.fromString("55c3d8a0-2b38-4dc2-90b4-5779169e0382");

			articlesRepository.save(new Article("War and Peace", josh));
			articlesRepository.save(new Article("Kafka Streams", josh));
			articlesRepository.save(new Article("IPv6 vs IPv4", josh));
			articlesRepository.save(new Article("Carl Sagan Cosmos", carol));
			articlesRepository.save(new Article("One up on the wall street", carol));
			articlesRepository.save(new Article("The Alchemist", carol));

//			System.out.println("Creating users");
//			User joshUser = new User(josh, "josh", passwordEncoder.encode("josh"));
//			joshUser.addAuthority("READ");
//			User carolUser = new User(carol, "carol", passwordEncoder.encode("carol"));
//			carolUser.addAuthority("READ");
//			carolUser.addAuthority("WRITE");
//			userRepository.save(joshUser);
//			userRepository.save(carolUser);
		};
	}
}
