/**
 * Created by ASTERNOTUS on 11.05.2017.
 */
public class Player extends Citizen {
    long chatId;
    private String name;

    public Player(long chatId, String name) {
        this.chatId = chatId;
        this.name = name;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatid(long chatId) {
        this.chatId = chatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
