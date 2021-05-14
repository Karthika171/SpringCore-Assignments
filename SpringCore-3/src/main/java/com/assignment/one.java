package com.assignment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  


public class one
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("applicationC.xml");  
        BankActC obj=(BankActC)applicationcontext.getBean("obj");  
        obj.withdraw();     
        }
}
