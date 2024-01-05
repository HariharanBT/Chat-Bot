package com.chatbotapp.viewmodel;

import com.chatbotapp.model.ChatModel;

import java.util.Stack;

public class ChatViewModel {
	private ChatModel chatModel = new ChatModel();

	public void processUserInput(String userInput) {
		chatModel.processUserMessage(userInput);

		String botResponse = chatModel.generateBotResponse(userInput);
		chatModel.processUserMessage("Bot: " + botResponse);
	}

	public Stack<String> getChatHistory() {
		return chatModel.getMessageStack();
	}
}
