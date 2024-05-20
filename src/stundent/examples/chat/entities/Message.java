package stundent.examples.chat.entities;

import java.util.Date;

public class Message {
    private int id;
    private String body;
    // private User sender;
    // private User receiver;
    private Date sentAt;
    private Date receivedAt;
    private Date seenAt;

    public Message(){}


    public Message(int id, String body, Date sentAt) {
        setId(this.id);
        this.body = body;
        this.sentAt =sentAt;

    }

    public int getId(){
        return id;
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

    public void setId(int id) {
        if (id <= 1  ||  id >= 1000000) {
            this.id = id;
        }else {
            System.out.println(" The id is out of range ");
        }
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
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", sentAt=" + sentAt +
                ", receivedAt=" + receivedAt +
                ", seenAt=" + seenAt +
                '}';
    }
}

