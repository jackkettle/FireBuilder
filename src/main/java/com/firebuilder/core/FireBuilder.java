package com.firebuilder.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import com.firebuilder.core.feeds.dublinbus.DublinBusFeed;
import com.firebuilder.core.feeds.irishrail.IrishRailFeed;

@Component
public class FireBuilder 
{
    
    public static final String FIREBASE_URL = "https://flickering-torch-9259.firebaseio.com/"; 
    
    private static ApplicationContext applicationContext;
    
    private ThreadPoolTaskExecutor taskExecutor;
    
    public static void main( String[] args )
    {
        applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        FireBuilder fireBuilder = applicationContext.getBean(FireBuilder.class);
        fireBuilder.run();
        
    }
    
    public void run(){
        
        taskExecutor = (ThreadPoolTaskExecutor) applicationContext.getBean("taskExecutor");
        taskExecutor.execute(applicationContext.getBean(IrishRailFeed.class));
        taskExecutor.execute(applicationContext.getBean(DublinBusFeed.class));
    }

}
