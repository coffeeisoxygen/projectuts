package Appmodel;

import java.util.ArrayList;
import java.util.List;

public class PlayerModel {

    private String name;
    private int energy;
    private int score;
    private List<String> movementList;

    // Constructor for player
    public PlayerModel(String playerName) {
        this.name = playerName;
        this.energy = 100; // Default energy
        this.score = 0; // Default score
        this.movementList = new ArrayList<>();
    }

    // Constructor for player
    public PlayerModel(String playerName, int energy, String movementPlan) {
        this.name = playerName;
        this.energy = energy;
        this.score = 0; // Default score
        this.movementList = new ArrayList<>();
        for (char move : movementPlan.toCharArray()) {
            this.movementList.add(String.valueOf(move));
        }
    }

    // Method to generate default player condition
    public void generatePlayer() {
        this.energy = 100;
        this.score = 0;
        this.movementList.clear();
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Getter and Setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Method to add movement to the movement list
    public void addMovement(String movement) {
        this.movementList.add(movement);
    }

    // Method to get the movement list
    public List<String> getMovementList() {
        return movementList;
    }

    // Method to print player status
    public void printPlayerStatus() {
        System.out.println("Player Name: " + name);
        System.out.println("Energy: " + energy);
        System.out.println("Score: " + score);
        System.out.println("Movements: " + movementList);
    }
}
