import java.util.Arrays;

public class DynamicArray{

    private int[] dataArr;
    private int dataArrSize;
    private int growSize = 10;
    final private int INITIAL_SIZE = 10;

    public DynamicArray(){
        this.dataArr = new int[INITIAL_SIZE];
        this.dataArrSize = 0;
    }

    public void add(int val){
        if(dataArr.length == dataArrSize){ 
            grow();
        }
        dataArr[dataArrSize] = val;
        dataArrSize++;
        System.out.print(toString() + "\n");
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

    private void grow(){
        var newArr = new int[dataArr.length + growSize];
        for(int i = 0; i < dataArrSize; i++){
            newArr[i] = dataArr[i];
        }
        dataArr = newArr;
        System.out.print(toString());
    }

    public String toString(){
        return Arrays.toString(dataArr);
    }
}