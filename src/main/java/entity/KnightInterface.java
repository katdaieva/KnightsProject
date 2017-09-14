package main.java.entity;

import main.java.entity.Helmet;
import main.java.entity.Knight;
import main.java.entity.Lance;
import main.java.entity.Shield;

public interface KnightInterface {
    public int getCost();
    public void setCost(int cost);

    public int getWeight();
    public void setWeight(int weight);

    public void totalCost(Knight knight);
    public void totalWeight(Knight knight);

    public Helmet getHelmet();
    public void setHelmet(Helmet helmet);

    public Lance getLance();
    public void setLance(Lance lance);

    public Shield getShield();
    public void setShield(Shield shield);

    public String toString();
}