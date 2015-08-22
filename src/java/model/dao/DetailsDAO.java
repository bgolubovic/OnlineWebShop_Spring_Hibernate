package model.dao;

import java.util.List;
import model.pojo.Products;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class DetailsDAO {
    public static List<Products> layDS(){
        List<Products> lst = null; 
        
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hq1 = "from Products where productId ";
            Query query = session.createQuery(hq1);
            lst = query.list();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return lst;
    }
    
}
