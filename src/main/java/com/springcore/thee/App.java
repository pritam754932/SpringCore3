package com.springcore.thee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        ApplicationContext context=new ClassPathXmlApplicationContext("context2.xml");
       Jio obj=(Jio) context.getBean("jio1");
      // Subscription obj1=(Subscription) context.getBean("subscription1");
       
       obj.topUpAmount();
       
       obj.stateName();
       System.out.println(obj.getSub());
       
       
       
       obj.stateName();
       obj.topUpAmount();
      
       obj.subscription.getAmazonPrime();
      
        
        
        
        
    }
}
