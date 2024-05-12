package generics.wildcards;

import java.text.MessageFormat;

public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Employee'{'name=''{0}'''}'", name);
    }
}
