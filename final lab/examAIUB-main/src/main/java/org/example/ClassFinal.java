package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component("cF")
public class ClassFinal implements InterfaceExam {
    @Value("${final.date}")
    private String finalDate;


    @Override
    public String examOnGoing()  {
        Date dateFinal = null;
        try {
            dateFinal = new SimpleDateFormat("dd-MM-yyyy").parse((this.finalDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(new Date().compareTo((dateFinal))<=0)
        {
            return "Final";
        }
        return null;
    }
    public void setDate(String date){
        this.finalDate= date;
    }
}
