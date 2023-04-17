package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Homework3 {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        double specifiedAmount=100;
        List<Employee> result = employees.stream()
                .filter(employee -> employee.getSalary() > specifiedAmount)
                .collect(Collectors.toList());
    }
}
