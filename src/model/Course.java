package model;

public class Course {
    private long c_ID;
    private String title;
    private int creditPoint;
    private Professor professor;
    private static long counter = 100000;
    public long getC_ID() {
        return c_ID;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditPoint() {
        return creditPoint;
    }

    public Professor getProfessor() {
        return professor;
    }

    // setter

    public void setC_ID() {
        this.c_ID = counter;
        counter++;
    }

    public void setTitle(String title) {
        if (title != null && title.matches("[A-Z a-z 0-9]{4,40}"))
            this.title= title;
        else
            this.title = "undefined";
    }

    public void setCreditPoint(int creditPoint) {
        if (creditPoint > 0 && creditPoint <= 20)
            this.creditPoint = creditPoint;
        else
            this.creditPoint = 2;
        this.creditPoint = creditPoint;
    }

    public void setProfessor(Professor professor) {
        if(professor != null)
            this.professor = professor;
        else
            this.professor = new Professor();

    }

    public Course(){
        setC_ID();
        setTitle("Java");

        setCreditPoint(4);
        setProfessor(new Professor());
    }
    public Course(String title, int creditPoint, Professor professor){
        setC_ID();
        setTitle(title);
        setCreditPoint(creditPoint);
        setProfessor(professor);
    }

    @Override
    public String toString() {
        return c_ID + ": " + title +" (" + creditPoint + "cp), " + professor.toString();
    }
}
