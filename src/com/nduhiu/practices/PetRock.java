package com.nduhiu.practices;

public class PetRock {
    private String name;
    private boolean happy = true;

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHappy() {
        return this.happy;
    }

    public void playWithRock() {
        this.happy=true;
    }
}
