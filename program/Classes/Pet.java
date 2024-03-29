package program.Classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Pet extends Animal {
    public Pet(int id, String name, ArrayList<String> commands, GregorianCalendar birthDate, AnimalEnum type) {
        super(id, name, commands, birthDate, type);
    }

    @Override
    public String toString() {
        return "\nДомашнее животное:"
        + "\nid: " + getId()
        + "\nкличка: " + getName()
        + "\nкомманды: " + super.getCommands()
        + "\nдата рожденя: " +  super.getBirthDate() + "\n";
    }
}