package main.java.entity;

import main.java.enums.Material;

public abstract class
	
Ammunition {
    private int cost;
    private int weight;
    private Material material;

    public Ammunition(int cost, int weight, Material material) {
        this.cost = cost;
        this.weight = weight;
        this.material = material;
    }

    public Ammunition() {
        this.cost = 0;
        this.weight = 0;
        this.material = Material.STEEL;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
}
