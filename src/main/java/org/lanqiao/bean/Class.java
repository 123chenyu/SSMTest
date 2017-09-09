package org.lanqiao.bean;

/**
 * Created by Reus_cy on 2017/9/4.
 */
public class Class {
    private int classId;
    private String className;
    private int teacherId;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
