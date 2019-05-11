package TM05_Proj1;

import java.util.Scanner;

class Video{
	String videoName;
	boolean checkout;
	int rating;
	int videoId;
	
	Video(String name){
		this.videoName = name;
	}
	
	public String getName() {
		return videoName;
	}
	
	public void doCheckout() {
		this.checkout = true;
	}
	
	public void doReturn() {
		this.checkout = false;
	}
	
	public void receiveRating(int rating) {
		this.rating = rating;
	}
	
	public int getRating(){
		return rating;
	}
	
	public boolean getCheckout() {
		return checkout;
	}
}

class VideoStore{
	public static int videoId = -1;
	Video[] store = new Video[100];
	
	public void addVideo(String name) {
	videoId++;
	store[videoId] = new Video(name);
	store[videoId].videoId = videoId;
	System.out.println("Video \""+store[videoId].videoName+"\" added successfully.");
	}
	
	public void doCheckout(String name) {
		int j;
		for(j=0;j<=videoId;j++) {
			if((store[j].videoName).equals(name)) {
				store[j].doCheckout();
				break;
			}
		}
	System.out.println("Video \""+store[j].videoName+"\" checked out successfully.");
	}
	
	public void doReturn(String name) {
		int j;
		for(j=0;j<=videoId;j++) {
			if((store[j].videoName).equals(name)) {
				store[j].doReturn();
				break;
			}
		}
	System.out.println("Video \""+store[j].videoName+"\" returned successfully.");
	}
	
	public void receiveRating(String name, int rating) {
		int j;
		for(j=0;j<=videoId;j++) {
			if((store[j].videoName).equals(name)) {
				store[j].receiveRating(rating);
				break;
			}
		}	
	System.out.println("Rating \""+store[videoId].rating+"\" has been mapped to the Video \""+store[videoId].videoName+"\".");
	}
	
	public void listInventory() {
	System.out.println("--------------------------------------------------------");
	System.out.println("Video Name        |    Checkout Status  |   Rating      ");
		for(int i=0;i<=videoId;i++) {
			System.out.println(store[i].videoName+"            |    "+store[i].checkout+"         |   "+store[i].rating+"        ");
		}
		System.out.println("--------------------------------------------------------");
	}
}

public class VideoLauncher {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ch = 1, rating;
		String name;
		VideoStore vs = new VideoStore();
		while(true) { 
		System.out.println("\nMAIN MENU");
		System.out.println("=========");
		System.out.println("1. Add Videos :");
		System.out.println("2. Check Out Video :");
		System.out.println("3. Return Video :");
		System.out.println("4. Receive Rating :");
		System.out.println("5. List Inventory :");
		System.out.println("6. Exit :");
		System.out.println("Enter your choice (1..6) :");
		ch = in.nextInt();
		switch(ch) {
		case 1:System.out.println("Enter the name of the video you want to add: ");
		       name = in.next();
		       vs.addVideo(name);
			   break;
		case 2:System.out.println("Enter the name of the video you want to check out: ");
		       name = in.next();
		       vs.doCheckout(name);
			   break;
		case 3:System.out.println("Enter the name of the video you want to Return: ");
		       name = in.next();
		       vs.doReturn(name);
			   break;
		case 4:System.out.println("Enter the name of the video you want to Rate: ");
		       name = in.next();
		       System.out.println("Enter the rating for this video: ");
		       rating = in.nextInt();
		       vs.receiveRating(name, rating);
			   break;
		case 5:vs.listInventory();
			   break;
		case 6:System.out.println("Exiting...!! Thanks for using the application.");
		       System.exit(0);
		default:System.out.println("Please choose the correct option.");
			    break;   
		}
		}
	}

}
