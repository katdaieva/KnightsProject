package main.java.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import main.java.entity.Knight;

public class Sort {
	private ArrayList<Knight> knights;
	
	public void sortAmmunitionsByCost() {
        Collections.sort(knights, new Comparator() {
            public int compare(Object o1, Object o2) {
                Knight k1 = (Knight) o1;
                k1.totalCost(k1);
                Knight k2 = (Knight) o2;
                k2.totalCost(k2);
                if (k1.getCost() > k2.getCost()) {
                    return 1;
                }
                if (k2.getCost() > k1.getCost()) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public void sortAmmunitionsByWeight() {
        Collections.sort(knights, new Comparator() {
            public int compare(Object o1, Object o2) {
            	Knight k1 = (Knight) o1;
                k1.totalWeight(k1);
                Knight k2 = (Knight) o2;
                k2.totalWeight(k2);
                if (k1.getWeight() > k2.getWeight()) {
                    return 1;
                }
                if (k2.getWeight() > k1.getWeight()) {
                    return -1;
                }
                return 0;
            }
        });
    }
}
