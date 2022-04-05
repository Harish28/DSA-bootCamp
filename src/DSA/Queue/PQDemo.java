package DSA.Queue;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Comparator;
import java.util.PriorityQueue;

class Person implements Comparable<Person>{
    private Integer id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }
}
class PersonComp implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
public class PQDemo {
    public static void main(String[] args) {
        PriorityQueue<Person> pq = new PriorityQueue<>();
        Person ram = new Person(10, "Aam");
        Person shyam = new Person(100, "AShyam");
        Person ravi = new Person(1, "Ravi");
        pq.add(ram);
        pq.add(shyam);
        pq.add(ravi);
        for (Person i : pq) {
            System.out.println(i);
        }
        System.out.println("------------------");
        PriorityQueue<Person> pq1 = new PriorityQueue<>(new PersonComp());
        pq1.add(ram);
        pq1.add(shyam);
        pq1.add(ravi);
        for (Person i : pq1) {
            System.out.println(i);
        }

    }
}
