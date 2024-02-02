import java.util.Arrays;

public class DynamicArray{

    private int[] dataArr;
    private int dataArrSize;

    public DynamicArray(){
        this.dataArr = new int[10];
        this.dataArrSize = 0;
    }

    public void add(int val){
        dataArr[dataArrSize] = val;
        dataArrSize++;
        // System.out.print(toString());
    }

    public int get(int i){
        if(dataArrSize == 0){
            System.out.println("Array empty!");
            return 0;
        } else if(i >= dataArrSize || i < 0) {
            System.out.printf("Invalid index: %d", i);
            return 0;
        } else {
            return dataArr[i];
        }    
    }

    public int size(){return dataArrSize;}

    public void remove(){
    if(dataArrSize == 0){
        System.out.println("Array empty!");
    } else {
        dataArr[dataArrSize-1] = 0;
        dataArrSize--;
    }    
    System.out.print(toString());
    }

    public void remove(int i){
        if(i >= dataArrSize || i < 0){
            System.out.printf("Invalid index: %d", i);
        } else {
            while(i < dataArrSize){
            if(i == dataArrSize - 1){
                dataArr[i] = 0;
                break;
            }
            dataArr[i] = dataArr[i + 1];
            i++;
            }
            dataArrSize--;
        }
        System.out.println(toString());
    }

    public void set(int i, int val){
         if(i >= dataArrSize || i < 0){
            System.out.printf("Invalid index: %d", i);
        } else {
            dataArr[i] = val;
        }
        System.out.println(toString());
    }

    public void clear(){
        dataArr = new int[10];
        dataArrSize = 0;
        System.out.println(toString());
    }

    public String toString(){
        return Arrays.toString(dataArr);
    }
}