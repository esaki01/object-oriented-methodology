package designpattern.adapter.pattern2;

/**
 * 変換装置.
 */
public class Adapter extends Target {
    private OldSystem oldSystem;

    public Adapter() {
        this.oldSystem = new OldSystem();
    }

    @Override
    public void process() {
        this.oldSystem.oldProcess();
    }
}
