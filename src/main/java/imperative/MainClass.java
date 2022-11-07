package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Amit", 31, Gender.Male),
                new Person("Pragya", 31, Gender.Female),
                new Person("Puddu", 30, Gender.Female),
                new Person("Zainab", 32, Gender.Transgender),
                new Person("Aher", 34, Gender.Transgender)
        );

        List<Person> females = new ArrayList<>();

        for (Person p: people) {

            if (p.gender.equals(Gender.Female))
            {
                females.add(p);
            }
        }

        System.out.println(females);

        people.stream().filter(p -> p.gender.equals(Gender.Female))
                .collect(Collectors.toList()).forEach(System.out::println);

        Predicate<Person> transFilter = a -> a.gender.equals(Gender.Transgender);
        people.stream().filter(transFilter).forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final int age;
        private final Gender gender;

        public Person(String name, int age, Gender gender) {
            this.age = age;
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }
}
