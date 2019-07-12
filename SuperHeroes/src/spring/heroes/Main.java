package spring.heroes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Hero.class);
		Hero spiderman = context.getBean(Hero.class);
		System.out.println("My favorite hero!!!"+ 
		"\n\nHeroe name: "+ spiderman.getHeroName());
		System.out.println("Hidden dentity:" + spiderman.getNormalName());
		System.out.println("First comic: " + spiderman.getFirstComic().getName());
		System.out.println("Publisher: " + spiderman.getFirstComic().getPublisher());
		System.out.println("History: " + spiderman.getFirstComic().getSummary());
		
		
	}

}
