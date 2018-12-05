/**
 *
 * @author mounika,hari
 */
package com.adaptive.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaptive.entities.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentDao {

    Student findOne(Integer student);
    Student save(Student student);
}
