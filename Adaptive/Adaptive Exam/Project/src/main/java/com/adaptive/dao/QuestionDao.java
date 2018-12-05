/**
 *
 * @author mounika,hari
 */
package com.adaptive.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adaptive.entities.Question;
import com.adaptive.entities.TestType;

@Repository
public interface QuestionDao {

	public List<Question> getQuestionByTestCategory(@Param("category") String category);
        public void save(Question question);
}
