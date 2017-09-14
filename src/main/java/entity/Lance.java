package main.java.entity;


import main.java.enums.LanceType;
import main.java.enums.Material;

public class Lance extends Ammunition {
    private LanceType lanceType;

    public Lance(int cost, int weight, Material material, LanceType lanceType) {
        super(cost, weight, material);
        this.lanceType = lanceType;
    }

    public Lance() {}

    public LanceType getLanceType() {
        return lanceType;
    }
    public void setLanceType(LanceType lanceType) {
        this.lanceType = lanceType;
    }

    @Override
    public String toString() {
        return "Lance{" +
                "lanceType=" + lanceType +
                '}';
    }
}
