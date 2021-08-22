package com.kelaniya.mycal;

public class Mycal {
    public static void main(String[] args) {
        new UserInputReader();
        new TextFileReader();
        new CalculateProcess(UserInputReader.choice, TextFileReader.num);
    }
}
