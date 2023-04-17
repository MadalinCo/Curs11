package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework2 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        for(Person name: persons){
            System.out.println(name);
        }


        Map<String, Integer> map = new HashMap<>();
        for(Person person:persons){
            map.put(person.getName(), person.getAge());
        }

        PersonsOlderThan(30);

        fromHairColorToName();
        fromAgeToListOfPersons();



    }

    private static void fromAgeToListOfPersons() {
        List<Person> persons = new ArrayList<>();
        Map<Integer, List<Person>> map = new HashMap<>();
        for (Person person : persons) {
            int age = person.getAge();
            if (!map.containsKey(age)) {
                map.put(age, new ArrayList<>());
            }
            map.get(age).add(person);
        }
    }

    private static void fromHairColorToName() {
        List<Person> persons = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (Person person : persons) {
            String hairColor = person.getHairColor();
            if (!map.containsKey(hairColor)) {
                map.put(hairColor, new ArrayList<>());
            }
            map.get(hairColor).add(person.getName());
        }
    }

    private static void PersonsOlderThan(int olderThanAge) {
        List<Person> persons = new ArrayList<>();
        List<Person> olderThan = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > olderThanAge) {
                olderThan.add(person);
            }
        }
    }

}
