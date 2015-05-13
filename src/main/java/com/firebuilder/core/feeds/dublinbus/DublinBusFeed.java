package com.firebuilder.core.feeds.dublinbus;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.firebuilder.core.feeds.Feed;

@Component
@Scope("prototype")
public class DublinBusFeed extends Thread implements Feed {
    
    @Override
    public void run(){
        
        // Scrape data from irish rail api
        // Add data to be added to a queue
        System.out.println("DublinBusFeed");
        
    }
}
