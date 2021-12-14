import java.util.LinkedList;
import java.util.Queue;

public class Buero {

    private Queue<Person> personen;
        
    public Buero() {
        personen = new LinkedList<Person>();
    }
    
    public void hintenanstellen(Person p) {
        personen.add(p);
    }
    
    public void einlassen() {
    }
    
    public void sprechstundeBeenden() {
        personen.remove();
    }

    public String toString() {
        String result = "";
        for (Person p : personen) {
            result += p.toString() + "\n";
        }
        return result;
    }
}
