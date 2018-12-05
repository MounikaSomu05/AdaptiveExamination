
/**
 *
 * @author mounika,hari
 */
package com.adaptive.dao;

import com.adaptive.entities.Student;
import com.adaptive.entities.TestDetail;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

/**
 *
 * @author mounika,hari
 */

@Component
@Transactional
public class TestDetailDaoImpl implements TestDetailDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public TestDetail save(TestDetail testDetail) {
        Integer id = (Integer)sessionFactory.getCurrentSession().save(testDetail);
        return this.findOne(id);
        
    }
    
    @Override
    public TestDetail findOne(Integer testID) {
        return (TestDetail)sessionFactory.getCurrentSession().get(TestDetail.class, testID);
    }

   
   
}
