package streamAPIDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamMapCollectDemo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(10,"VinayKumar","vinay@gmail.com","vinay@1121"));
        users.add(new User(20,"Naveen","navin@gmail.com","vinay@1121"));
        users.add(new User(30,"Shashi","shashi@gmail.com","vinay@1121"));
        users.add(new User(40,"Shivayogi","shivu@gmail.com","vinay@1121"));


    }
}

class UserDetail{
    private int id;
    private String name;
    private String email;

    UserDetail(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class User{
    private int id;
    private String name;
    private String email;
    private String password;

    User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}