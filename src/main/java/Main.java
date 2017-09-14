package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.entity.*;
import main.java.enums.HelmetConstruction;
import main.java.enums.LanceType;
import main.java.enums.Material;
import main.java.enums.ShieldShape;
import main.java.services.KnightService;;

public class Main {
    public static void main(String[] args) {
    	List<Knight> knights = new ArrayList<>();
    	
        Helmet helmet = new Helmet(3000, 1000, Material.COPPER, HelmetConstruction.CLOSED);
        Lance lance = new Lance(2000,500, Material.STEEL, LanceType.FLAMBERGE);
        Shield shield = new Shield(1500,950, Material.IRON, ShieldShape.TRIANGULAR);

        Knight knight = new Knight(helmet, lance, shield);

        knights.add(knight);
        
        System.out.println(knight.toString());

    }
}
