package uk.co.somestuff.WallDisplayExtended;

import java.util.List;

public abstract class QueueItem {
    protected int wait = 30000;
    public String name = "";

    public QueueItem() {}

    public void preExecution() {
        System.out.println("[" + this.getClass().getSimpleName() + "] preExecution");
    }

    public abstract void execute();

    public void onComplete() {
        System.out.println("[" + this.getClass().getSimpleName() + "] onComplete");
    }

    public void onRemoval (List<QueueItem> queue) {
        queue.remove(0);
    }

}
