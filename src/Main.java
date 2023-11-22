import java.util.*;
import java.util.stream.Collectors.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom", "Software", true, true, false, 21 ));
        employees.add(new Employee("Mike", "Testing", false, false, false, 34 ));
        employees.add(new Employee("Julia", "Software", true, false, true, 27 ));
        employees.add(new Employee("Michael", "Management", false, false, false, 40 ));
        employees.add(new Employee("Denis", "Management", true, true, true, 23 ));
        employees.add(new Employee("Sofia", "Software", true, false, true, 25 ));
        employees.add(new Employee("Albert", "Software", false, true, true, 55 ));
        employees.add(new Employee("Vlad", "Management", true, true, true, 38 ));
        employees.add(new Employee("Vitalie", "Testing", true, true, true, 36 ));

        List<Employee> Employee1 = employees.stream()
                .filter(e ->e.isCanConductInterview() && e.getAge() > 25 && e.isPayedPerHour() && e.getDepartment().equals("Management") )
                .collect(Collectors.toList());
        System.out.println("Ex1");
        System.out.println(Employee1);

        List<String> Employee2 = employees.stream()
                .filter(e -> !e.isPayedPerHour() && e.getAge() > 30)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ex2");
        System.out.println(Employee2);

        Optional<Employee> Employee3 = employees.stream()
                .filter(e -> e.isCanAttendTraining() &&  e.isCanConductInterview() && e.getDepartment().equals("Software") )
                .findAny();
        System.out.println("Ex3");
        System.out.println(Employee3);
    }
}