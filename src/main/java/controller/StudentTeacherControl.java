package controller;
import  data.model.*;
import javax.faces.bean.ManagedBean;



import data.model.Student;

@ManagedBean(name = "STcontrol")

public class StudentTeacherControl {

    Student st=new Student();
    Teacher tc=new Teacher();
    JDBC jb=new JDBC();

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public Teacher getTc() {
        return tc;
    }

    public void setTc(Teacher tc) {
        this.tc = tc;
    }



    public JDBC getJb() {
        return jb;
    }

    public void setJb(JDBC jb) {
        this.jb = jb;
    }


    public String isNextPage()
    {
        return "huma";
    }
}
