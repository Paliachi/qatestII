// მე-3 ამოცანა
import java.util.Arrays;

public class ThirdAlgorithm {
    public static void main(String[] args) {
        int[] list = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(list));
    }
}
