package com.sohan;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean exitFlag = true;                    //flag for exit
        Scanner scan = new Scanner(System.in);
        Twitter twitter = Twitter.getInstance();    //Twitter Instance
        //loop continues until the user wants to exit
        while(exitFlag) {
            System.out.println("1. new Tweet");
            System.out.println("2. view Tweets");
            System.out.println("3. exit");
            byte input = scan.nextByte();           //takes users' choice

            switch(input) {
                case 1:
                    twitter.addTweet();
                    break;
                case 2:
                    twitter.showAllTweet();
                    break;

                case 3:
                    exitFlag = false;
                    break;
            }
        }

        scan.close();
    }
}
