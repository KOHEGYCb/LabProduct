package labproduct.product;

import java.util.Scanner;

/**
 *
 * @author dmitry
 */
public class Product {
    
    private String name;
    private int count;
    private float price;
    
    public Product(){
//        System.out.print("Print name: ");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
//        System.out.print("Print count: ");
        count = s.nextInt();
//        System.out.print("Print price: ");
        price = s.nextFloat();
    }
    
    public Product(String name, int count, float price){
        this.name = name;
        this.count = count;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCount(){
        return count;
    }
    
    public float getPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        return "Product {\n   Name: " + name + ";\n   Count: " + count + ";\n   Price: " + price + ";\n}";
    }
    
    public static String calcProducts(Product [] products){
        
        int kolProducts = 0;
        float allPrice = 0;
        for (Product product : products) {
            kolProducts += product.count;
            allPrice += product.price * product.count;
        }
        return "There are " + kolProducts + " products, total cost: " + allPrice + ";";
    }
    
}
