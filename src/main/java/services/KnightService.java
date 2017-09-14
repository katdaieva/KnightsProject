package main.java.services;

import java.util.ArrayList;
import java.util.List;

import main.java.entity.Knight;

public class KnightService {
	private List<Knight> knights = new ArrayList<>();

	public List<Knight> getKnights() {
		return knights;
	}

	public List<Knight> addKnight(Knight knight) {
		knights.add(knight);
		return knights;	
	}
	
    public int totalCost(Knight knight) {
        return knight.getHelmet().getCost()+knight.getLance().getCost()+knight.getShield().getCost();
    }

    public int totalWeight(Knight knight) {
        return knight.getHelmet().getWeight()+knight.getLance().getWeight()+knight.getShield().getWeight();
    }
	
    public List<Knight> sortByWeight (List<Knight> knights) {
    	Knight tempKnight = knights.get(0);
    	boolean swapFlag = true;
		List<Knight> sortedKnights = new ArrayList<Knight>();
		while (swapFlag) {
			swapFlag = false;
			for (int i = 0; i < knights.size(); i++) {
				if (totalWeight(knights.get(i)) > totalWeight(knights.get(i+1))) {
					tempKnight = knights.get(i);
					knights.set(i, knights.get(i+1));
					knights.set(i+1, tempKnight);
					swapFlag = true;
				}
			}
		}
		
    	return sortedKnights;
    	
    }
}
