package com_class;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("傻fufu");
        s1.setAge(14);
        s1.show();
        Student s2=new Student("傻fufu",14);
        s2.show();
    }
}
