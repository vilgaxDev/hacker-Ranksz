import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
        static int simpleArraySum(int[] ar) {

    int sum = 0;

    for(int count = 0; count < ar.length; count++) {
        sum= sum + ar[count];
    }

    return sum;

}
       

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int sum = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}