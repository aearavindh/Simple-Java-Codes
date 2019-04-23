package Classes_And_Objects;

import java.util.Scanner;
public class Box {
    int width, height, depth;
    
    Box(int w, int h, int d){
    	this.width = w;
    	this.height = h;
    	this.depth = d;
    }
    public int volume() {
    	return width*height*depth;
    }
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int d = in.nextInt();
		in.close();
		Box box = new Box(w, h, d);
		int volume = box.volume();
        System.out.println("The volume of the triangle with width "+w+" , height "+h+" and depth "+d+" is "+volume);
	}

}
