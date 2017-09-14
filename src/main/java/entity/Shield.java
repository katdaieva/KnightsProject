package main.java.entity;


import main.java.enums.Material;
import main.java.enums.ShieldShape;

public class Shield extends Ammunition{
    private ShieldShape shieldShape;

    public Shield(int cost, int weight, Material material, ShieldShape shieldShape) {
        super(cost, weight, material);
        this.shieldShape = shieldShape;
    }

    public Shield() {}

    public ShieldShape getShieldShape() {
        return shieldShape;
    }
    public void setShieldShape(ShieldShape shieldShape) {
        this.shieldShape = shieldShape;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "shieldShape=" + shieldShape +
                '}';
    }
}