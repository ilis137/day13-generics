package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger log = LogManager.getLogger(App.class);
    

    //the method checks if thee calculate max integer is at the second position
    public static void checkMaxAt2ndPos(int max,int calcMax){
       if(max==calcMax){
        log.info("calculated maximum is "+calcMax+" and calculated maximum is  at 2nd position");
       }else{
        log.info("calculated maximum is "+calcMax+" and calculated maximum is not at 2nd position");

       }
    }

    //the method checks if thee calculate max String is at the second position

    public static void checkMaxAt2ndPos(String max,String calcMax){
        if(max.equals(calcMax)){
         log.info("calculated maximum is "+calcMax+" and calculated maximum is  at 2nd position");
        }else{
         log.info("calculated maximum is "+calcMax+" and calculated maximum is not at 2nd position");
        }
     }
     

    //the method checks if thee calculate max Generic Type T is at the second position

    public static <T> void checkMaxAt2ndPos(T max,T calcMax){
        if(max.equals(calcMax)){
         log.info("calculated maximum is "+calcMax+" and calculated maximum is  at 2nd position");
        }else{
         log.info("calculated maximum is "+calcMax+" and calculated maximum is not at 2nd position");
        }
     }
    public static void main( String[] args )
    {
        log.info( "Welcome to Generics program!" );
        Maximum obj=new Maximum();
        int max = obj.calculateMaximum(25,76,35);
        checkMaxAt2ndPos(76,max);

        max = obj.calculateMaximum(85,76,35);
        checkMaxAt2ndPos(76,max);

        String largest = obj.calculateMaximum("Apple", "Peach", "Banana");
        checkMaxAt2ndPos("Peach",largest);
        
         largest = obj.calculateMaximum("Apple", "Banana","Peach");
        checkMaxAt2ndPos("Banana",largest);
        
    }
}

