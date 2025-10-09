package Sept202024;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student{
    String name;

    Integer id;
    Integer marks;
    String course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                ", course='" + course + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(String name, Integer id, Integer marks, String course) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.course = course;
    }
}


public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.stream().filter(i -> i>20)
                .forEach(System.out::println);

        List<Integer> list2 = list.stream().filter(i -> i>30)
                .collect(Collectors.toList());
        System.out.println(list2);

        list.stream().map(i -> i+11)
                .forEach(System.out::println);

        //max value of list
        Optional<Integer> maxValue = list.stream().max((o1, o2)->o1.compareTo(o2));
        System.out.println("Max value: "+maxValue);

        //min value of list
        Optional<Integer> minValue = list.stream().min((o1, o2)->o1.compareTo(o2));
        System.out.println("Min value: "+minValue);

        Optional<Integer> minValue2 = list.stream().min((o1, o2)->o2.compareTo(o1));  //o2.compareTo(o1)  - this gives max

        //Students list
        List<Student> students = Arrays.asList(
                new Student("varun",11,89,"Maths"),
                new Student("Akhil",9,67,"English"),
                new Student("meera",23,88,"English"),
                new Student("sai",14,89,"Physics"),
                new Student("Joe",25,77,"Maths"),
                new Student("Mat",16,90,"Chemistry")
        );

        System.out.println("------------------------------------------------------------------------");
        //sort based on student id
        List<Student> sortedList1 = students.stream()
                .sorted(Comparator.comparingInt(student -> student.getId()))   //natural sort order
                .collect(Collectors.toList());
        System.out.println(sortedList1);

        //sort based on id -desc order
        List<Student> sortedList2 = students.stream()
                .sorted((s1,s2) -> s2.getId().compareTo(s1.getId()))   //natural sort order
                .collect(Collectors.toList());
        System.out.println(sortedList2);

        //Grouping : Ex: group by course name
        Map<String, List<Student>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(student -> student.getCourse()));
        Map<String,Integer> studentCountForEachSource = new HashMap<>();

        for(Map.Entry<String, List<Student>> entry : groupedStudents.entrySet()){
            studentCountForEachSource.put(entry.getKey(),entry.getValue().size());
        }
        System.out.println(studentCountForEachSource);

        //Above example - alternate way using Collectors.counting()
        Map<Object, Long> studentCountMap = students.stream()
                        .collect(Collectors.groupingBy(student -> student.getCourse(),Collectors.counting()));
        System.out.println(studentCountMap);


        //occurrence of chars in string
        String str = "the great wall of china";
        Map<String,Long> mapStr = Arrays.stream(str.split(""))
                .filter(ch -> !ch.equals(" "))
                                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mapStr);


    }
}
