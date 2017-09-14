package main.java.entity;

import main.java.entity.Helmet;
import main.java.entity.Knight;
import main.java.entity.Lance;
import main.java.entity.Shield;

public class Knight{
    private Helmet helmet;
    private Lance lance;
    private Shield shield;

    public Knight(Helmet helmet, Lance lance, Shield shield) {
        this.helmet = helmet;
        this.lance = lance;
        this.shield = shield;
    }

    public Knight() {}

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
                " helmet=" + helmet +
                ", lance=" + lance +
                ", shield=" + shield +
                '}';
    }
}