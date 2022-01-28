package uk.co.somestuff.WallDisplayExtended.Tasks;

import uk.co.somestuff.WallDisplayExtended.Main;
import uk.co.somestuff.WallDisplayExtended.QueueItem;
import uk.co.somestuff.dave.walldisplaycontroller._22_01_2022.Message;

import java.time.LocalDateTime;

import static uk.co.somestuff.WallDisplay.Driver.Font.LCD_FONT;

public class MessageForeTask extends QueueItem {
    private Message message;

    public MessageForeTask(Message message) {
        this.message = message;
        this.name = "(" +message.getUid() + ") " + this.message.getContent();
    }

    @Override
    public void execute() {
        System.out.println("[MessageForeTask] Displaying '" + this.message.getContent() + "'");

        Main.matrix.scrollUp(this.message.getContent(), LCD_FONT, 0, 40);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.matrix.carrouselText(this.message.getContent(), LCD_FONT, 40);
    }

    @Override
    public void onComplete() {
        super.onComplete();
        if (this.message.getStop().toGregorianCalendar().toZonedDateTime().toLocalDateTime().isAfter(LocalDateTime.now())) {
            Main.foregroundQueue.add(this);
        }
    }

    public Message getMessage() {
        return this.message;
    }
}
