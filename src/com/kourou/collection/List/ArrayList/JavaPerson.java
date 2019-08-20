package com.kourou.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author： kourou
 * @Data： 2019/8/19 10:53
 * @Description：
 */

class Person{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
public class JavaPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("zhangsan",21));
        personList.add(new Person("lisi",22));
        personList.add(new Person("wangwu",23));

        personList.remove(new Person("lisi",22));
        System.out.println(personList.contains(new Person("wangwu",23)));
        for (Person p : personList){
            System.out.println(p);
        }
    }
}
