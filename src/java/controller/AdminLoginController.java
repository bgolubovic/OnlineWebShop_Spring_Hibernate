package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.pojo.Members;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


@SuppressWarnings("deprecation")
public class AdminLoginController extends SimpleFormController {
    
    public AdminLoginController() {
        setCommandClass(Members.class);
        setCommandName("AdminLogin");
        setSuccessView("admin");
        setValidator(new AdminLoginValidator());
    }
    
    @Override
     protected ModelAndView onSubmit(
     HttpServletRequest request, 
     HttpServletResponse response, 
     Object command, 
     BindException errors) throws Exception {
        ModelAndView mav = new ModelAndView(getSuccessView());
        Members members = (Members) command; 
       
         if (request.getSession().getAttribute("admin") == null) {
            if (members.getUserName().equals("admin") && members.getPassword().equals("admin")) {
                request.getSession().setAttribute("admin", members);
                return mav = new ModelAndView("admin", "members", members);
            } else {
                return mav = new ModelAndView("admin_login", "members", members);
            }
        } else {
            Members m = (Members) request.getSession().getAttribute("admin");
            return mav = new ModelAndView("admin", "members", members);
        }
         
     }
  
}
