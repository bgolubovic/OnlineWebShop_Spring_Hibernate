package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.LaptopsDAO;
import model.pojo.Products;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LaptopsController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("laptops");
        try {
            List<Products> lst = LaptopsDAO.layDS();
            mv.addObject("laptops", lst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
