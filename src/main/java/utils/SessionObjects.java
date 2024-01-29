package utils;

import org.json.JSONArray;

public class SessionObjects {

    private static String platnoscNaStart = "";
    private static String oplataMiesieczna = "";
    private static JSONArray response;
    private static Object ratesList;

    public static String getPlatnoscNaStart(){
        return platnoscNaStart;
    }

    public static void setOplataMiesieczna(String oplata){
        oplataMiesieczna = oplata;
    }

    public static String getOplataMiesieczna(){
        return oplataMiesieczna;
    }

    public static void setPlatnoscNaStart(String platnosc){ platnoscNaStart = platnosc; }

    public static JSONArray getResponse(){
        return response;
    }

    public static void setResponse(JSONArray res){ response = res; }

    public static Object getRatesList(){
        return ratesList;
    }

    public static void setRatesList(Object list){ ratesList = list; }

}
