package com.irfanharfiansyah.listfootballclub;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClubData {
    //        Menyimpan data nama club
    private static String [] club_name = {
            "Barcelona","Real Madrid","Manchester United","Bayern München",
            "Ajax","Liverpool","Arsenal","Internazionale",
            "AC Milan","Atletico Madrid","Juventus","AS Roma",
            "Tottenham Hotspurs","Chelsea","Paris Saint Germain"
    };
//        Menyimpan data negera club
    private static String [] club_country = {
            "Spanyol","Spanyol","Inggris","Germain",
            "Netherlands","Inggris","Inggris","Italia",
            "Italia","Spanyol","Italia","Italia",
            "Inggris","Inggris","France"
    };
//      Menyimpan data gambar logo club
    private static int [] club_logo = {
            R.drawable.barca, R.drawable.madrid, R.drawable.mu, R.drawable.munchen,
            R.drawable.ajax, R.drawable.liverpool, R.drawable.arsenal, R.drawable.inter,
            R.drawable.acmilan, R.drawable.atmadrid, R.drawable.juve, R.drawable.roma,
            R.drawable.tottenham, R.drawable.chelsea, R.drawable.psg
    };
//    Untuk mendapatkan seluruh data list club
    static ArrayList<Club> getClub() {
        ArrayList<Club> list = new ArrayList<>();
        for (int i = 0; i < club_name.length; i++) {
            Club club = new Club();
            club.setName(club_name[i]);
            club.setCountry(club_country[i]);
            club.setPhoto(club_logo[i]);
            list.add(club);
        }
        return list;
    }
}
