package org.fasttrackit.homework;


import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        Map<String, Integer> studentGrade = new HashMap<>();
        studentGrade.put("Ionut", 10);
        studentGrade.put("Daniel", 9);
        studentGrade.put("Alin", 8);
        studentGrade.put("Catalin", 3);
        System.out.println(studentGrade);



        int max2 = Collections.max(studentGrade.values());
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : studentGrade.entrySet()) {
            if (entry.getValue() == max2) {
                keys.add(entry.getKey());
            }
        }
        System.out.println("Max value is " + max2);

        int max = Collections.max(studentGrade.values());
        List<String> students = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : studentGrade.entrySet()) {
            if (entry.getValue() == max) {
                students.add(entry.getKey());
            }
        }
        System.out.println(students);
    }
}
