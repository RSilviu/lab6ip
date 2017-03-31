/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Silviu
 */
public class User extends Entity<User>
{
    String email;
    String name;
    String url;
    String username;
    
    List<User> followers;
    List<User> following;
    List<Message> msgList;
    
    public void addFollowing(User user)
    {
       if(following.contains(user)) return ;
       following.add(user);
    }
    public void addMessage()
    {
        String text = "hello world";
        msgList.add(new Message(new Date(),text,this));
    }

    public User(String email, String name, String url, String username)
    {
        ++id;
        followers = new ArrayList<>();
        following = new ArrayList<>();
        msgList = new ArrayList<>();
        
        this.email = email;
        this.name = name;
        this.url = url;
        this.username = username;
    }
}
