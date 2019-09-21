package designpattern.builder;

public interface Builder {
    void createHeader();

    void createContents();

    void createFooter();

    Page getResult();
}
