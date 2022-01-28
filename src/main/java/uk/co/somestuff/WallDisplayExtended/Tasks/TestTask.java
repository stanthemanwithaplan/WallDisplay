package uk.co.somestuff.WallDisplayExtended.Tasks;

import uk.co.somestuff.WallDisplayExtended.Main;
import uk.co.somestuff.WallDisplayExtended.QueueItem;

import java.util.List;

public class TestTask extends QueueItem {

    public TestTask() {
        this.wait = 2000;
    }

    @Override
    public void execute() {
        System.out.println("execute");
    }

    @Override
    public void onRemoval(List<QueueItem> queue) {
        super.onRemoval(queue);
        queue.add(this);
    }
}
