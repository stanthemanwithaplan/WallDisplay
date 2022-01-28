package uk.co.somestuff.WallDisplayExtended.Tasks;

import uk.co.somestuff.WallDisplayExtended.Main;
import uk.co.somestuff.WallDisplayExtended.QueueItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static uk.co.somestuff.WallDisplay.Driver.Font.LCD_FONT;

public class DateForeTask extends QueueItem {

    // WHATDOES: Foreground Task for displaying the date periodically

    public DateForeTask() {
        this.name = "DateTask";
    }

    @Override
    public void execute() {
        System.out.println("[DateForeTask] Starting");

        LocalDateTime date = LocalDateTime.now();

        String suffix;
        int day = Integer.parseInt(DateTimeFormatter.ofPattern("d").format(date));
        if (day >= 11 && day <= 13) {
            suffix = "th";
        } else {
            switch (day % 10) {
                case 1:
                    suffix = "st"; break;
                case 2:
                    suffix = "nd"; break;
                case 3:
                    suffix = "rd"; break;
                default:
                    suffix = "th";
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Today is' EEEE 'the' d'" + suffix + " of' MMMM yyyy'.'");

        String today = formatter.format(date);

        Main.matrix.scrollUp(today, LCD_FONT, 0, 40);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.matrix.carrouselText(today, LCD_FONT, 40);

    }

    @Override
    public void onRemoval(List<QueueItem> queue) {
        super.onRemoval(queue);
        queue.add(this);
    }
}
