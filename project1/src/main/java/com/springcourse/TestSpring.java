package com.springcourse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class TestSpring {

    public static void main(String[] args) {
//        //SpringApplication.run(Project1Application.class, args);
//
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
////        Music music = context.getBean("musicBean", Music.class);
////        MusicPlayer player = new MusicPlayer(music);
////        player.play();
//        context.close();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.play();

        Music music2 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.play();

        context.close();
    }
}
