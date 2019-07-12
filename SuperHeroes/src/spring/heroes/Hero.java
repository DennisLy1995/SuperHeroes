package spring.heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hero {

	private String HeroName;
	private String normalName;
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

	public void setHeroName(String heroName) {
		HeroName = heroName;
	}

	public String getNormalName() {
		return normalName;
	}

	public void setNormalName(String normalName) {
		this.normalName = normalName;
	}

}
