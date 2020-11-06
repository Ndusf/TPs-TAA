package istic.TAA_TP3.Partie_1.Provider;

public interface IProvider {
	
	public double getPrice(String nom);
	public void order(String nom, int prix);
	
}
