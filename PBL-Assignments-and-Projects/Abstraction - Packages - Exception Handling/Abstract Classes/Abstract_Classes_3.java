package Abstract_Classes;

abstract class Instrument{
	public abstract void play();
}
class Piano extends Instrument{
	public void play() {
		System.out.println("Piano is playing tan tan tan ");
	}
}
class Flute extends Instrument{
	public void play() {
		System.out.println("Flute is playint toot toot toot toot ");
	}
}
class Guitar extends Instrument{
	public void play() {
		System.out.println("Guitar is playing tin tin tin ");
	}
}

public class Abstract_Classes_3 {

	public static void main(String[] args) {
		Instrument[] i = new Instrument[10];
        for(int j = 0;j<10;j++) {
        	if(j%2==0) {
        		i[j] = new Piano();
        		i[j].play();
        	}
        	else if(j%3==0) {
        		i[j] = new Flute();
        		i[j].play();
        	}
        	else {
        		i[j] = new Guitar();
        		i[j].play();
        	}
        }
        for(int k=0;k<10;k++) {
        	if(i[k] instanceof Piano)
        		System.out.println("Piano is in index "+k);
        	else if(i[k] instanceof Flute)
        		System.out.println("Flute is in index "+k);
        	else if(i[k] instanceof Guitar)
        		System.out.println("Guitar is in index "+k);
        }
	}

}
