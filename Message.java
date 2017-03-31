import java.util.Date;

/**
 * Created by pc on 3/31/2017.
 */
public class Message extends Entity<Message> {

    private Date createdAt ;
    private String Text ;

    public Message(Date createdAt, String text) {
        this.createdAt = createdAt;
        Text = text;
    }



    String getMessage(){
        Message msg= new Message(new Date(), this.Text);


    }



}
