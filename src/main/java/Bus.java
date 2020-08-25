import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.passengers = new ArrayList<Person>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int getPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
