package java_core_interview_questions.Comparator_Comparable;

import java.util.Comparator;

public class idComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpId() - o2.getEmpId();
    }
    
}
