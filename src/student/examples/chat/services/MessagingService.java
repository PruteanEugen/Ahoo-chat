package student.examples.chat.services;
// Declares the package for the MessagingService class

import stundent.examples.chat.entities.Message;
// Imports the Message class from a different package

public class MessagingService {
    // Declare a private array of messages
    private Message[] messages;
    // Variable to keep track of the number of messages
    private int messageCount;

    // Constructor to initialize the array with a specific capacity
    public MessagingService(int capacity) {
        this.messages = new Message[capacity];
        // Initializes the messages array with the given capacity
        this.messageCount = 0;
        // Initializes the messageCount to 0
    }

    // Create the send() method with a message parameter to add a message
    public void send(Message message) {
        // Check if there is space in the array to add a new message
        if (messageCount < messages.length) {
            // Set the message's sent date to the current date
            message.setSentAt(new java.util.Date());
            // Add the message to the array at the current position
            messages[messageCount] = message;
            // Increment the message counter
            messageCount++;
        } else {
            // Print an error when the array limit is reached
            System.out.println("Limit reached");
        }
    }

    // Method to print the current messages in the array
    public void printMessages() {
        // Loop through the array of messages up to the current message count
        for (int i = 0; i < messageCount; i++) {
            // Print the ID, body, and sent date of each message
            System.out.println("Message ID: " + messages[i].getId() + ", Body: " + messages[i].getBody() + ", Sent At: " + messages[i].getSentAt());
        }
    }
}
