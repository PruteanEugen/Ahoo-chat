package stundent.examples.chat.entities;

import java.util.Date;

public class User extends Entity{
    private String username;            //fields, proprietis
    public String password;
    public Date dob;
    public char gander;
    private String email;

    public void setUsername(String username) {
        this.username = username;
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
public User(int id, String username, String password, Date dob, char gander, String email) {
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
    public String toString(){
        return "USER " +"{" + username + ", " + password + ", " + dob + ", " + gander + ", " + email + "}";
    }
}

