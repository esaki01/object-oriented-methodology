package designpattern.composite;

/**
 * ファイルとディレクトリを同一視するクラス.
 */
public interface Entry {
    void add(Entry entry);

    void remove();

    void rename(String name);
}
