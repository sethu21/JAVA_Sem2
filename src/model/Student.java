package model;

public class Student {
    private long student_ID;
    private String student_name;
    private String student_surname;

    public long getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(long student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_surname() {
        return student_surname;
    }

    public void setStudent_surname(String student_surname) {
        this.student_surname = student_surname;
    }

    public Student(long student_ID, String student_name, String student_surname) {
        this.student_ID = student_ID;
        this.student_name = student_name;
        this.student_surname = student_surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_ID=" + student_ID +
                ", student_name='" + student_name + '\'' +
                ", student_surname='" + student_surname + '\'' +
                '}';
    }
}
