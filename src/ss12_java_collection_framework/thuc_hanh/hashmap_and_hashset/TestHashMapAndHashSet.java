package ss12_java_collection_framework.thuc_hanh.hashmap_and_hashset;

import java.util.*;

public class TestHashMapAndHashSet {
    public static void main(String[] args) {
        Student student1 = new Student("Tai",20,"Da Nang");
        Student student2 = new Student("Chau",17,"Quang Nam");
        Student student3 = new Student("Minh",16,"TT Hue");

        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        Collection<Student> values = studentMap.values();
        for(Student value: values){
            System.out.println(value.toString());
        }
        System.out.println(".......Set...........");
        Set<Student>studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);

        for (Student student: studentSet){
            System.out.println(studentSet.toString());
        }
    }
}
