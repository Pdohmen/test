import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Eclipse + Github fick");
//		Card Bla =  new Card("Mage");
//		Spellcard IceLance= new Spellcard("Ice Lance");
//		Spellcard Fireball =  new Spellcard("Fireball");
//		
//		
//		System.out.println(IceLance.getName());
//		System.out.println(Fireball.getName());

		Card PlayerHero = new Card(JOptionPane.showInputDialog("Please put in your name"));
		
		System.out.println(PlayerHero.getName());
	}

}
