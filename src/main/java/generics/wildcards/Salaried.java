package generics.wildcards;

import java.text.MessageFormat;

public class Salaried extends Employee {

    private static final double DEFAULT_SALARY = 120000;

    private double salary = DEFAULT_SALARY;

    public Salaried(String name) {
        this(name, DEFAULT_SALARY);
    }

    public Salaried(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Salaried'{'salary={0}'}'", salary);
    }
}
