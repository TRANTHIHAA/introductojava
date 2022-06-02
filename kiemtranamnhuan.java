package com.codegym;

import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap nam: ");
        year = scanner.nextInt();
       if(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0)) {
           System.out.println("La nam nhuan! ");
       } else {
           System.out.println("ko phai nam nhuan");
       }
    }
}
