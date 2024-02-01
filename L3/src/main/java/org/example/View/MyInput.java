package org.example.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyInput {
    private final BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
    /////
    public String getUserStr(String prompt, boolean isRequired){
        String strReturn = "";
        boolean bloop = true;
        //loop is given if required
        while (bloop){
            if(prompt != null){System.out.println(prompt);}
            try{
                strReturn = bread.readLine();
                //is this required
                bloop = (isRequired && (strReturn.length()<1));
            }catch (Exception ex){
                System.out.println("Error: " + ex.getMessage());
            }
        }
        return strReturn;
    }
    /////////////////
    public int getUserInt(String prompt, boolean isRequired){
        boolean bLoop = true;
        int iReturn = 0;
        while (bLoop){
            try{
                iReturn = Integer.parseInt(getUserStr(prompt,isRequired));
                bLoop = false;
            }catch (Exception ex){
                if(iReturn == 0 && isRequired == false){return iReturn;}
                System.out.println("Invalid input");
            }
        }
        return iReturn;
    }
    /////////////////////
    public int getUserInt(String prompt, int min, int max, boolean isRequired){
        boolean bLoop = true;
        int iReturn = 0;
        while (bLoop){
            try {
                iReturn = getUserInt(prompt,isRequired);
                if (iReturn <= max && iReturn >= min) {bLoop = false;}
            }catch (Exception ex){
                if(iReturn == 0 && isRequired == false){return iReturn;}
                System.out.println("Invalid Input");
            }
        }
        return iReturn;
    }
    ////////////////
    public int getUserInt(){
        return getUserInt(null,false);
    }
    //------------------------------------
    public float getUserFlt(String prompt, boolean isRequired){
        boolean bLoop = true;
        float iReturn = 0.00f;
        while (bLoop){
            try{
                iReturn = Float.parseFloat(getUserStr(prompt,isRequired));
                bLoop = false;
            }catch (Exception ex){
                if(iReturn == 0 && isRequired == false){return iReturn;}
                System.out.println("Invalid input");
            }
        }
        return iReturn;
    }
}
