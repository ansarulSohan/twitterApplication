package com.sohan;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Tweets {
    private String userName;    //twitter userName
    private String tweetText;   //tweet
    private String date;        //time of tweet
    private SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

    //constructor
    //Takes username and generates time and date
    //adds tweet
    public Tweets(String userName) {
        this.userName = userName;
        this.date = formatter.format(new Date());
        tweetText = addTweet();
    }

    //tweet addition
    private String addTweet() {
        System.out.println("Wrtie something");
        return new Scanner(System.in).nextLine();
    }

    @Override
    //Class info to String
    public String toString() {
        return  userName + " Tweeted:\n" +
                tweetText + '\n' +
                date + "\n\n";
    }
}
