/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopVideoVersion;

import java.io.InputStream;
import java.util.*;

/**
 *
 * @author gerardh
 */
public class Scanner {
    
public static void main(String args[]) {
		// create the scanner to take in user input
		Scanner scan = new Scanner(System.in);

		// ask the user for what they want to buy and save as string
		System.out.println("What product do you want to buy?");
		String productName = scan.nextLine();

		// Ask how many they want and save as a integer
		System.out.println("How many " + productName + " do you want?");
		int amount = scan.nextInt();

		// find out how much money they have to pay you with
		System.out.println("How much money do you have?");
		double cash = scan.nextDouble();

		// Print the information
		System.out.println("You want to buy " + amount + " " + productName + " and you have " + cash + ".");
		scan.close();

	}

    private Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    
}
