package org.lanqiao.bean;

import java.util.List;

/**
 * Created by Reus_cy on 2017/9/4.
 */
public class TeacherClass {
    private Teacher teacher;
    private  Class classes;
    private List<Student> studentList;
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Class getClasses() {
        return classes;
    }

    public void setClasses(Class classes) {
        this.classes = classes;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "TeacherClass{" +
                "teacher=" + teacher +
                ", classes=" + classes +
                ", studentList=" + studentList +
                '}';
    }
}
