package model.pojo;

import java.util.HashSet;
import java.util.Set;

public class Members  implements java.io.Serializable {
    
     private int memberId;
     private String userName;
     private String password;
     private String fullName;
     private String email;
     private String address;
     private String gender;
     private String dateOfBirth;
     private String memberType;
     private Set carts = new HashSet(0);

    public Members() {
    }

    public Members(int memberId) {
        this.memberId = memberId;
    }
    public Members(int memberId, String userName, String password, String fullName, String email, String address, String gender, String dateOfBirth, String memberType, Set carts) {
       this.memberId = memberId;
       this.userName = userName;
       this.password = password;
       this.fullName = fullName;
       this.email = email;
       this.address = address;
       this.gender = gender;
       this.dateOfBirth = dateOfBirth;
       this.memberType = memberType;
       this.carts = carts;
    }
   
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getMemberType() {
        return this.memberType;
    }
    
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    public Set getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set carts) {
        this.carts = carts;
    }

}


