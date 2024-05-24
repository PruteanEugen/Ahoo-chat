package stundent.examples.chat.entities;

import java.util.Date;
import java.util.UUID;

public class User extends Entity{
    private String username;            //fields, proprietis
    private String password;
    public Date dob;
    public char gander;
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    public User (){}

//    System.out.println("Constructing");
//public User (String username, String password, Date dob, char gander, String email) {
//   // System.out.println("Constructing with username");
//    this.username = username;
//    this.password = password;
//    this.dob = dob;
//    this.gander = gander;
//    this.email = email;
//}

public User(UUID id, String username, String password, Date dob, char gander, String email) {
        super(id);
        this.username = username;
        this.password = password;
        this.dob = dob;
        this.gander = gander;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    //TODO sa fie @ , contaont dot . containt @ dot ininte de @
    if (email != null) {
        if (!email.equals("")){
        this.email = email;
       } else
            System.out.println("Invalid  email because is EMPTY");
    }else
        System.out.println(" Invalid email because is NULL");
    }

    @Override
    public String toString() {
        return "User{" +
                "username=" + username + "\n" +
                ", password=" + password + "\n" +
                ", dob=" + dob +"\n" +
                ", gander=" + gander +
                ", email='" + email + "\n" +
                 "\n" + "\n" +
                '}';
    }
}

