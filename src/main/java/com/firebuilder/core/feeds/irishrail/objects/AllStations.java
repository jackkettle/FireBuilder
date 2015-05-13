package com.firebuilder.core.feeds.irishrail.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.firebuilder.core.feeds.irishrail.IrishRailFeed;

@XmlRootElement(name = "ArrayOfObjStation", namespace = IrishRailFeed.NAMESPACE_URL)
@XmlAccessorType (XmlAccessType.FIELD)
public class AllStations {

    @XmlElement(name = "objStation")
    List<Station> allStations;

    public List<Station> getAllStations() {
        return allStations;
    }

    public void setAllStations(List<Station> allStations) {
        this.allStations = allStations;
    }
    
}
