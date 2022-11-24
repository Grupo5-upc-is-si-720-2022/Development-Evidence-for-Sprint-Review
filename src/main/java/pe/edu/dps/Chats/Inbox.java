package pe.edu.dps.Chats;
import java.util.List;
import pe.edu.dps.Users.Person;

public class Inbox {
    private List<Message> sentMessages;
    private List<Message> readMessages;

    public void SendMessage(Message msg, Person person){
    }
    public void DeleteMessage(Message msg, Person person){

    }

    public List<Message> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<Message> sentMessages) {
        this.sentMessages = sentMessages;
    }

    public List<Message> getReadMessages() {
        return readMessages;
    }

    public void setReadMessages(List<Message> readMessages) {
        this.readMessages = readMessages;
    }
}
