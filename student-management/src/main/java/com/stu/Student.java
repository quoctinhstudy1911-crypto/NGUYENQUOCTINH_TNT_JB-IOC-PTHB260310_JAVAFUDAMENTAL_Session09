package com.stu;

public class Student {
    private static int count;
    private final double MIN_GPA= 0.0;
    private final double MAX_GPA= 4.0;
    private String id;
    private String fullName;
    private int age;
    private float gpa;

    public Student(String id, String fullName, int age, float gpa) {

        this.id = id;
        this.fullName = fullName;
        this.age = age;
        setGpa(gpa);
        count++;
    }

    public Student() {
        count++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {

        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa<=MAX_GPA && gpa >=MIN_GPA)
        {
            this.gpa = gpa;
        }
        else throw new IllegalArgumentException("LỖI: GPA KHÔNG HỢP LE");

    }

    public static int getCount() {
        return count;
    }

    public void printInfo()
    {
        System.out.println("Thông tin: ");
        System.out.println("Mã sinh viên: "+id);
        System.out.println("Họ tên của sinh viên: "+fullName);
        System.out.println("Tuổi của sinh viên: "+ age);
        System.out.println("GPA của sinh viên: "+gpa);

    }

}
