/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShopVideoVersion;

/**
 *
 * @author gerardh
 */
public class ProductStock {
    private Product product;
    private int quantity;

    public ProductStock(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ProductStock{" + "product=" + product + ", quantity=" + quantity + '}';
    }
    
    
    
}
