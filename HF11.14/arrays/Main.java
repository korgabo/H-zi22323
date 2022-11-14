package arrays;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
{
    int[] numbers = {10,20,30,40,50,3,12,5,6,2,1312,45,};
    int[] numbers2 = {10,20,30};
    int[] numbers3 = {1,20,30};
    MyArrayUtils.reverse(numbers);
    MyArrayUtils.sortDescending(numbers);
    System.out.println(MyArrayUtils.equals(numbers2, numbers3)  ? "egyenlő" : "nem egyenlő" );
    int[] newarray = MyArrayUtils.fill(numbers, 10);
    System.out.println(Arrays.toString(newarray));

    }
}