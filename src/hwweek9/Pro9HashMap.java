/*9. Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map*/

package hwweek9;

import java.util.HashMap;
import java.util.Map;

public class Pro9HashMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Rima",25);
        people.put("Raja",35);
        people.put("Raju",45);
        people.put("Ranu",49);
        people.put("Mani",44);
        people.put("Rani",55);

        for(Map.Entry<String, Integer> peoplename : people.entrySet())
        {
            System.out.println(peoplename);
           // System.out.println(peoplename.getKey()+"   "+peoplename.getValue());
        }
    }
}
