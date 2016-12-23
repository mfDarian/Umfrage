package fragenmodel1;

　
import java.util.HashMap;

　
public class Fragen {
	

　
private HashMap<Integer, String> fragenkatalogpair; 	
private int naechsteFragenummer; 
public Fragen() {
	
fragenkatalogpair = new HashMap<Integer,String>();	
naechsteFragenummer= 1;

	}

　
public  void fragehinzufuegen(String fragetext){
fragenkatalogpair.put(naechsteFragenummer,fragetext);
naechsteFragenummer= naechsteFragenummer+ 1;
	}

public void frageentfernen(int intiII){
fragenkatalogpair.remove(intiII);
naechsteFragenummer= naechsteFragenummer- 1;
	
}

　
　
　
　
	
	
}
