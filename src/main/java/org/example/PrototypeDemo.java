package org.example;

import java.util.ArrayList;
import java.util.List;

class Student{
    int id;
    String name;
    Student(){}
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class College implements Cloneable{
    List<Student> stdList=new ArrayList<>();
    College(){}
    College(List<Student> stdList){
        this.stdList=stdList;
    }
    void loadStudent(){
        stdList.add(new Student(1,"abi"));
        stdList.add(new Student(2,"aruna"));
        stdList.add(new Student(3,"ananya"));
        stdList.add(new Student(4,"akshara"));
        stdList.add(new Student(5,"deekshitha"));
        //return  stdList;
    }
    List<Student> getStdList(){
        return stdList;
    }


    @Override
    public College clone() {
        List<Student> sList = new ArrayList<>();
        sList.addAll(stdList);
        return new College(sList);
    }
}
public class PrototypeDemo {
    public static void main(String[] args) {
        College c1=new College();
        c1.loadStudent();
        System.out.println(c1.getStdList());

        College c2=c1.clone();
        System.out.println(c2.getStdList());
        c2.getStdList().add(new Student(43,"Neha"));
        System.out.println(c2.getStdList());

    }
}
