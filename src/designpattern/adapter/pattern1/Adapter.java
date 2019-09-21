package designpattern.adapter.pattern1;

/**
 * 変換装置.
 */
public class Adapter extends OldSystem implements Target {
    @Override
    public void process() {
        oldProcess();
    }
}
