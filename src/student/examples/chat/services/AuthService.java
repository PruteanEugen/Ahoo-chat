package student.examples.chat.services;

import com.github.javafaker.Faker;
import student.examples.chat.exceptions.UserRegistrationFailedException;
import stundent.examples.chat.entities.User;

import java.security.MessageDigest;
import java.util.Arrays;

public class AuthService {
    final int MAX_USERS = 10_000;
    private int size = 0;
    private User[] users;// class load atunci se executa acest rand;

    //#################OOP################################
    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public AuthService() {
        //users = new User[5]; //inizializam un array cu 5 celule
    }

    //##############SERVICE###########################
    public void signUp(User user) throws UserRegistrationFailedException {//Useser - ce tip de parametru o sa returneze , user - este numele variabilei a tipului User.

        if (searchUser(user) != -1) {
            throw new UserRegistrationFailedException("User already exists");
        } else {
            User[] newUsers = Arrays.copyOf(users == null ? new User[1] : users, ++size);
            newUsers[size - 1] = user;
            users = newUsers;
            System.out.println("User ");
        }
    }


    public void signIn() {
    }

    public void signOut() {
    }

    public void dropOut() {
    }


    //refector this method as
    public void dropOut(User user) {
        int i = searchUser(user);
        if (i < 0 || size < 1 || i > 1) {
            System.out.println("User not found");
            return;
        }
        User[] newUsers = new User[--size];
        for (int j = 0; j < users.length; j++) {
            if (j < i) {
                newUsers[j] = users[j];
            } else if (j == i) {
                continue;
            } else {
                newUsers[j - 1] = users[j];
            }
        }
        users = newUsers;
    }


//        // 1. Search
//        int i = searchUser(user);
//        if (i < 0) {
//            System.out.println("User" + user + " not found");
//            return;
//            }
//            // 2. Delete
//            deleteUser(i);
//            // 3. Shift left
//            shiftUsersLeft(i);
//        }

    //#################HELPERS##############################
    public int searchUser(User user) {
        for (int i = 0; i < size; i++) {
            if (users[i] == null) {
                return -1;
            }
            if (users[i].getUsername().equals(user.getUsername())) {
                return i;
            }
        }
        return -1; //Not found
    }

    public void deleteUser(int i) {
        users[i] = null;
    }

    public void shiftUsersLeft(int i) {
        for (int j = i + 1; j < users.length; j++) {
            users[j - 1] = users[j];
        }
        users[users.length - 1] = null;
    }

    //#########SECURITY##################
    public String encryptUserPassword(User user) {
        String hexPassword = "";
        try {
            // Hash the password using SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedPassword = digest.digest(user.getPassword().getBytes("UTF-8"));
            for (byte i : hashedPassword){
                hexPassword += String.format("%02X",i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return hexPassword;


    }
}
