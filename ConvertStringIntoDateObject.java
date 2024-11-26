package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class ConvertStringIntoDateObject {
    public static void main(String[] args) {
        String dateString="11-26-2024";
        try{
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-dd-yyyy");
            Date date=simpleDateFormat.parse(dateString);
            System.out.println("Converted in to date "+date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
      
    }
}
