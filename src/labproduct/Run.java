package labproduct;

import labproduct.product.Product;

/**
 *
 * @author dmitry
 */
public class Run {

    private static final int ARRAY_SIZE = 3; 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product[] products = new Product[ARRAY_SIZE];
        for (int i = 0; i < products.length; i++){
            products[i] = new Product();
        }
        System.out.println(Product.calcProducts(products));
    }
    
}
