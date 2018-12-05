/**
 *
 * @author mounika,hari
 */
package com.adaptive.dao;

import com.adaptive.entities.Question;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Query;
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
public class QuestionDaoImpl implements QuestionDao{
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Question> getQuestionByTestCategory(String category) {
        Query query =  sessionFactory.getCurrentSession().createQuery("SELECT q FROM Question q where q.category = :category").setParameter("category",category);
        return query.list();
    }

    @Override
    public void save(Question question) {
      sessionFactory.getCurrentSession().save(question);
    }

    
}
