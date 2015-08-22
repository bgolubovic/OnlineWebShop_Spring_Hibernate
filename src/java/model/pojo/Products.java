package model.pojo;

import java.util.HashSet;
import java.util.Set;

public class Products  implements java.io.Serializable {

     private int productId;
     private String productName;
     private String productType;
     private String description;
     private Double price;
     private String productColor;
     private String productBrand;
     private String productSize;
     private Integer allProductsQuantity;
     private Set carts = new HashSet(0);

    public Products() {
    }

    public Products(int productId) {
        this.productId = productId;
    }
    public Products(int productId, String productName, String productType, String description, Double price, String productColor, String productBrand, String productSize, Integer allProductsQuantity, Set carts) {
       this.productId = productId;
       this.productName = productName;
       this.productType = productType;
       this.description = description;
       this.price = price;
       this.productColor = productColor;
       this.productBrand = productBrand;
       this.productSize = productSize;
       this.allProductsQuantity = allProductsQuantity;
       this.carts = carts;
    }
   
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductType() {
        return this.productType;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return this.price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getProductColor() {
        return this.productColor;
    }
    
    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }
    public String getProductBrand() {
        return this.productBrand;
    }
    
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public String getProductSize() {
        return this.productSize;
    }
    
    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }
    public Integer getAllProductsQuantity() {
        return this.allProductsQuantity;
    }
    
    public void setAllProductsQuantity(Integer allProductsQuantity) {
        this.allProductsQuantity = allProductsQuantity;
    }
    public Set getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set carts) {
        this.carts = carts;
    }

}


