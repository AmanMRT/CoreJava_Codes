package ObjectOrientedConcepts.Assignment6.live;

import ObjectOrientedConcepts.Assignment6.music.Playable;
import ObjectOrientedConcepts.Assignment6.music.string.Veena;
import ObjectOrientedConcepts.Assignment6.music.wind.Saxophone;

public class Test {
	
	public static void main(String args[]) {
		
		//object creation with new keyword
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
       
      //object creation with new keyword
        Playable pveena = new Veena();
        Playable psaxophone = new Saxophone();
        
        veena.play(); 
        saxophone.play(); 
        
        pveena.play();
        psaxophone.play();
        
    }
}
