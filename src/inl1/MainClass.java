package inl1;
import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr11.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextWindow a = new TextWindow("Inl");

		TestCase t1 = new TestCase();
		
		Key k = new Key();
		Cryptographer cryp = new Cryptographer(k);
		TextView a1 = new TextView("Klartext: ",8,30);
		TextView a2 = new TextView("Min chiffertext: ",8,30);
		TextView a3 = new TextView("Korrekt chiffertext: ",8,30);
		a.addView(a1);
		a.addView(a2);
		a.addView(a3);
		int counter = 1;
		while(counter<=5) {
			a.waitForMouseClick();
			a1.displayText(t1.getClearText(counter));
			a2.displayText(cryp.encrypt(t1.getClearText(counter)));
			a3.displayText(t1.getCryptoText(counter));
			counter++;
		}

	}

}
