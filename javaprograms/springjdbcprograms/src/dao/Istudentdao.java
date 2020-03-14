package dao;

import java.util.List;

import data.student;

public interface Istudentdao {
public void create (student student);
//this method is used to create a record in the student table
public student getstudent(Integer id);
public List<student> liststudents();
public void delete(Integer id);
public void update(student student);
public boolean saveStudentByPst(final student e);
}
