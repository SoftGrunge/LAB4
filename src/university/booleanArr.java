package university;

import java.util.Arrays;

public class booleanArr implements  inter {
    private  boolean[] array = new boolean[line];

    public void check(int index) {
        if (index < 0 || index >= line)
            throw new IllegalArgumentException("1");
    }

    @Override
    public boolean get(int index) {
        check(index);
        return array[index];
    }

    @Override
    public void set(int index) {
        check(index);
        array[index] = true;
    }

    @Override
    public void set(int index, boolean data) {
        check(index);
        array[index] = data;
    }

    @Override
    public void drop(int index) {
        check(index);
        array[index] = false;
    }

    @Override
    public void invert(int index) {
        check(index);
        array[index] = !array[index];
    }

    @Override
    public int count() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == true) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        byte[] bArray = new byte[line];
        for (int i = 0; i < array.length; i++) {
          bArray[i]=array[i]? (byte)1:(byte)0;



        }
        return Arrays.toString(bArray);
    }
}
