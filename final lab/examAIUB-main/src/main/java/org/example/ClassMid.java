package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component("cM")
public class ClassMid implements InterfaceExam {

    @Value("${mid.date}")
    private String midDate;


    @Override
    public String examOnGoing()  {
        Date dateMid = null;
        try {
             dateMid = new SimpleDateFormat("dd-MM-yyyy").parse((this.midDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(new Date().compareTo((dateMid))>=0)
        {
            return "Mid";
        }
        return null;
    }
    public void setDate(String date){
        this.midDate= date;
    }
}
