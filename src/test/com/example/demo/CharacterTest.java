package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {

    private Character character;

    @BeforeEach
    public void setUp() {
        character = new Character("John", 1, "medium", "human", "fighter");
    }

    @Test
    public void testName() {
        assertEquals("John", character.getName());
    }

    @Test
    public void testGender() {
        assertEquals(1, character.getGender());
    }

    @Test
    public void testSize() {
        assertEquals("medium", character.getSize());
    }

    @Test
    public void testRace() {
        assertEquals("human", character.getRace());
    }

    @Test
    public void testRole() {
        assertEquals("fighter", character.getRole());
    }
}
