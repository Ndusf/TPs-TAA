package istic.TAA_TP3.Partie_1.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import istic.TAA_TP3.Partie_1.Store.IFastLane;
import istic.TAA_TP3.Partie_1.Store.IJustHaveALook;
import istic.TAA_TP3.Partie_1.Store.ILane;

@Component
public class Client implements IRun{
	@Autowired
	private IFastLane ifast;
	@Autowired
	private ILane ilane;

	private IJustHaveALook haveALook;
		
	/**
	 * @param ifast
	 * @param ilane
	 * @param haveALook
	 */
	public Client(IFastLane ifast, ILane ilane, IJustHaveALook haveALook) {
		super();
		this.ifast = ifast;
		this.ilane = ilane;
		this.haveALook = haveALook;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("*********************************************");
		System.out.println("*               Opération !                 *");
		System.out.println("*********************************************");
		ifast.oneShotOrder("- Croissant",1);
		haveALook.isAvailable("- Pain aux graines de sésames", 3);
	}

}
