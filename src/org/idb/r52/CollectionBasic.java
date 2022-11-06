package org.idb.r52;

import java.util.*;

interface ICollection {}
interface IList extends ICollection {}
class IArrayList implements IList {}

public class CollectionBasic {
    static List l;
    
    void a(){
        l = new ArrayList();
        l = new LinkedList();
    }
    void b(){
        l = new LinkedList();
    }
    void c(){
        l = new Vector();
    }
    
    public static void main(String[] args) {
        l = new ArrayList();
        Student s1 = new Student("Mr. A", "JEE");
        Student s2 = new Student("Mr. B", "C#");
        Student s3 = new Student("Mr. C", "PHP");
        Student s4 = new Student("Mr. D", "Python");
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        
        for (int i = 0; i < l.size(); i++) {
            Student s = (Student) l.get(i);
            System.out.println(s.getName() + " " + s.getCourse());
        }
    }
}

class Student {
    private String name;
    private String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    
    
}
