/**
 *
 * @author mounika,hari
 */
package com.adaptive.entities;

import com.adaptive.dao.QuestionDao;
import com.adaptive.dao.StudentDao;
import com.adaptive.manager.StudentManager;
import com.adaptive.service.StudentService;
import com.adaptive.view.Login;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) throws IOException, SerialException, SQLException, Exception {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:dispatcher-servlet.xml");
        context.getBean(Login.class).setVisible(true);
        

        }
        
	
}
