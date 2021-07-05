
import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() < 281) {
            messages.add(message);

        }
    }
    
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
