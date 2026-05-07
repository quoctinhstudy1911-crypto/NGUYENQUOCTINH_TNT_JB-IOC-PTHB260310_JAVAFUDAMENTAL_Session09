package com.stu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng sách bạn muốn nhập thông tin: ");
        n = scanner.nextInt();
        Book[] listBook = new Book[n];

        for (int i = 0; i < listBook.length; i++) {
            String title,author;
            double price;
            System.out.println("Vui lòng nhập quyển sách thứ "+ (i+1) );
            scanner.nextLine();
            System.out.println("Nhập title: ");
            title = scanner.nextLine();
            System.out.println("Nhập author: ");
            author = scanner.nextLine();
            System.out.println("Nhập price: ");
            price = scanner.nextDouble();
            scanner.nextLine();
            Book book = new Book(title,author,price);
            listBook[i] = book;
        }
        System.out.println("THÔNG TIN CỦA CÁC CUỐN SÁCH");
        for (int i = 0; i < listBook.length; i++) {
            listBook[i].printInfo();
            System.out.println();
        }
    }
}