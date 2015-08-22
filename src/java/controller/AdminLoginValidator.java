package controller;

import model.pojo.Members;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class AdminLoginValidator implements Validator{
    @Override
    public boolean supports(Class clazz) {
    return Members.class.isAssignableFrom(clazz);
    }
    public void validate(Object obj, Errors errors) {
    Members members = (Members) obj;  
    if (members.getUserName() == null || members.getUserName().length() == 0) {
    errors.rejectValue("userName", 
  "error.empty.field", "Unesite korisničko ime");
    }
    else if (!members.getUserName().equals("admin")) {
    errors.rejectValue("userName", "unknown.user", "Nepoznato korisnićko ime");
    }
    if (members.getPassword() == null || members.getPassword().length() == 0) {
    errors.rejectValue("password", 
  "error.empty.field", "Unesite šifru");
    } 
    else if (!members.getPassword().equals("admin")) {
    errors.rejectValue("password", "wrong.password", "Pogrešna šifra");
    }  
    }
   
}
