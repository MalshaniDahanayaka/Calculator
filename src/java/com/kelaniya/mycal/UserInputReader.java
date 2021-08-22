package com.kelaniya.mycal;

import java.util.Scanner;

public class UserInputReader {
    static String choice;

    public UserInputReader() {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter operator :\n" +
                    "1. + (Add)\n" +
                    "2. - (Subtract)\n" +
                    "3. * (Multiply)\n");
            choice = obj.nextLine();
            obj.close();
        } catch (Exception e) {
            System.out.println("An error occurred in UserInputReader class");
            System.out.println(e);
        }
    }

}

