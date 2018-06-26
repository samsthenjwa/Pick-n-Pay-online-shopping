package com.pnp.backend.daoimpl;

import com.pnp.backend.dao.CatergoryDAO;
import com.pnp.backend.dto.catergory;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@Repository("catergoryDAO")
public class CatergoryDAOImpl implements CatergoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<catergory> list() {

        String selectActiveCategory = "FROM Category WHERE active = :active";

        Query<catergory> query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);

        query.setParameter("active", true);

        return query.getResultList();
    }

    /*
	 * Getting single category based on id
     */
    @Override
    public catergory get(int id) {

        return sessionFactory.getCurrentSession().get(catergory.class, Integer.valueOf(id));

    }

    @Override

    public boolean add(catergory category) {

        try {
            // add the category to the database table
            sessionFactory.getCurrentSession().persist(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    /*
	 * Updating a single category
     */
    @Override
    public boolean update(catergory category) {

        try {
            // add the category to the database table
            sessionFactory.getCurrentSession().update(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(catergory category) {

        category.setActive(false);

        try {
            // add the category to the database table
            sessionFactory.getCurrentSession().update(category);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
