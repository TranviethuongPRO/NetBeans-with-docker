/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package product;




public class Productsystem {
    
    private String productId;    // Mã sản phẩm
    private String productName;  // Tên sản phẩm
    private double price;        // Giá sản phẩm

    // Constructor khởi tạo sản phẩm
    public Productsystem(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter và Setter methods
    public String getProductId() { 
        return productId; 
    }
    
    public String getProductName() { 
        return productName; 
    }
    
    public double getPrice() { 
        return price; 
    }
    
    public void setPrice(double price) { 
        this.price = price; 
    }
}
