package database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.intellij.lang.annotations.Language;

import java.util.List;

public class HibernateRequest {

    SessionFactory sessionFactory;

    public HibernateRequest() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    private List select(@Language("HQL") String queryString) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Query query = session.createQuery(queryString);
        List result = query.getResultList();
        tr.commit();
        return result;
    }

    public User getUserByID(long UserID) {
        List<User> result = select("from User where id = '"+UserID+"'");
        return result.isEmpty() ? null : result.get(0);
    }

    public orders getOrdersByID(long ordersID) {
        List<orders> result = select("from orders where id = '"+ordersID+"'");
        return result.isEmpty() ? null : result.get(0);
    }
}

class HibernateUtil {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure(); //"hibernate.cfg.xml"
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().configure();
        sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null)
            sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
}
