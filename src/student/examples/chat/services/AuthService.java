package student.examples.chat.services;

import student.examples.chat.exceptions.UserRegistrationFailedException;
import stundent.examples.chat.entities.User;

public class AuthService {
    final int MAX_USERS = 10_000;
    private int size = 0;
    private User [] users;// class load atunci se executa acest rand;
//#################OOP################################
    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public AuthService() {
        users = new User[5]; //inizializam un array cu 5 celule
    }
    //##############SERVICE###########################
     public void signUp(User user) throws UserRegistrationFailedException {
        if(users == null){
            users = new User[1];
            size++;
            users[size-1] = user;
        }else {
            User [] newUsers = new User[++size]; // incremeanteaza size si apoi adauga si celula noua
            for (int i = 0; i < size-1; i++) {
                newUsers[i] = users[i];
            }
                newUsers[size-1] = user;
                users = newUsers;
            }


//         int i;
//         try {
//            // 1. search for next avaibalble
//            for (i = 0; i < users.length; i++) {
//                if (users[i]==null) break;
//            }
//             // 2. insert the user
//             users[i] = user;
//         }catch (ArrayIndexOutOfBoundsException e){
//            // e.printStackTrace();
//             throw new UserRegistrationFailedException("User list full");
//         }
     }
    public void signIn() {}
    public void signOut() {}
    public void dropOut() {}

    public void dropOut(User user) {
        // 1. Search
        int i = searchUser(user);
        if (i < 0) {
            System.out.println("User" + user + " not found");
            return;
            }
            // 2. Delete
            deleteUser(i);
            // 3. Shift left
            shiftUsersLeft(i);
        }

    //#################HELPERS##############################
    public int searchUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null){
                return -1;
            }
            if (users[i].getUsername().equals(user.getUsername())){
            return i;
        }
      }
        return -1; //Not found
    }
    public void deleteUser(int i) {
        users[i] = null;
    }

    public void shiftUsersLeft(int i) {
        for (int j =i+1; j < users.length; j++) {
            users[j-1] = users[j];
        }
        users[users.length-1] = null;
    }
}
