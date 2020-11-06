package istic.TAA_TP3.Partie_1.Store;

import ch.qos.logback.core.net.server.Client;

public interface ILane {
	
	public void addItemToCart(String nom, int quantite,  Client refClient);
	public void pay(Client client);
}
