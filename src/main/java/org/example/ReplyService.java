package org.example;

public class ReplyService {

    public String reply(String message, ReplyType type) {

        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        String message1 = message.trim();

        switch (type) {
            case FORMAL:
                if (message1.equals("hi") || message1.equals("hello")) {
                    return "Hello. How may I assist you today?";
                } else if (message1.equals("how are you")) {
                    return "I am functioning properly. How may I assist you?";
                } else if (message1.equals("i need help")) {
                    return "I can assist with that. Please provide more details.";
                } else if (message1.equals("can you help me with my account")) {
                    return "Certainly. Please describe the account issue.";
                } else if (message1.equals("thanks")) {
                    return "You are welcome.";
                } else if (message1.equals("bye")) {
                    return "Goodbye.";
                } else if (message1.equals("what is your name")) {
                    return "I am your virtual assistant.";
                } else {
                    return "Could you clarify your request?";
                }

            case FRIENDLY:
                if (message1.equals("hi")) {
                    return "Hey there! 😊 How can I help?";
                } else if (message1.equals("hello")) {
                    return "Hi! 👋 What’s up?";
                } else if (message1.equals("how are you")) {
                    return "Doing great! 😄 How can I help?";
                } else if (message1.equals("i need help")) {
                    return "I’ve got you! 🙂 Tell me a bit more.";
                } else if (message1.equals("can you help me with my account")) {
                    return "Sure thing! 😊 What’s wrong with the account?";
                } else if (message1.equals("thanks")) {
                    return "Anytime! 🙌";
                } else if (message1.equals("bye")) {
                    return "See you later! 👋";
                } else if (message1.equals("what is your name")) {
                    return "I’m your helper bot 🤖";
                } else {
                    return "Could you tell me more?";
                }

            case CONCISE:
                if (message1.equals("hi") || message1.equals("hello")) {
                    return "Hello. How can I help?";
                } else if (message1.equals("how are you")) {
                    return "I’m good. How can I help?";
                } else if (message1.equals("i need help")) {
                    return "Share details; I’ll help.";
                } else if (message1.equals("can you help me with my account")) {
                    return "Describe the account issue…";
                } else if (message1.equals("thanks")) {
                    return "You’re welcome.";
                } else if (message1.equals("bye")) {
                    return "Goodbye.";
                } else if (message1.equals("what is your name")) {
                    return "I’m your assistant.";
                } else {
                    return "Please clarify.";
                }

            default:
                return "Unsupported reply type.";
        }
    }
}
