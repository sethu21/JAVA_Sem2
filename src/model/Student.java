package model;

public class Student {
    private long student_ID;
    private String student_name;
    private String student_surname;
    private static long counter = 0;
    public long getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID() {
        this.student_ID= counter;
        counter++;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        if (student_name != null && student_name.matches("[A-Z]{1}[a-z]{1,20}"))
            this.student_name= student_name;
        else
            this.student_name = "undefined";
    }

    public String getStudent_surname() {
        return student_surname;
    }

    public void setStudent_surname(String student_surname) {
        if (student_surname != null && student_surname.matches("[A-Z]{1}[a-z]{1,20}"))
            this.student_surname= student_surname;
        else
            this.student_surname = "undefined";
    }

    public Student(){
        setStudent_ID();
        setStudent_name("Pablo");
        setStudent_surname("Escobar");
    }

    public Student( String student_name, String student_surname) {
        setStudent_ID();
        setStudent_name(student_name);
        setStudent_surname(student_surname);

    }

    public String toString()
    {
        return student_ID + ": " + student_name + " " + student_surname ;
    }
}
