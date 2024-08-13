package com.org.MavenTestProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.tcs1.bean.Manager;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    

		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContex.xml");
		Manager m = (Manager) app.getBean("manager");
		m.doWork();

    }
}
