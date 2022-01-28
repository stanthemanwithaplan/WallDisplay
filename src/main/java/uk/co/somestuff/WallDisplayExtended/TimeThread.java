package uk.co.somestuff.WallDisplayExtended;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

import static uk.co.somestuff.WallDisplay.Driver.Font.LCD_FONT;

public class TimeThread extends TimerTask {

    private static Boolean displaySemiColon = true;
    private static Boolean firstRun = true;

    @Override
    public void run() {

        DateTimeFormatter formatter;
        if (displaySemiColon) {
            formatter = DateTimeFormatter.ofPattern("HH:mm");
            displaySemiColon = false;
        } else {
            formatter = DateTimeFormatter.ofPattern("HH mm");
            displaySemiColon = true;
        }
        LocalDateTime date = LocalDateTime.now();

        if (firstRun) {
            Main.matrix.scrollUp(formatter.format(date), LCD_FONT, 0, 40);
            firstRun = false;
            Main.matrix.text("", LCD_FONT, 0);
        }
        Main.matrix.setLeftMargin(formatter.format(date), LCD_FONT, 0, 2);
    }
}
