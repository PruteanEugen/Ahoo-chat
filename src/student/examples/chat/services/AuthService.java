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
        users[0] = user;
        users[1] = user;
     }
    public void signIn() {}
    public void signOut() {}
    public void dropOut() {}
}
