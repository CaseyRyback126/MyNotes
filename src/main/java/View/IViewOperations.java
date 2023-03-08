package View;

public interface IViewOperations {
    void read() throws Exception;

    void delete() throws Exception;

    void update() throws Exception;

    void list() throws Exception;

    void create() throws Exception;

    void showHelp();

    String prompt(String message);
}
