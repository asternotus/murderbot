import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by ASTERNOTUS on 11.05.2017.
 */
public class MurderBot extends TelegramLongPollingBot {


    @Override
    public String getBotUsername() {
        // TODO
        return "murderbot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "366841664:AAGk2eDH3p0zi3ZotUyTPSalh8kwINqHjBY";
    }

    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                    .setChatId(update.getMessage().getChatId())
                    .setText(update.getMessage().getText());
            try {
                sendMessage(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
