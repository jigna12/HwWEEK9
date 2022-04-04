/*6. Write a Java program to retrieve an element (at a specified index) from a given
        array list*/
package hwweek9;

import java.util.ArrayList;

public class Pro6RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Kia");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("Mini cooper");

        System.out.println(cars.get(3));
    }

}
