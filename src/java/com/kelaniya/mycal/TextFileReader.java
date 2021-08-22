package com.kelaniya.mycal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {
    static int[] num = new int[2];

    public TextFileReader() {
        try {
            File myfile = new File("src\\java\\com\\kelaniya\\mycal\\numbers.txt");
            Scanner myReader = new Scanner(myfile);
            int i = 0;
            while (myReader.hasNextInt()) {
                num[i] = myReader.nextInt();
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred in numbers.txt file");
            e.printStackTrace();
        }
    }
}
