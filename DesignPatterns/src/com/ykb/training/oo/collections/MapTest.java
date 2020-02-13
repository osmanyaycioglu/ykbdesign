package com.ykb.training.oo.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.ykb.training.dp.creational.builder.Person;

public class MapTest {
    public static void main(final String[] args) {
        Map<String, Person> person = new ConcurrentHashMap<>(1_000_000, 0.9f, 1000);
        person.put("osman",
                   Person.getBuilder()
                         .withName("osman")
                         .withSurname("yay")
                         .build());

        person.put("mehmet",
                   Person.getBuilder()
                         .withName("mehmet")
                         .withSurname("yay")
                         .build());
        person.put("mehmet",
                   Person.getBuilder()
                         .withName("mehmet")
                         .withSurname("lol")
                         .build());
        Set<String> keySet = person.keySet();
        for (String string : keySet) {
            Person person2 = person.get(string);
            System.out.println(person2);
        }

        Collection<Person> values = person.values();
        for (Person person2 : values) {
            System.out.println(person2);
        }

        Set<Entry<String, Person>> entrySet = person.entrySet();
        for (Entry<String, Person> entry : entrySet) {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        }
    }
}
