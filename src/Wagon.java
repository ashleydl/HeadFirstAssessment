import java.util.HashMap;
import java.util.LinkedHashMap;

public class Wagon {
    private HashMap<String, Nameable> stoelen = new LinkedHashMap<String, Nameable>();

    public void instappen(Person person1) {
        instappen(person1);
    }

    public void instappen(Person person1) {
        String key = person1.getName();
        Nameable value = person1;
        this.stoelen.put(key, value);
        showInfo(person1, " is ingestapt.");
    }
}
