import java.util.Arrays;
import static java.lang.Math.pow;

public class Source {
    public static void main(String[] args) {
        int[] input = new int[]{100, 101, 5, 5, 1, 1};
        System.out.println(Arrays.equals(squareOrSquareRoot(input), new int[]{10, 10201, 25, 25, 1, 1}));
    }

    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array).map(i -> {
            if (pow(i, 0.5)%1==0 )
                return (int) pow(i, 0.5);
            else return (int) pow(i, 2);
        }).toArray();
    }
}
