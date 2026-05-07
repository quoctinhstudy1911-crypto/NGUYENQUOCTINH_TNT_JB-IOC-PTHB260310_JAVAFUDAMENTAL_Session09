package com.stu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào chiều dài của HCM: ");
        double height = scanner.nextInt();
        System.out.println("Vui lòng nhập vào chiều rộng của HCM: ");
        double width = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Diện tích của hình chữ nhật là: " + rectangle.getArea());
        System.out.println("Chu vi của hình chữ nhật là: " + rectangle.getPerimeter());


    }
}