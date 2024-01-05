package com.chatbotapp.model;

import java.util.Stack;

public class ChatModel {
	private Stack<String> messageStack = new Stack<>();

	public void processUserMessage(String userMessage) {
		messageStack.push("User: " + userMessage);
	}

	public String generateBotResponse(String userMessage) {
		String response;
		switch (userMessage.toLowerCase()) {
		case "hello":
			response = "Hello there!";
			break;
		case "hi":
			response = "Hi there!";
			break;
		case "how are you":
			response = "I'm just a computer program, but thanks for asking!";
			break;
		case "what is your name?":
			response = "My name is Chatbot!";
			break;
		case "how is your day":
			response = "Well, not bad";
			break;
		case "tell me a joke":
			response = "Why don't scientists trust atoms? Because they make up everything!";
			break;
		case "what is the meaning of life":
			response = "The meaning of life is a complex philosophical question. I'm just a chatbot!";
			break;
		case "favorite color":
			response = "I don't have a favorite color, but I think all colors are interesting!";
			break;
		case "where are you from":
			response = "I don't have a physical location; I exist in the digital world!";
			break;
		case "thank you":
			response = "You're welcome!";
			break;
		case "bye":
			response = "Goodbye! Have a great day!";
			break;
		default:
			response = "I didn't understand that. Can you please rephrase?";
		}
		return response;
	}

	public Stack<String> getMessageStack() {
		return messageStack;
	}
}
