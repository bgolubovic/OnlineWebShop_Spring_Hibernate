package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.SmartphonesDAO;
import model.pojo.Products;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SmartphoneController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("smartphones");
        try {
            List<Products> lst = SmartphonesDAO.layDS();
            mv.addObject("smartphones", lst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
