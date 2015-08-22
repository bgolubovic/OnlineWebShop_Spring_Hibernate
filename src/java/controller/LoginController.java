package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.pojo.Members;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class LoginController extends SimpleFormController{
    public LoginController(){
        setCommandClass(Members.class);
        setCommandName("membersLogin");
        setSuccessView("admin");
        setFormView("admin_login");
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        Members members = (Members) command;
        ModelAndView mav;
        if(members.getUserName().equals("admin") && members.getPassword().equals("admin")){
            return mav = new ModelAndView("admin", "members", members);
        }
        else{
        return mav = new ModelAndView("admin_login", "members", members); 
        }
    }
    
}
