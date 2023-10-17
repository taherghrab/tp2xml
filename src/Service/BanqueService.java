package Service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {
	List<Compte> comptes = new ArrayList<Compte>();
	
	public double convertion(double montant) {
		
		return montant*3.3;
	}
	
	public List<Compte> getComptes(){
		return comptes;
	}
	public Compte getCompte(int x) {
		return comptes.get(x);
	}

}
