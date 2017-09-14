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
	
}
