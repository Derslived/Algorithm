import java.util.Arrays;

public class ArrayProblem {
public static int[] delete(int[] source, int[] position) {
    Arrays.sort(position);
    int positionIdx = 0;
    int count=0;
    int[] newArray = new int[source.length - position.length];
    for (int i = 0; i < source.length; i++) {
        count++;
        if (positionIdx < position.length && i == position[positionIdx]) {
            positionIdx++;
            
        } else {
            newArray[i-positionIdx] = source[i];
        }

      
    }
    return newArray;
}

public static void main(String[] args) {


    int[] nums = {11, 12, 13, 14, 15, 16,18,19,20,21,22,23};
    int[] position = {1, 3,4};
    System.out.println(Arrays.toString(delete(nums, position)));
}

}