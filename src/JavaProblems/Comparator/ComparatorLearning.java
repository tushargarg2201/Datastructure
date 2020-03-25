package JavaProblems.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static JavaProblems.Comparator.EmployeeComparator.*;

public class ComparatorLearning {
    public static void main(String [] args) {

        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(10, "Amit", 40, 10000);
        Employee e2 = new Employee(20, "Tushar", 35, 20000);

        Employee e3 = new Employee(1, "Arun", 45, 5000);
        Employee e4 = new Employee(1, "Satya", 20, 1000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Iterator itr1 = list.iterator();
        System.out.println("Before sorting");
        while (itr1.hasNext()) {
            Employee employee = (Employee) itr1.next();
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());

        }

        //Collections.sort(list, new NameComparator());
        //Collections.sort(list, new EmployeeComparator.sortByRollNumber());
        //Collections.sort(list, new EmployeeComparator.sortByIdAndName());
        Collections.sort(list);

        System.out.println("After sorting");

        Iterator itr2 = list.iterator();
        while (itr2.hasNext()) {
            Employee employee = (Employee) itr2.next();
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());

        }
    }
}
