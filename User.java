import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 3/31/2017.
 */
public class User extends Entity<User>{

    String email ;
    String name;
    String url;
    String username;

    List<User> followers ;
    List<User> following ;
    List<Message> msgList ;

    public User(String email, String name, String url, String username) {
        this.email = email;
        this.name = name;
        this.url = url;
        this.username = username;
        followers= new ArrayList();
        following= new ArrayList();
        msgList= new ArrayList();
    }

    void addFollowing(User user){

        following.add(user);
    }

    void addFollowers(User user){

        followers.add(user);
    }

    void addMessage(Message message){
        msgList.add(message);
    }
}
