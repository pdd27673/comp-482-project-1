import java.io.File;
import java.util.Scanner;

public class StableMarrige {

        public static void main(String[] args) throws Exception {
                // creating object of input file
                File file = new File("input.txt");
                // scanner to read a file
                Scanner sc = new Scanner(file);
                int n = sc.nextInt();
                int output[][] = new int[n][n];

                for (int i = 0; i < n; i++) {
                        int temp[] = new int[n];
                        for (int j = 0; j < n; j++) {
                                int a = sc.nextInt();
                                temp[a - 1] = j + 1;
                        }
                        output[i] = temp;
                }

                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                System.out.print(output[i][j]+"\t");
                        }
                        System.out.println(" ");
                }
                // closing a file
                sc.close();
        }

}
