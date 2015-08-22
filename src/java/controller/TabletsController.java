package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.TabletsDAO;
import model.pojo.Products;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TabletsController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("tablets");
        try {
            List<Products> lst = TabletsDAO.layDS();
            mv.addObject("tablets", lst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
