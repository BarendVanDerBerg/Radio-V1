package com.barend.radiov1.Service;

import com.barend.radiov1.Model.Station;

import java.util.ArrayList;

/**
 * Created by Barend on 2017/02/12.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations(){
        //Asif you retrived data from API
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children)","kidsmusic"));

        return  list;
    }

    public ArrayList<Station> getRecentStations(){
        //Asif you retrived data from API
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations(){
        //Asif you retrived data from API
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }
}
