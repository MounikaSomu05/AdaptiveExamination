/**
 *
 * @author mounika,hari
 */

package com.adaptive.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adaptive.entities.OneTimePassword;
import com.adaptive.entities.Student;

public interface OneTimePasswordDao {
    
    OneTimePassword save(OneTimePassword onetimepassword);
    OneTimePassword findOne(Integer oneId);
    

}
