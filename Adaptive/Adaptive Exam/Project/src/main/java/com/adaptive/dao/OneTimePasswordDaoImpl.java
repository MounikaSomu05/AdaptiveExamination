/**
 *
 * @author mounika,hari
 */

package com.adaptive.dao;

import com.adaptive.entities.OneTimePassword;
import com.adaptive.entities.Student;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mounika,hari
 */

@Repository
public class OneTimePasswordDaoImpl implements OneTimePasswordDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public OneTimePassword save(OneTimePassword onetimepassword) {
       Integer id = (Integer) sessionFactory.getCurrentSession().save(onetimepassword);
        return this.findOne(id);
    }
    
    @Override
    public OneTimePassword findOne(Integer oneId) {
        return (OneTimePassword)sessionFactory.getCurrentSession().get(OneTimePassword.class, oneId);
    }

  
   
    
    
}
