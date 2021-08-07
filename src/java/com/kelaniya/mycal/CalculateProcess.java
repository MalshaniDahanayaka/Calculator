package com.kelaniya.mycal;

public class CalculateProcess {
    public CalculateProcess(String choice, int num[]){
        try{
            int ans =0;
            if(choice.equals("+")){
                ans = num[0] + num[1];
            }
            else if(choice.equals("-")){
                ans = num[0] - num[1];
            }
            else if(choice.equals("*")){
                ans = num[0] * num[1];
            }
            else{
                System.out.println("Your input is Invalid");
                System.exit(0);
            }
            System.out.println(ans);
        }catch (Exception e){
            System.out.println("An error occurred in CalculateProcess class");
            System.out.println(e);
        }

    }
}
