package com.mychatapp;

import com.mychatapp.viewmodel.ChatViewModel; // Corrected package name

import java.util.Scanner;
import java.util.Stack;

public class MyChatbot {
    private ChatViewModel chatViewModel = new ChatViewModel();

    public static void main(String[] args) {
        MyChatbot myChatbot = new MyChatbot();
        myChatbot.startChat();
    }

    private void startChat() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("You: ");
            String userMessage = scanner.nextLine();

            if (userMessage.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            chatViewModel.processUserInput(userMessage);
            printChat(chatViewModel.getChatHistory());
        }

        scanner.close();
    }

    private void printChat(Stack<String> messageStack) {
        System.out.println("\nChat History:");

        Stack<String> tempStack = new Stack<>();
        messageStack.forEach(tempStack::push);

        tempStack.forEach(message -> {
            System.out.println(message);
            chatViewModel.processUserInput(message);
        });

        System.out.println();
    }
}
