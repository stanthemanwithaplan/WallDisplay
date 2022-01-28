package uk.co.somestuff.WallDisplayExtended;

import uk.co.somestuff.WallDisplay.Driver.Matrix;
import uk.co.somestuff.WallDisplayExtended.Tasks.*;
import uk.co.somestuff.dave.walldisplaycontroller._22_01_2022.TokenHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Main {

    public static List<QueueItem> foregroundQueue = new ArrayList<QueueItem>();
    public static List<QueueItem> backgroundQueue = new ArrayList<QueueItem>();
    public static Matrix matrix = new Matrix(8);

    private static Timer TimerThreadTimer = new Timer();

    public static TokenHeader tokenHeader = new TokenHeader();

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread("app-shutdown-hook") {
            @Override
            public void run() {
                System.out.println("[Main] Closing WallDisplayExtended.jar");

                matrix.clear();
                matrix.close();
            }
        });

        System.out.println("[Main] Starting WallDisplayExtended.jar v1.4");

        tokenHeader.setToken("YOU-NEED-A-ACCESS-TOKEN");

        matrix.open();
        matrix.clear();
        matrix.brightness(0x05);
        matrix.orientation(90);

        TimerThreadTimer.scheduleAtFixedRate(new TimeThread(), 0, 1000);

        //foregroundQueue.add(new TestTask());
        foregroundQueue.add(new DateForeTask());
        foregroundQueue.add(new WeatherForeTask());

        backgroundQueue.add(new ConfigurationBackTask());
        backgroundQueue.add(new MessagesBackTask());

        // WHATDOES: The queue managers are used for two reasons, one the raspberry pis are weak as shit so two workers
        //  it all i wanna run, two we want a smooth running display so the background jobs like checking for configuration can run separately
        QueueManager foregroundQueueManager = new QueueManager(foregroundQueue, "Foreground");
        QueueManager backgroundQueueManager = new QueueManager(backgroundQueue, "Background");

        foregroundQueueManager.start();
        backgroundQueueManager.start();
    }

}
