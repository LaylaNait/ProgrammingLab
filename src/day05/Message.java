package day05;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        String sender;
        String phoneNumber;
        String messageBady;


        System.out.println("Sender: " +message.substring(message.indexOf("<")+1,message.indexOf(">")));
        System.out.println("Phone Number: "+message.substring(message.indexOf("[")+1,message.indexOf("]")));
        System.out.println("Message body: "+message.substring(message.indexOf("{")+1,message.indexOf("}")));
     scan.close();








    }
}
/*
Given a String message in the following format: Sender:<Mike Smith>. From Number:[202-123-3456].
 Message:{I love programing and problem solving} assign the value of the sender, phoneNumber,
  and messageBody variables and print them.

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving */