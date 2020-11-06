package istic.TAA_TP3.Partie_1.Provider;

import org.springframework.stereotype.Component;

@Component
public class Provider implements IProvider{

	@Override
	public void order(String nom, int prix) {
		System.out.println( nom + ", "+ prix+ " euros!");
		System.out.println("");
	}

	@Override
	public double getPrice(String nom) {
		return 3.0;
	}

	
}
