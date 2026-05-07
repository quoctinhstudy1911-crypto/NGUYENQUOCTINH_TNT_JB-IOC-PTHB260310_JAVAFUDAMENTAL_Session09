package com.stu;
public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("1","Nguyễn Thị Kim Tỏa",21,(float)4.0);
            Student student2 = new Student("2","Nguyễn Quốc Tịnh",21,(float)3.0);
            Student student3 = new Student("3","Nguyễn Thị Kim Yến",21,(float)3.5);
            System.out.println("Danh sách sinh viên");
            student1.printInfo();
            System.out.println();
            student2.printInfo();
            System.out.println();
            student3.printInfo();
            System.out.println();
            System.out.println("Số lượng sinh viên hiện tại "+ Student.getCount());
        }
        catch (RuntimeException e)
        {

            System.out.println( e.getMessage());
        }





    }
}