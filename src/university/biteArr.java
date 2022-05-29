package university;
import java.util.Arrays;

public class biteArr implements inter {
private byte[] bArray = new byte[line];
public void checkB(int index){
    if(index<0|| index>=line)
        throw new IllegalArgumentException("33");
}
    @Override
    public boolean get(int index) {
        checkB(index);
        return bArray[index] == 1 ? true : false;
}
@Override
    public void set(int index){
    checkB(index);
    bArray[index]=1;
}
@Override
    public void set(int index, boolean data){
    checkB(index);
    bArray[index]=data ? (byte)1:(byte)0;
}
@Override
    public void drop(int index){
    checkB(index);
    bArray[index]=0;
}
@Override
    public void invert(int index){
    checkB(index);
    bArray[index]=bArray[index]==1? (byte)0:(byte)1;
}
@Override
    public int count() {
        int count = 0;
        for (int i = 0; i < bArray.length; i++) {
            if (bArray[i] == 1) {
                count++;
            }
        }
        return count;
    }
    public String toString(){
  return Arrays.toString(bArray);
    }
}
