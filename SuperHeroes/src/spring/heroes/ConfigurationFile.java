package spring.heroes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:values.properties")
@ComponentScan("spring.heroes")
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
