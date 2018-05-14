package org.learn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main (String [] args){
        Long val = new Double(Math.pow(2, 41)).longValue();
        Long year = (val -1) / 1000 / 60 / 60 / 24 / 365;
        System.out.println( year);

        Date date = new Date(1288834974657L);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
        System.out.println(df.format(date));
    }
}
