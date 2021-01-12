import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {2, 4, 1, 7, 10, 9, 3, 8, 5, 6};

        System.out.println(Arrays.toString(array));

        sortingAnArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sortingAnArray(int[] array) {
        int variable;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    variable = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = variable;
                }
            }
        }
    }
}
