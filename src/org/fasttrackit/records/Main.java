package org.fasttrackit.records;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        //System.out.println(student.name() + " has age " + student.age());

        int a = 10;
       increment(a);
        System.out.println(a);

        }
    public static void increment(int a){
        a++;
        System.out.println(a);

    }
}
