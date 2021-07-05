package com.ankit.utility;

import org.springframework.stereotype.Service;

@Service
public class AppUtility {

    public  String reversedData(String input) {
        char[] chArr = new char[input.length()];
        int lastSpace = 0;
        StringBuilder sb = new StringBuilder();
        String temp ="";
        for(int outer=chArr.length-1;outer>=0;outer--) {
           if(input.charAt(outer)==' ' || outer==0) {
                sb.append(temp);
               for(int inner=outer==0 ? 0 : outer+1;inner< (lastSpace==0 ? chArr.length : lastSpace);inner++) {
                   sb.append(input.charAt(inner));
               }
                 lastSpace = outer;
                 temp=" ";
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        //System.out.println(reversedData("Hello World"));
    }
}
