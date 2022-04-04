/*3. Write a Java program to reverse an array of integer values.*/
package hwweek9;
import java.util.Arrays;
import java.util.Scanner;
public class Pro3ReverseAnArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Start enter the Array: ");
        int b[] =new int[n];
        for(int i =0; i<n; i++)
        {
            b[i] = sc.nextInt();

        }
        System.out.println("Original array : " + Arrays.toString(b));

        System.out.println("Original Array printed in reverse order:");
        for (int j = b.length-1; j >= 0; j--)
        {
            System.out.print(b[j] + "  ");
        }

    }


}
