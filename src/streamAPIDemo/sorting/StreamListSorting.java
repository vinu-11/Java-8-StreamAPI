package streamAPIDemo.sorting;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");

        /* Sorting Ascending Using Stream */
        List<String> sortedList = fruits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList1 = fruits.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedList1);

        List<String> sortedList2 = fruits.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(sortedList2);
        /* End */

        /* Sorting Descending Using Stream */

        List<String> sortedList3 = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList3);

        List<String> sortedList4 = fruits.stream()
                .sorted(((o1, o2) -> o2.compareTo(o1)))
                .collect(Collectors.toList());
        System.out.println(sortedList4);
        /* End */

        // Sorting Based on Salary

        System.out.println("******************* Sorting Based on Salary *****************************");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10,"Ramesh",25,25000));
        employees.add(new Employee(20,"Suresh",30,30000));
        employees.add(new Employee(30,"Mangesh",40,28000));
        employees.add(new Employee(40,"Nagesh",28,28000));
        employees.add(new Employee(50,"Parmesh",35,40000));

        /* Ascending Order using Lambda Function*/
        List<Employee> emplyoeeSortedList = employees.stream()
                .sorted((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(emplyoeeSortedList);

        /* Using Comparator Operator */
        List<Employee> employeeSortedList1 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("Ascending Order: " + employeeSortedList1);

        /* Descending Order Using Comparator Operator with reversed */
        List<Employee> employeeSortedList2 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("Descending Order: " + employeeSortedList2);

        // Sorting Based on Age
        System.out.println("******************* Sorting Based on Age *****************************");
        List<Employee> employeeSortedList3 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println("Ascending Order: " + employeeSortedList3);

        List<Employee> employeeSortedList4 = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println("Descending Order: " + employeeSortedList4);


    }
}
