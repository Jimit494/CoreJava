import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorData implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getAddress().getZip().compareTo(o2.getAddress().getZip())==0)? o1.getName().compareTo(o2.getName()) : o1.getAddress().getZip().compareTo(o2.getAddress().getZip()) ;
    }
}
