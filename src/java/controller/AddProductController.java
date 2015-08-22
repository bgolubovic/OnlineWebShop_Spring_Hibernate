
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.pojo.Products;
import model.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class AddProductController extends SimpleFormController {
    
    public AddProductController() {

        setCommandClass(Products.class);
        setCommandName("addproduct");
        setSuccessView("added_product");
        setFormView("add_product");
    }
    
     @Override
     protected ModelAndView onSubmit(
     HttpServletRequest request, 
     HttpServletResponse response, 
     Object command, 
     BindException errors) throws Exception {
     ModelAndView mv = new ModelAndView(getSuccessView());
     Products products = (Products) command;
         try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(products);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
     return mv;
     }

}
