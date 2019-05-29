package com.nduhiu.practices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    PetRock rocky = new PetRock("Rex");

    @Test
    void getName() throws Exception {
        assertEquals("Rex",rocky.getName());
    }

    @Test
    void setName() throws Exception {
        PetRock cheche = new PetRock("Cherexy");
        cheche.setName("Chimba");
        assertEquals("Chimba",cheche.getName());
    }

    @Test
    public void testHappy() throws Exception {
        assertTrue(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }
}