package com.springcourse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestSpring {

	public static void main(String[] args) {
		//SpringApplication.run(Project1Application.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//		System.out.println(classicalMusic.getSong());

		RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);
		System.out.println(rockMusic.getSong());

		//Music music =  context.getBean("musicBean", Music.class);

		//MusicPlayer player = new MusicPlayer(music);
//		MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//		MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//		boolean comparison = player == player2;
//		System.out.println(player);
//		System.out.println(player2);
//
//		System.out.println(player.getVolume());
//		System.out.println(player2.getVolume());
//
//		System.out.println(comparison);
//
//		player.setVolume(80);
//		System.out.println(player.getVolume());
//		System.out.println(player2.getVolume());
//		player.play();
//		System.out.println(player.getName());
//		System.out.println(player.getVolume());



		context.close();
	}

}
