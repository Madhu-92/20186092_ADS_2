import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Blank Constructor.
    }
    /**
     * main method to perform operations.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int numofInputs = Integer.parseInt(sc.nextLine());
        String[] inputs = new String[numofInputs];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLine();
        }
        LSD lsdObj = new LSD();
        lsdObj.sort(inputs, inputs[0].length());
        System.out.println(Arrays.toString(inputs));

    }
}