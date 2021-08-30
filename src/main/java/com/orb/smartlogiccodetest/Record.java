package com.orb.smartlogiccodetest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {
    String lastName;
    String firstName;
    String gender;
    String dob;
    String color;
    
    public Date setDate(String _date) {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date returnDate = null;
        try {
           returnDate = formatter.parse(_date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        return returnDate;
    }
    
    @Override
    public String toString() {
        Object[] params = new Object[]{lastName, firstName, gender, setDate(dob), color};
        return String.format("{0} {1} {2} {3} {4}", params);
    }
}
