package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger log = LogManager.getLogger(App.class);
    
    public static void checkMaxAt2ndPos(int max,int calcMax){
       if(max==calcMax){
        log.info("calculated maximum is "+calcMax+" and calculated maximum is  at 2nd position");
       }else{
        log.info("calculated maximum is "+calcMax+" and calculated maximum is not at 2nd position");

       }
    }
    public static void main( String[] args )
    {
        log.info( "Welcome to Generics program!" );
        MaxNumber obj=new MaxNumber();
        int max = obj.calculateMaxNumber(25,76,35);
        checkMaxAt2ndPos(76,max);

        max = obj.calculateMaxNumber(85,76,35);
        checkMaxAt2ndPos(76,max);

    }
}

