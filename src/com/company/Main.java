package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int width = inputInt("What is the width of the pattern?");
        String line = getWidth(width);

        int height = inputInt("What is the height of the pattern?");
        int stripes = inputInt("How often should stripes appear?");

        line = addStripes(line, stripes);
        
        getHeight(height,line);
    }

    public static String addStripes(String line, int stripes)
    {
        String[] lineArray = line.split("");

        String secondLine = "";

        for (int i = 0; i < lineArray.length; i++) {
            if (i > 0 && (i+1) % stripes == 0)
            {
                lineArray[i] = "X";
            }
            secondLine = secondLine + lineArray[i];
        }

        return secondLine;
    }
    public static void getHeight(int height, String line)
    {
        for (int i = 0; i < height; i++) {
            print(line);
        }
    }
    public static String getWidth(int width)
    {
        String line = "";
        for (int i = 0; i < width; i++) {
            line = line + "O";
        }
        return line;
    }
    public static void print(String m)
    {
        System.out.println(m);
    }

    public static String inputString(String m) {
        String answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextLine();
        return answer;
    }

    public static int inputInt(String m) {
        int answer;
        Scanner scanner = new Scanner(System.in);

        print(m);
        answer = scanner.nextInt();
        return answer;
    }
}
