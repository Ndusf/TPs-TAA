package istic.aop.Bank;

import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank{

	@Override
	public void transfert(String from, String to, int prix) {
		
		System.out.println("- Virement de "+ prix + " euros depuis" + from + " vers"+ to + "!");
	}

}
