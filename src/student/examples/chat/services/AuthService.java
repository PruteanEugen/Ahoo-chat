package student.examples.chat.services;

import stundent.examples.chat.entities.User;

public class AuthService {
    private User [] users;// class load atunci se executa acest rand;

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public AuthService() {
        users = new User[5]; //inizializam un array cu 5 celule
    }
     public void signUp(User user) {
         int i;
         try {
            // 1. search for next avaibalble
            for (i = 0; i < users.length; i++) {
                if (users[i]==null) break;
            }
             // 2. insert the user
             users[i] = user;

         }catch (ArrayIndexOutOfBoundsException e){
             e.printStackTrace();
         }
     }
    public void signIn() {}
    public void signOut() {}
    public void dropOut() {}
}
