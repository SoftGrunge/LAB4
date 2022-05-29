package university;

public interface inter {
    int line = 1024;
    boolean get(int index);
    void set(int index);
    void set(int index,boolean data);
    void drop(int index);
    void invert(int index);
    int count();
    String toString();
}
