package java_core_interview_questions;

import java.util.ArrayList;
import java.util.Collections;

public class Core {
    public static void main(String[] args) {
        System.out.println("Hello, Java Core Interview Questions!");
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(34);
        marks.add(6);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
