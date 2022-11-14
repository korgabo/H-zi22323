package arrays;
import java.util.Arrays;


public class MyArrayUtils {
    public static void reverse (int[] numbers){
        System.out.print("Az eredeti tömb: ");
        System.out.println(Arrays.toString(numbers));
        System.out.print("A megfordított tömb: ");
        for(int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        }
    
    public static void sortDescending(int[] numbers){
        System.out.print("Az eredeti tömb: ");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.print("A rendezett tömb: ");
        System.out.println(Arrays.toString(numbers));
    }
    public static boolean equals(int[] numbers2, int[] numbers3){
        if(numbers2.length != numbers3.length){
            return false;
        }
        for(int i = 0; i< numbers2.length; i++){
            if(numbers2[i] != numbers3[i]){
                return false;
            }
        }
        return true;
    }
    public static int[] fill(int numbers[], int value)
      {
        int newnumbers[] = {};
        for(int i = 0; i< numbers.length; i++){
            newnumbers[i] = numbers[i];
        }

        newnumbers[numbers.length] = value;
      
        newnumbers = numbers;

      return numbers;
    }
}
