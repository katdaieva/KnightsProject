package main.java.entity;

import main.java.entity.Helmet;
import main.java.entity.Knight;
import main.java.entity.KnightInterface;
import main.java.entity.Lance;
import main.java.entity.Shield;

public class Knight implements KnightInterface {
    private int cost;
    private int weight;
    private Helmet helmet;
    private Lance lance;
    private Shield shield;

    public Knight(int cost, int weight, Helmet helmet, Lance lance, Shield shield) {
        this.cost = cost;
        this.weight = weight;
        this.helmet = helmet;
        this.lance = lance;
        this.shield = shield;
    }

    public Knight() {
        this.cost = 0;
        this.weight = 0;
        this.helmet = null;
        this.lance = null;
        this.shield = null;
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

    public void totalCost(Knight knight) {
        knight.setCost(knight.getHelmet().getCost()+knight.getLance().getCost()+knight.getShield().getCost());
    }

    public void totalWeight(Knight knight) {
        knight.setWeight(knight.getHelmet().getWeight()+knight.getLance().getWeight()+knight.getShield().getWeight());
    }

    public Helmet getHelmet() {
        return helmet;
    }
    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Lance getLance() {
        return lance;
    }
    public void setLance(Lance lance) {
        this.lance = lance;
    }

    public Shield getShield() {
        return shield;
    }
    public void setShield(Shield shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", helmet=" + helmet +
                ", lance=" + lance +
                ", shield=" + shield +
                '}';
    }
}