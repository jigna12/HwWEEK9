/*7. Write a Java program to test an array list is empty or not. Define array list with
        underground tube names*/

package hwweek9;

import java.util.ArrayList;
import java.util.Scanner;
public class Pro7ArrayListIsEmpty {

    public static void main(String[] args) {

        //create an empty Arraylist
        ArrayList<String> station = new ArrayList<>();

        station.add("Bakerloo line");
        station.add("Victoria line");
        station.add("Circle line");
        station.add("Central line");
        station.add("Piccadilly line");
        station.add("Metropolitan line");
        station.add("Jubilee line");
        station.add("Northern line");
        station.add("District line");
        station.add("Waterloo & city line");
        station.add("Hammersmith & city line");

      //use Arraylist with empty or not
        for(int i=0; i<station.toArray().length; i++ )
        { if(station.isEmpty()){
            System.out.println("The ArrayList is empty");
        }else{
        }
            System.out.println(station.get(i));
        }
    }
}