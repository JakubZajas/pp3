import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyArray {
    public static int even(int[] array){
        int values=0;
        for(int i:array){
            if(i%2==0){
                values+=1;
            }
        }
        return values;
    }
    public static int positiveOdd(int[] array){
        int values=0;
        for(int i:array){
            if(i >0 && i%2==1){
                values+=1;
            }
        }
        return values;
    }
    public static int[] reverese(int[] array){
        int[] reversed=new int[array.length];
        int count=0;
        for(int i=array.length;i>0;i--){
            reversed[count]=array[i-1];
            count+=1;
        }
        return reversed;
        
    }

    public static boolean compare(int[] array1, int[] array2){

        return array1.equals(array2);
    }

    public static int[] different1(int[] array1, int[] array2){
        String difference="";
        int[] result=new int[array1.length];
        int counter=0;
        for(int i:array1){
            int count=0;
            for(int j:array2){
                if(i!=j){
                    count+=1;
                }
            }
            if(count==array1.length){
                difference+=i;
                result[counter]=i;
                counter+=1;
            }            
        }
        System.out.println(difference);
        return result;
}
public static  List<Integer> diffrent(int[] array1, int[] array2){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : array1){
            map.put(num, map.getOrDefault(num,0) +1);
        }
        List<Integer> result = new ArrayList<>();
        for(int num : array2){
            if(!map.containsKey(num)){
                result.add(num);
            }
        }
        return result;

}

    public static boolean exist(int number, int[] array){
        for(int i:array){
            if(i==number){
                return true;
            }
        }
        return false;
    }
    public static int secondMax(int[] array){
        int len=array.length;
        for(int i=0;i<len;i++){
            for(int j=1;j<len;j++){
                if(array[j-1]>array[j]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        return array[len-2];
    }
    public static int Column(int[][] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
                sum+=array[i][array.length-1];
            }
        
        return sum;
    }
    public static int[][] swap(int[][] array){
        for (int i = 0; i < array.length; i++) {
            int temp=array[i][0]; 
            array[i][0]=array[i][array.length-1];
            array[i][array.length-1]=temp;
            }
        return array; 
    }
    public static int[] two2one(int[][] array){
        int[] result=new int[array.length*array[0].length];
        int count=0;
        for (int row = 0; row < array.length; row++) {
                 for (int col = 0; col < array[row].length; col++) {
                    result[count]=array[row][col];
                    count+=1;
                 }
                }
        return result;
    }
    public static void main(String[] args){
        int[] array1={-4,-2,-1,1,2,3,4,5};
        int[] array2={1,2,3,4,5,6,7,8};
        int[] array3={1,5,6,7,1,2,3,10};
        int[][] array4={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // System.out.println(even(array1));
        // System.out.println(positiveOdd(array1));
        // System.out.println(reverese(array2));
        // System.out.println(compare(array1, array2));
        // System.out.println(compare(array1, array1));
         System.out.println(different1(array1, array2));
        // different(array1, array2);
        // System.out.println(exist(1,array1));
        // System.out.println(exist(10,array1));
        // System.out.println(secondMax(array3));
        // System.out.println(Column(array4));
        // System.out.println(swap(array4));
        // System.out.println(two2one(array4));
        
    }
}
