package service;

import model.Course;
import model.Degree;
import model.Professor;
import model.Student;

public class MainService {
    public static void main(String[] args) {
        Professor pr1 = new Professor();
        System.out.println(pr1);
        Professor pr2 = new Professor("Sethu","Selvam", Degree.mg);
        System.out.println(pr2);

        Student st1 = new Student();
        System.out.println(st1);

        Student st2 = new Student("Viktor", "Kokin");
        System.out.println(st2);

        Course c1 = new Course();
        System.out.println(c1);

        Course c2 = new Course("Data structure ", 4, pr2);
        System.out.println(c2);


    }
}
