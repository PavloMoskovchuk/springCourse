package com.springcourse;

public class RockMusic implements Music {
    private RockMusic() {
    }
    public void doMyInit() {
        System.out.println("Doing my initialisation");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    public static RockMusic getRockMusic() {
        return new RockMusic();
    }
    @Override
    public String getSong() {
        return "Like a Rolling Stone";
    }
}
