package inl1;
import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr11.*;
import java.util.*;

public class Cryptographer {
	private Key key;
	private StringBuilder s;
	public Cryptographer(Key key){
		this.key = new Key();
	}
	public String encrypt(String text) {
		String n = String.valueOf(key.get5DigitNumber());
		
		s = new StringBuilder();
		int counterFor5D =0;
		for(int i = 0; i<text.length();i++) {
			char temp = text.charAt(i);
			if(temp!=' ') {
			s.append(key.getLetter(temp -'A',Character.getNumericValue(n.charAt(counterFor5D))));
			counterFor5D = (counterFor5D+1)%5 ;
			}else {
				s.append(' ');
			}
		}

		return s.toString();
		
	}
	public String toString() {
		return s.toString();
	}

}
