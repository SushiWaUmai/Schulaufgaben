public class Buero {
    private Person person;
    private Queue<Person> personen;
        
    public Buero() {
        personen = new Queue<Person>();
    }
    
    public void hintenanstellen(Person p) {
        personen.enqueue(p);
    }
    
    public void einlassen() {
        person = personen.front();
        personen.dequeue();
    }
    
    public void sprechstundeBeenden() {
        while(!personen.isEmpty()) {
             personen.dequeue();
        }
        person = null;
    }

    public String toString() {
        if(person == null) {
            return "Keine Person ist drinnen";
        }
        return person.toString();
    }
}
