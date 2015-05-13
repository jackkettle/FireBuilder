package com.firebuilder.core.feeds.irishrail;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.firebuilder.core.feeds.Feed;
import com.firebuilder.core.feeds.irishrail.objects.AllStations;

@Component
@Scope("prototype")
public class IrishRailFeed extends Thread implements Feed {
    
    @Override
    public void run(){
        
        try {
            AllStations allStations = getAllStationData();
            System.out.println(allStations.getAllStations().get(0).toString());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    public static AllStations getAllStationData() throws MalformedURLException, JAXBException {
        URL resourceUrl = new URL(ALL_STATIONS_URL);
        JAXBContext jaxbContext = JAXBContext.newInstance(AllStations.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
        AllStations allStations = (AllStations) jaxbUnmarshaller.unmarshal(resourceUrl);
        return allStations;
    }
    
    public static final String BASE_URL = "http://api.irishrail.ie/realtime/realtime.asmx/";
    public static final String NAMESPACE_URL = "http://api.irishrail.ie/realtime/";
    public static final String ALL_STATIONS_URL = BASE_URL + "getAllStationsXML";
    public static final String CURRENT_TRAINS_URL = BASE_URL + "getCurrentTrainsXML";
    public static final String STATION_ID_URL = BASE_URL + "getStationDataByCodeXML?StationCode=";
}
