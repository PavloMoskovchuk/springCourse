package com.springcourse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestSpring {

	public static void main(String[] args) {
		//SpringApplication.run(Project1Application.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Music music =  context.getBean("musicBean", Music.class);

		MusicPlayer player = new MusicPlayer(music);

		player.play();
//		System.out.println(musicBean.getName());
		context.close();
	}

}
