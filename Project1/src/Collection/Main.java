package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		ArrayList<Player> arraylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		//System.out.println()
		
		arraylist.add(new Player("yogesh",12,"India"));
		arraylist.add(new Player("Sagar",13,"US"));
		Player player = new Player();
		player.disp();
	}
}
