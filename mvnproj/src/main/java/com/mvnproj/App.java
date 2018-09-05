package com.mvnproj;


import com.mvnproj.config.SpringConfig;
import com.mvnproj.service.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean bean = context.getBean(TestBean.class);
        String name = bean.getName();


        System.out.println( "Hello World, " + name );
    }
}
