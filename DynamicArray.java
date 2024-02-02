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

    public int get(int i){return dataArr[i];}

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
            
        }
    }

    // public void clear(){}

    public String toString(){
        return Arrays.toString(dataArr);
    }

    public static void main(String[] args){
        DynamicArray dArr = new DynamicArray();

        dArr.add(3);
        dArr.add(6);
        dArr.add(14);
        dArr.add(12);
        dArr.add(17);
        dArr.add(49);
        dArr.add(23);

        // System.out.printf("Element from index: %d%n", dArr.get(1));
        // System.out.printf("Element from index: %d%n", dArr.get(0));
        // System.out.printf("Element from index: %d%n", dArr.get(2));

        // System.out.println(dArr.toString());
        // dArr.remove();
        // dArr.remove();
        // dArr.remove();
        // dArr.remove();

        // System.out.println(dArr.toString());
        // dArr.remove(3);
        // dArr.remove(5);
        // dArr.remove(4);
        // dArr.remove(4);
    }
}