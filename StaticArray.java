package Practise;
public class StaticArray{
    public void insertEnd(int[] arr, int n, int length, int capacity){
        if(length < capacity){
            arr[length] = n;
        }
    }
    public void removeEnd(int[] arr, int length){
        if(length > 0){
            arr[length-1] =0;
            length --;
        }
    }
    public void insertMiddle(int[] arr, int i, int n, int length){
        for(int index = length-1; index > i - 1; index--){
            arr[index+1] = arr[index];

        }
        arr[i-1] = arr[n];
    }
    public void removeMiddle(int[] arr, int i, int length){
        for( int index = i - 1; index < length; index++){
            arr[index] = arr[index+1];
            
        }


    }



public static void main(String[] args) {
    
}
}
