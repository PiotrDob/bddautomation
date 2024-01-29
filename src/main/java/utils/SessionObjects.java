package utils;

public class SessionObjects {

    private static String platnoscNaStart = "";
    private static String oplataMiesieczna = "";

    public static String getPlatnoscNaStart(){
        return platnoscNaStart;
    }

    public static String getOplataMiesieczna(){
        return oplataMiesieczna;
    }

    public static void setOplataMiesieczna(String oplata){
        oplataMiesieczna = oplata;
    }

    public static void setPlatnoscNaStart(String platnosc){ platnoscNaStart = platnosc; }

}
