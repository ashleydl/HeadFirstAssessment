import java.util.HashMap;
import java.util.LinkedHashMap;

public class Wagon {

    private int AantalPlaatsenFirst;
    private int AantalPlaatsenSecond;
    private HashMap<String, Person> chairs = new HashMap<>();

    //aantal plaatsen in de wagon
    public Wagon(int AantalPlaatsenFirst, int AantalPlaatsenSecond) {
        this.AantalPlaatsenFirst = 3;
        this.AantalPlaatsenSecond = 4;
    }

    public int AantalPlaatsenFirst() {
        return this.AantalPlaatsenFirst();
    }
    public int AantalPlaatsenSecond(){
        return this.AantalPlaatsenSecond();
    }

    public void getIn(Person person, String ticket) {
        String key = person.getName();
        Person value = person;
        // TODO check if first or second class ticket
        this.chairs.put(key, value);
        showInfo(person, " is ingestapt");
    }

    private void showInfo(Person person, String action) {
        System.out.println(person.getName() + action);
    }

    public void info() {
        System.out.println(this);
    }
}