package stundent.examples.chat.entities;

import java.util.Date;
import java.util.UUID;

public class Message extends Entity {
    private String body;
    // private User sender;
    // private User receiver;
    private Date sentAt;
    private Date receivedAt;
    private Date seenAt;

    public Message(){}


    public Message(UUID id, String body, Date sentAt) {
        super(id);
        this.body = body;
        this.sentAt =sentAt;

    }



    public String getBody(){
        return body;
    }
    public Date getSentAt(){
        return sentAt;
    }
    public Date getReceivedAt(){
        return receivedAt;
    }
    public Date getSeenAt(){
        return seenAt;
    }



    public void setBody(String body){
        if (body.isEmpty()) {
            System.out.println("The body is empty");
        }else{
        this.body = body;
        }
    }
    public void setSentAt(Date sentAt){
        this.seenAt= sentAt;
    }
    public void setSeenAt(Date sentAt){
        this.seenAt = sentAt;
    }
    public void setReceivedAt(Date receivedAt){
        this.receivedAt = receivedAt;
    }

    @Override
    public String toString() {
        return "Message{"+
                ", body='" + body + '\'' +
                ", sentAt=" + sentAt +
                ", receivedAt=" + receivedAt +
                ", seenAt=" + seenAt +
                '}';
    }
}

