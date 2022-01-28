package uk.co.somestuff.WallDisplayExtended.Tasks;

import uk.co.somestuff.WallDisplayExtended.Main;
import uk.co.somestuff.WallDisplayExtended.QueueItem;
import uk.co.somestuff.dave.walldisplaycontroller._22_01_2022.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessagesBackTask extends QueueItem {

    @Override
    public void preExecution() {
        super.preExecution();
    }

    @Override
    public void execute() {
        // TODO: Here we want to check against the sever for any messages to show

        WallDisplayController1 soap = new WallDisplayController1();
        WallDisplayController1Soap soapService = soap.getWallDisplayController1Soap();

        ArrayOfMessage getMessagesResponse = soapService.getMessages(Main.tokenHeader);

        List<Message> messages = getMessagesResponse.getMessage();

        for (int i = 0; i < messages.size(); i++) {

            // TODO: Check if the messages is in the actual forground queue

            boolean contain = false;
            for (int ii = 0; ii < Main.foregroundQueue.size(); ii++) {
                if (Main.foregroundQueue.get(ii).getClass() == MessageForeTask.class) {
                    MessageForeTask m = (MessageForeTask) Main.foregroundQueue.get(ii);
                    Message message = m.getMessage();
                    if (message.getUid().equals(messages.get(i).getUid())) {
                        contain = true;
                    }
                }
            }

            Message m = messages.get(i);
            if (!contain) {
                if (m.getStop().toGregorianCalendar().toZonedDateTime().toLocalDateTime().isAfter(LocalDateTime.now())) {
                    System.out.println("[MessagesBackTask] Adding message '" + m.getContent() + "' (" + m.getStop() + ")");
                    Main.foregroundQueue.add(new MessageForeTask(m));
                } else {
                    System.out.println("[MessagesBackTask] Message '" + m.getContent() + "' is out of date (" + m.getStop() + ")");
                }
            } else {
                System.out.println("[MessagesBackTask] Message is already added '" + m.getContent() + "' (" + m.getStop() + ")");
            }

            /*System.out.println("\n");
            System.out.println("ForegroundQueue");
            for (int ii = 0; ii < Main.foregroundQueue.size(); ii++) {
                System.out.println(ii + ", " + Main.foregroundQueue.get(ii).name);
            }
            System.out.println("\n");*/

        }
    }

    @Override
    public void onRemoval(List<QueueItem> queue) {
        super.onRemoval(queue);
        queue.add(this);
    }
}
