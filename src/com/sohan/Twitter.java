package com.sohan;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This is a Singleton for twitter*/
public class Twitter {
    private Scanner scan = new Scanner(System.in);

    //This linked list contains all the tweets thats been tweeted.
    private LinkedList<Tweets> allTweets;

    private static Twitter ourInstance = new Twitter();

    public static Twitter getInstance() {
        return ourInstance;
    }

    //Twitter Constructor
    private Twitter() {
        System.out.println("Welcome to Twitter!");
        allTweets= new LinkedList<>();
    }

    /*Tweeting function.*/
    public void addTweet() {
        System.out.println("Username: ");
        String name = scan.nextLine();      //add username
        Tweets tweet = new Tweets(name);    //new tweet
        allTweets.add(tweet);               //add tweet to the linked list
        System.out.println(tweet.toString());
    }

    //shows all tweets in the linked list
    public void showAllTweet() {
        Iterator iterator = allTweets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
