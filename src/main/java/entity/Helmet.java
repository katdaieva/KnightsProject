package main.java.entity;


import main.java.enums.HelmetConstruction;
import main.java.enums.Material;

public class Helmet extends Ammunition {
    private HelmetConstruction helmetConstruction;

    public Helmet(int cost, int weight, Material material, HelmetConstruction helmetConstruction) {
        super(cost, weight, material);
        this.helmetConstruction = helmetConstruction;
    }

    public Helmet () {}

    public HelmetConstruction getHelmetConstruction() {
        return helmetConstruction;
    }
    public void setHelmetConstruction(HelmetConstruction helmetConstruction) {
        this.helmetConstruction = helmetConstruction;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "helmetConstruction=" + helmetConstruction +
                '}';
    }
}
