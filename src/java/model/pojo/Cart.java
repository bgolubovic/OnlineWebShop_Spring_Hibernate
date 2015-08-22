package model.pojo;

public class Cart  implements java.io.Serializable {

     private int cartId;
     private Members members;
     private Products products;
     private Integer cartQuantity;

    public Cart() {
    }

    public Cart(int cartId) {
        this.cartId = cartId;
    }
    public Cart(int cartId, Members members, Products products, Integer cartQuantity) {
       this.cartId = cartId;
       this.members = members;
       this.products = products;
       this.cartQuantity = cartQuantity;
    }
   
    public int getCartId() {
        return this.cartId;
    }
    
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
    public Members getMembers() {
        return this.members;
    }
    
    public void setMembers(Members members) {
        this.members = members;
    }
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
    }
    public Integer getCartQuantity() {
        return this.cartQuantity;
    }
    
    public void setCartQuantity(Integer cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

}


