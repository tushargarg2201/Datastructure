package JavaProblems.Comparator;

import java.util.Comparator;

public class EmployeeComparator {

    public static class sortByRollNumber implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getId() - e2.getId();
        }
    }

    static class sortByName implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.name.compareTo(e2.name);
        }
    }

    static class sortBySalary implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getSalary() - e2.getSalary();
        }
    }

    static class sortByIdAndName implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            int idCompare = e1.id - e2.id;
            int nameCompare = e1.name.compareTo(e2.name);

            if (idCompare == 0) {
                if (nameCompare == 0) {
                    return nameCompare;
                } else {
                    return idCompare;
                }
            } else {
                return idCompare;
            }
        }
    }
}
