package spring.heroes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFile {

	@Bean
	public Hero getHero() {
		return new Hero();
	}
	
	@Bean
	public Comic getComic() {
		return new Comic();
	}
	
	
}
