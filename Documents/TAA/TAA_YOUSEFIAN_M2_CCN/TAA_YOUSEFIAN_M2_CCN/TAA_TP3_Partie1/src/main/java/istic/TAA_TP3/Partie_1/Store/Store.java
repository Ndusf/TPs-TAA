package istic.TAA_TP3.Partie_1.Store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.server.Client;
import istic.TAA_TP3.Partie_1.Bank.IBank;
import istic.TAA_TP3.Partie_1.Provider.IProvider;



@Component
public class Store implements IFastLane, ILane, IJustHaveALook {
	
	private IBank ibank;
	private IProvider iprovider;
	
	@Value("${storeNomClient: Neda}")
	 private String nom;
	
		
	/**
	 * @param ibank
	 * @param iprovider
	 */
	public Store(IBank ibank, IProvider iprovider) {
		super();
		this.ibank = ibank;
		this.iprovider = iprovider;
	}

	public void oneShotOrder(String nom, int prix) {
		
		System.out.println(nom + ", " + prix + " euro !" );
		System.out.println("");
		this.ibank.transfert(" le compte chèques", " le compte livret A ", 200);
		System.out.println("");
		
	}

	@Override
	public double getPrice(String nom) {
		return 3.0;
	}

	@Override
	public boolean isAvailable(String nom, int prix) {
		
        this.iprovider.order(nom, prix);
        return true;
	}

	@Override
	public void addItemToCart(String nom, int quantite, Client refClient) {
		System.out.println("Remplissez de "+ nom + "avec le(s) quantité(s)"+ quantite + "dans le panier" + refClient);
	}

	@Override
	public void pay(Client client) {
		System.out.println("payement à la sortie" + client);
		
	}
}
