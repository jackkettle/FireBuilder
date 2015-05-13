package com.firebuilder.core.feeds.irishrail.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "objStation")
@XmlAccessorType (XmlAccessType.FIELD)
public class Station {
    
    String StationDesc;
    String StationAlias;
    double StationLatitude;
    double StationLongitude;
    String StationCode;
    int StationId;
    
    @Override
    public String toString() {
        return "Station [StationDesc=" + StationDesc + ", StationAlias="
                + StationAlias + ", StationLatitude=" + StationLatitude
                + ", StationLongitude=" + StationLongitude + ", StationCode="
                + StationCode + ", StationId=" + StationId + "]";
    }
    
    public String getStationDesc() {
        return StationDesc;
    }
    public void setStationDesc(String stationDesc) {
        StationDesc = stationDesc;
    }
    public String getStationAlias() {
        return StationAlias;
    }
    public void setStationAlias(String stationAlias) {
        StationAlias = stationAlias;
    }
    public double getStationLatitude() {
        return StationLatitude;
    }
    public void setStationLatitude(double stationLatitude) {
        StationLatitude = stationLatitude;
    }
    public double getStationLongitude() {
        return StationLongitude;
    }
    public void setStationLongitude(double stationLongitude) {
        StationLongitude = stationLongitude;
    }
    public String getStationCode() {
        return StationCode;
    }
    public void setStationCode(String stationCode) {
        StationCode = stationCode;
    }
    public int getStationId() {
        return StationId;
    }
    public void setStationId(int stationId) {
        StationId = stationId;
    }
    
}
