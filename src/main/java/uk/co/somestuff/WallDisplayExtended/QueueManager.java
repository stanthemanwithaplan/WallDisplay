package uk.co.somestuff.WallDisplayExtended;

import java.util.List;

public class QueueManager {
    private List<QueueItem> queueItemList;
    private String name;

    private boolean justSaidItsEmpty = false;

    public QueueManager(List<QueueItem> queueItemList, String name) {
        this.queueItemList = queueItemList;
        this.name = name;
    }

    public void start() {
        Thread m = new Thread() {
            public void run() {
                while (true) {
                    if (queueItemList.size() < 1) {
                        if (!justSaidItsEmpty) {
                            System.out.println("Queue '" + name + "' is empty.");
                            justSaidItsEmpty = true;
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        QueueItem queueItem = queueItemList.get(0);

                        Thread preExecution = new Thread() {
                            public void run() {
                                queueItem.preExecution();
                            }
                        };

                        Thread execute = new Thread() {
                            public void run() {
                                queueItem.execute();
                            }
                        };

                        Thread onComplete = new Thread() {
                            public void run() {
                                queueItem.onComplete();
                            }
                        };

                        preExecution.start();

                        while (preExecution.isAlive()) { }

                        execute.start();

                        while (execute.isAlive()) { }

                        onComplete.start();

                        try {
                            Thread.sleep(queueItem.wait);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        queueItem.onRemoval(queueItemList);

                    }
                }
            }
        };

        m.start();
    }

}
