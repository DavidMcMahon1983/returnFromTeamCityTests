/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.team2;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.DB;
import java.net.UnknownHostException;

/**
 *
 * @author David
 */
public class TeamTest2 {
    
    public static void main (String [] args) throws UnknownHostException{
        
        MongoClientURI uri = new MongoClientURI(
   "mongodb://kay:myRealPassword@mycluster0-shard-00-00-wpeiv.mongodb.net:27017,mycluster0-shard-00-01-wpeiv.mongodb.net:27017,mycluster0-shard-00-02-wpeiv.mongodb.net:27017/admin?ssl=true&replicaSet=Mycluster0-shard-0&authSource=admin");

MongoClient mongoClient = new MongoClient(uri);
 DB database;
        database = (DB) mongoClient.getDatabase("test");
        System.out.println("Hello sir again");
        System.out.println("Hello boss how art thou");
        System.out.println("Good afternoone");
        System.out.println("Good afternoon");
        System.out.println("Good day");
        
        System.out.println(addNum());
        System.out.println("GHk");
        System.out.println("GoodDay Sir");
        System.out.println("How art Though");
        System.out.println("Yes sir thank you");
        System.out.println("Email please");
        System.out.println("bbububub");
        System.out.println("Emailtest4");
         System.out.println("Emailtestfddf");
         System.out.println("Yoouj");
         System.out.println("Hello email");
         System.out.println("Thank god that worked");
          System.out.println("Thank god that workedgain a");
        
        
    }
     public static int addNum() {
         
         int a = 2;
         int b = 2;
         
         return a + b;
     }
}
