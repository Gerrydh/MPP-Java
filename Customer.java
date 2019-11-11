/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopVideoVersion;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import static java.nio.file.Files.lines;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gerardh
 */
public class Customer {

    private String name;
    private double budget;
    private ArrayList<ProductStock> shoppingList;

    public Customer(String fileName) {
        //TODO
        shoppingList = new ArrayList<ProductStock>();
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
            //System.out.println(lines.get(0));
            String[] firstLine = lines.get(0).split(",");
            name = firstLine[0];
            budget = Double.parseDouble(firstLine[1]);
            //removing at index 0 as it is the only 1 treated differently
            lines.remove(0);
            for (String line : lines) {
                String[] arr = line.split(",");
                String name = arr[0];
                int quantity = Integer.parseInt(arr[1].trim());
                Product p = new Product(name, 0);
                ProductStock s = new ProductStock(p, quantity);
                shoppingList.add(s);
            }

        } catch (IOException e) {
            //do something
            e.printStackTrace();

        }
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public ArrayList<ProductStock> getShoppingList() {
        return shoppingList;
    }

    @Override
    public String toString() {
        String ret = "Customer{" + "name=" + name + ", budget=" + budget + ", shoppingList=\n"; 
        for (ProductStock productStock : shoppingList){
            ret+= productStock.getProduct().getName()+ " Quantity: "+ productStock.getQuantity() + "\n";
        }   
        return ret + "}"
        + shoppingList + '}';
    }

    public static void main(String[] args) {
        Customer Ger = new Customer("src/main/java/ShopVideoVersion/customer.csv");
        System.out.println(Ger);
    }
}
