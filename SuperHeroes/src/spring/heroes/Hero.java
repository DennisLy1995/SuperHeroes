package spring.heroes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hero {

	@Value("${HeroName}")
	private String HeroName;
	
	@Value("${identityName}")
	private String identityName;
	
	private Comic firstComic;



	public Comic getFirstComic() {
		return firstComic;
	}
	
	public void setFirstComic(Comic firstComic) {
		this.firstComic = firstComic;
	}

	public String getHeroName() {
		return HeroName;
	}

	public void setHeroName(String HeroName) {
		this.HeroName = HeroName;
	}

	public String getNormalName() {
		return identityName;
	}

	public void setNormalName(String normalName) {
		this.identityName = normalName;
	}

}
