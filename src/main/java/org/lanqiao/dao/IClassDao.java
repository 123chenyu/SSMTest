package org.lanqiao.dao;

import org.lanqiao.bean.Student;
import org.lanqiao.bean.TeacherClass;

import java.util.List;

/**
 * Created by Reus_cy on 2017/9/4.
 */
public interface IClassDao {
    List<TeacherClass> getClassInfo();


    List<TeacherClass> getStuById(int id);
}
