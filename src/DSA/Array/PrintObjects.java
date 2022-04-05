package DSA.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class PrintObjects {
    public static <T> void printData(T[] arr) {
        for(T a: arr) {
            System.out.println(a.toString());
        }
    }
    public static void main(String[] args) {
        printData(new String[]{"Harish","Aser"});
        printData(new Integer[]{1,2,3,4});
        printData(new Person[]{new Person(1,"Harish"), new Person(2,"Bela"),new Person(3,"Ram")});
        int [] arr = new int[] {1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
        System.out.println(stream.max().getAsInt());
//        List<Integer> arr2 = IntStream.range(1,20).boxed().collect(Collectors.toList());
//        System.out.println(arr2.max().getAsInt());
        IntStream intStream = Arrays.asList(22, 33).stream().mapToInt(i -> i);
        System.out.println(intStream.sum());


        //[] arr = new double[]{1.2,1.3,1.5};
    }
}
