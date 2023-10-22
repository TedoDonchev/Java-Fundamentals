package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _03_ChatLogger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] command = sc.nextLine().split(" ");

        List<String> chat = new ArrayList<>();

        while (!command[0].equals("end")){
            String action = command[0];

            switch (action) {
                case "Chat":
                    chat.add(command[1]);
                    break;
                case "Delete":
                    chat.remove(command[1]);
                    break;
                case "Edit":
                    replaceMessage(chat, command[1], command[2]);
                    break;
                case "Pin":
                    moveToLast(chat, command[1]);
                    break;
                case "Spam":
                    spamChat(chat, command);
                    break;
            }


            command = sc.nextLine().split(" ");
        }

        for (String message : chat) {
            System.out.println(message);
        }
    }

    public static void replaceMessage(List<String> chat, String oldMessage, String newMessage) {

        if (chat.contains(oldMessage)) {
            int index = chat.indexOf(oldMessage);
            chat.set(index, newMessage);
        }

    }

    public static void moveToLast(List<String> chat, String message) {

        if (chat.contains(message)) {
            chat.remove(message);
            chat.add(message);
        }
    }

    public static void spamChat(List<String> chat, String[] command ) {
        for (int i = 1; i < command.length; i++) {
            chat.add(command[i]);

        }
    }
}
