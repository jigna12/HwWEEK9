/*2. Re write the student mark sheet programme using if else and while loop.*/
package hwweek9;

import java.util.Scanner;

public class Pro2StudentMarkSheet {
    public static void test() {
        int rollno, Maths, Science, English, Total;
        float perc;
        String name, subjects;
        Scanner test1 = new Scanner(System.in);
        System.out.println("Enter student name");
        name = test1.nextLine();
        System.out.println("Enter student Roll NO");
        rollno = test1.nextInt();
        System.out.println("Enter the  Maths Marks ");
        Maths = test1.nextInt();
        System.out.println("Enter the Science Marks ");
        Science = test1.nextInt();
        System.out.println("Enter the English Marks ");
        English = test1.nextInt();
        Total = Maths + Science + English;
        perc = Total / 3;

        if (Maths >= 0 && Maths <= 100 && Science >= 0 && Science <= 100 && English >= 0 && English <= 100) {
            System.out.println("___________________________________");
            System.out.println("|          Mark Sheet             |");
            System.out.println("|_________________________________|");
            System.out.println("|Name             :      " + name);
            System.out.println("|Roll No:               " + rollno);
            System.out.println("|_________________________________|");
            System.out.println("|Subjects         :          Marks|");
            System.out.println("|_________________________________|");
            System.out.println("|Math             :      " + Maths);
            System.out.println("|Science             :  " + Science);
            System.out.println("|English             :  " + English);
            System.out.println("|_________________________________|");
            System.out.println("|Total             :  " + Total);
            System.out.println("|_________________________________|");
            System.out.println("|Perc             :  " + perc);
            if (perc > 35) {
                System.out.println("|Result         :       Pass      |");
            } else {
                System.out.println("|Result         :       Fail      |");
            }
            if (perc >= 80) {
                System.out.println("|Grade         :            A+    |");
            } else if (perc >= 60) {
                System.out.println("|Grade         :            A     |");
            } else if (perc >= 50) {
                System.out.println("|Grade         :            B     |");
            } else if (perc >= 35) {
                System.out.println("|Grade         :            c     |");
            } else {
                System.out.println("|Grade         :            No Grade");
            }
            System.out.println("|                                 |");
            System.out.println("___________________________________");

        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        test();
        System.out.println("Would you like to do another mark sheet y or n :");
        Scanner tim = new Scanner(System.in);
        char c = tim.next().charAt(0);
        while (c=='Y' || c=='y')
        {
            test();
            System.out.println("Would you like to do another mark sheet y or n :");
            Scanner tim1 = new Scanner(System.in);
            char c1 = tim1.next().charAt(0);
            c=c1;
        }

    }
}
