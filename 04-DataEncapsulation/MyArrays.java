public class MyArrays {

public static int odd(int[] array){
    int result=0;

    for(int i:array){
        if(i%2!=0 && i>0){
            result++;
        }
    }
    return result;
 }
 public static int above(int[] array){
    int result=0;
    int mean=0;
    for(int i:array){
        mean+=i;
    }
    mean=mean/array.length;
    for(int j:array){
        if(j>mean){
            result+=j;
        }
    }
    return result; 
 }   

 public static void main(String[] args) {
    int[] arr1 = {3,2,-5,4,1,-7};
    int[] arr2 = {5,2,7,4,2};
    System.out.println(MyArrays.odd(arr1));
    System.out.println(MyArrays.above(arr2)); 
 }
}
