package com.orb.smartlogiccodetest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortByGender {
    //Should sort by gender (female before male) then by last name asc
    // Done in 5 hours last minute, so could be better
    
    static {
        ArrayList resArray = new ArrayList<>();
        ArrayList femArrayList = new ArrayList<>();
        ArrayList maleArrayList = new ArrayList<>();
        BufferedReader br = null;
        String line;
        try {
            // comma list
            br = new BufferedReader(new FileReader("src/resources/comma.txt"));
            while ((line = br.readLine()) != null) {
                if (line.contains("Female") || line.contains(" F ")) {
                    // not idea because names could be hyphenated; works for this solution only
                    line = line.replace("-", "/");
                    femArrayList.add(line.replace(",", ""));
                } else {
                    line = line.replace("-", "/");
                    maleArrayList.add(line.replace(",", ""));
                }
            }
            
            // pipe list
            br = new BufferedReader(new FileReader("src/resources/pipe.txt"));
            while ((line = br.readLine()) != null) {
                if (line.contains("Female") || line.contains(" F ")) {
                    // not idea because names could be hyphenated; works for this solution only
                    line = line.replace("-", "/");
                    femArrayList.add(line.replace("|", ""));
                } else {
                    line = line.replace("-", "/");
                    maleArrayList.add(line.replace("|", ""));
                }
            }
            
            // space list
            br = new BufferedReader(new FileReader("src/resources/space.txt"));
            while ((line = br.readLine()) != null) {
                if (line.contains("Female") || line.contains(" F ")) {
                    // not idea because names could be hyphenated; works for this solution only
                    line = line.replace("-", "/");
                    femArrayList.add(line);
                } else {
                    line = line.replace("-", "/");
                    maleArrayList.add(line);
                }
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // join list; we'll call it a mergesort for now XD
        Collections.sort(femArrayList);
        resArray.addAll(femArrayList);
        
        Collections.sort(maleArrayList);
        resArray.addAll(maleArrayList);
        
        // output string
        StringBuilder res = new StringBuilder();
        res.append("Output 1:\n");
        
        for (var i : resArray) {
            res.append(i);
            res.append("\n");
        }
        
        System.out.println(res);
    }
}
