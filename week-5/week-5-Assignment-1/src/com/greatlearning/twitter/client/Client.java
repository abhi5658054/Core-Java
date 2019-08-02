package com.greatlearning.twitter.client;

import com.greatlearning.twitter.model.Tweet;
import com.greatlearning.twitter.model.User;
import com.greatlearning.twitter.service.*;

import java.util.*;

public class Client {

    public static void main(String[] args) {

        UserService userService = UserServiceImpl.getInstance();
        Set<User> users = populateData(userService);


        System.out.println("============================Users==============================");
        printEntitySet(users);
        System.out.println("============================Users==============================");

        System.out.println("============================Tweets by User==============================");
        Iterator<User> it = users.iterator();
        while(it.hasNext()){
            User user = it.next();
            if(! user.getTweets().isEmpty()) {
                System.out.println("============================Tweets by User - " + user.getFirstName() + " starts ==============================");
                printEntitySet(userService.fetchTweetsByUser(user.getId()));
                System.out.println("============================Tweets by User " + user.getFirstName() + " ends ==============================");
            }
        }
        System.out.println("============================Tweets by User==============================");

        System.out.println("============================Followers by User==============================");
        Iterator<User> itFollowers = users.iterator();
        while(itFollowers.hasNext()){
            User user = itFollowers.next();
            if(! userService.fetchFollowersByUserId(user.getId()).isEmpty()) {
                System.out.println("============================Followers by User - " + user.getFirstName() + " starts ==============================");
                printEntitySet(userService.fetchFollowersByUserId(user.getId()));
                System.out.println("============================Followers by User " + user.getFirstName() + " ends ==============================");
            }
        }
        System.out.println("============================Followers by User==============================");

        System.out.println("============================Suggest Followers by User==============================");
        System.out.println(userService.suggestUsers(101));
        System.out.println("============================Suggest Followers by User==============================");

        System.out.println("============================Tweets by User Followers==============================");
        System.out.println(userService.fetchTweetsByFollowers(102));
        System.out.println("============================Tweets by User Followers==============================");

    }

    private static Set<User> populateData(UserService userService) {
        Set<User> userSet = new HashSet<>();
        User user1 = userService.createUser( "praveenrk", "Praveen", "Kumar", "praveen@gmail.com");
        User user2 = userService.createUser( "mohan_vr", "Mohan", "Krishna", "mohan@gmail.com");
        User user3 = userService.createUser( "vinayaka", "Vinayaka", "Sharma", "vinay@outlook.com");
        User user4 = userService.createUser( "priyanka_88", "Priyanka", "Patel", "priyanka@outlook.com");
        User user5 = userService.createUser( "akash_94", "Praveen", "Kumar", "praveen@gmail.com");

        Tweet tweet1 = new Tweet("Good Morning Bengaluru");
        Tweet tweet2 = new Tweet("BJP won the elections!!");
        Tweet tweet3 = new Tweet("SA likely to be out of ICC WC", "http://www.icc.com/latest/news");
        Tweet tweet4 = new Tweet("Went for a movie yesterday", "http://www.facebook.com/photos");
        Tweet tweet5 = new Tweet("Went for a movie yesterday", "http://www.facebook.com/photos");


        userService.addFollower(user1.getId(), user2);
        userService.addFollower(user1.getId(), user3);

        userService.addFollower(user2.getId(), user4);
        userService.addFollower(user3.getId(), user5);

        user1.addTweet(tweet1);
        user1.addTweet(tweet2);

        user2.addTweet(tweet3);
        user2.addTweet(tweet4);

        user4.addTweet(tweet5);

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);
        return userSet;
    }

    private static <E> void printEntitySet(Set<E> entity ){
        Iterator<E> it = entity.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}