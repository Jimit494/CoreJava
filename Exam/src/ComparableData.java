import java.util.*;
import java.util.stream.Collectors;

public class ComparableData {
    public static void main(String[] args){

        Employee e1 = new Employee(105,"Jimit" , new Address(501, "Mandan Rd", "Greenbelt", "MD", "20770"));
        Employee e2 = new Employee(102,"Shafali" , new Address(221, "JP Nagar", "Bangalore", "KT", "388450"));
        Employee e3 = new Employee(104,"Avi" , new Address(124, "Mandan Rd", "Greenbelt", "MD", "20770"));
        Employee e4 = new Employee(103,"Manisha" , new Address(600, "Greenbelt Parkway", "Greenbelt", "MD", "20773"));
        Employee e5 = new Employee(101,"Vedank" , new Address(564, "Lark Street", "Utica", "NY", "12203"));
        Employee e6 = new Employee(101,"Vedank" , new Address(564, "Lark Street", "Utica", "NY", "12203"));
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

        System.out.println("\n------------------------------------Original List------------------------------------\n");
        employeeList.forEach(System.out::println);
        System.out.println("\n------------------------------------Sorted List by ID------------------------------------\n");

        //Comparable Sort
        //Collections.sort(employeeList);

        //Comparator Sort Using a New Class
        Collections.sort(employeeList, new ComparatorData());
        /*Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getAddress().getZip().compareTo(o2.getAddress().getZip())==0)? o1.getName().compareTo(o2.getName()) : o1.getAddress().getZip().compareTo(o2.getAddress().getZip()) ;

            }
        });*/
        employeeList.forEach(System.out::println);
        System.out.println("\n------------------------------------Set------------------------------------\n");

        Set<Employee> employeeSet = new HashSet<>(employeeList);
        employeeSet.forEach(System.out::println);

        System.out.println("\n------------------------------------Filter(ID)------------------------------------\n");

        List<Employee> newEmployeeList = employeeSet
                .stream()
                .filter(employee -> employee.getId() > 103)
                .collect(Collectors.toList());
        newEmployeeList.forEach(System.out::println);
    }
}
