package Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanqueService b = new BanqueService();
		b.getComptes().add(new Compte(10,20,"2023-3-21"));
		System.out.println(b.convertion(2));
		System.out.println(b.getCompte(0));

	}

}
