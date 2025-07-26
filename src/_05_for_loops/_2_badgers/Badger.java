package _05_for_loops._2_badgers;

public class Badger {
public static void main(String[] args) {
	
		
	for(int twice=0;twice<2;twice++) {
		for (int badger=0; badger<12; badger++) {
			System.out.print("badger");
			if(badger < 11) {
			System.out.print(", ");
			}
		}
		System.out.println();
		
		for(int mushroom=0; mushroom<2; mushroom++) {
		System.out.print("mushroom");
		if(mushroom < 1) {
		System.out.print(", ");
		}
		}
		System.out.println();
		System.out.println();
	}
	System.out.println();
	
	System.out.println("A snake!!!");
	
}
}
