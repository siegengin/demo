package com.example.demo;
import java.util.Scanner;

public class Character {

    private String name;
    private int gender;
    private String size;
    private String race;
    private String role;
    private final Scanner scanner = new Scanner(System.in);

    public Character(String name, int gender, String size, String race, String role) {
        this.name = name;
        this.gender = gender;
        this.size = size;
        this.race = race;
        this.role = role;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getGender() {
        return this.gender;
    }

    public String getSize() {
        return this.size;
    }

    public String getRace() {
        return this.race;
    }

    public String getRole() {
        return this.role;
    }

    // User input methods
    public void setNameFromUser() {
        System.out.println("Enter your character's name: ");
        this.name = scanner.nextLine();
    }

    public void setGenderFromUser() {
        do {
            System.out.println("Enter your character's gender (1 for male, 2 for female, 3 for other): ");
            try {
                this.gender = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (1, 2, or 3).");
                continue;
            }
            if (gender < 1 || gender > 3) {
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        } while (gender < 1 || gender > 3);
    }

    public void setSizeFromUser() {
        System.out.println("Enter your character's size (small, medium, or large): ");
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("small") || input.equals("medium") || input.equals("large")) {
                this.size = input;
                break;
            } else {
                System.out.println("Invalid choice. Please choose small, medium, or large.");
            }
        }
    }

    public void setRaceFromUser() {
        System.out.println("Enter your character's race (human, elf, dwarf, orc): ");
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("human") || input.equals("elf") || input.equals("dwarf") || input.equals("orc")) {
                this.race = input;
                break;
            } else {
                System.out.println("Invalid choice. Please choose human, elf, dwarf, or orc.");
            }
        }
    }

    public void setRoleFromUser() {
        System.out.println("Enter your character's role (cleric, wizard, fighter, rogue): ");
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("cleric") || input.equals("wizard") || input.equals("fighter") || input.equals("rogue")) {
                this.role = input;
                break;
            } else {
                System.out.println("Invalid choice. Please choose cleric, wizard, fighter, or rogue.");
            }
        }
    }

}
