/**
 *
 * @author mounika,hari
 */
package com.adaptive.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaptive.entities.TestDetail;

@Repository
public interface TestDetailDao {

    public TestDetail save(TestDetail testDetail);
     public TestDetail findOne(Integer testID);
}
