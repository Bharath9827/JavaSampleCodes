package Sept132024;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable{
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    //Can return +ve, -ve, 0

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return Integer.compare(this.id,student.getId());
    }

}

class MyComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if(s1.getId() > s2.getId()) return 1;
        else if(s1.getId() < s2.getId()) return -1;
        else return 0;
    }
}

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(33);
        sortedSet.add(21);
        sortedSet.add(67);
        System.out.println(sortedSet);

        SortedSet<Student> sortedStudentSet = new TreeSet<>();
        sortedStudentSet.add(new Student("chinnu",3));
        sortedStudentSet.add(new Student("Divya",4));
        sortedStudentSet.add(new Student("Nani",7));
        sortedStudentSet.add(new Student("Abhi",1));

        System.out.println(sortedStudentSet);

        SortedSet<Student> sortedStudentSet2 = new TreeSet<>(new MyComp());
        sortedStudentSet2.add(new Student("chinnu",3));
        sortedStudentSet2.add(new Student("Divya",4));
        sortedStudentSet2.add(new Student("Nani",7));
        sortedStudentSet2.add(new Student("Abhi",1));

        System.out.println(sortedStudentSet2);



    }
}
