package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.PlayersDAO;
import model.pojo.Products;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PlayersController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("musicplayers");
        try {
            List<Products> lst = PlayersDAO.layDS();
            mv.addObject("musicplayers", lst);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
