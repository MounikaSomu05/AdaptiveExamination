/**
 *
 * @author mounika,hari
 */
package com.adaptive.dao;

import com.adaptive.entities.Student;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mounika,hari
 */

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public Student findOne(Integer student) {
        return (Student)sessionFactory.getCurrentSession().get(Student.class, student);
    }

    @Override
    public Student save(Student student) {
       Integer id = (Integer) sessionFactory.getCurrentSession().save(student);
        return this.findOne(id);
    }
    
    
}
