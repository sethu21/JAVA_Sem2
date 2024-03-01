package model;

public class Professor {
    private long Prof_ID;
    private String Prof_name;
    private String Prof_surname;
    private  Degree profdegree;
private static long counter = 0;


///// Getter
    public long getProf_ID() {

        return Prof_ID;
    }



    public String getProf_name() {
        return Prof_name;
    }



    public String getProf_surname() {
        return Prof_surname;
    }



    public Degree getDegree() {
        return profdegree;
    }


    //// Setter
    public void setProf_ID() {
        this.Prof_ID= counter;
        counter++;
    }
    public void setProf_name(String prof_name) {
        if (prof_name != null && prof_name.matches("[A-Z]{1}[a-z]{1,20}"))
            this.Prof_name= prof_name;
        else
            this.Prof_name = "undefined";

    }
    public void setProf_surname(String prof_surname) {
        if (prof_surname!= null && prof_surname.matches("[A-Z]{1}[a-z]{1,20}"))
            this.Prof_surname= prof_surname;
        else
            this.Prof_surname = "undefined";
    }

    public void setDegree(Degree degree) {
        if(degree != null)
            this.profdegree = degree;
        else
            this.profdegree = Degree.other;
    }
///// constructor

    public Professor(){
        setProf_ID();
        setProf_name("John");
        setProf_surname("wick");
        setDegree(Degree.other);
    }
    public Professor(String prof_name, String prof_surname, Degree degree) {
        setProf_ID();
        setProf_name(prof_name);
        setProf_surname(prof_surname);
        setDegree(profdegree);

    }

    @Override
    public String toString() {
        return "Professor{" +
                "Prof_ID=" + Prof_ID +
                ", Prof_name='" + Prof_name + '\'' +
                ", Prof_surname='" + Prof_surname + '\'' +
                ", Degree='" + profdegree + '\'' +
                '}';
    }
}
