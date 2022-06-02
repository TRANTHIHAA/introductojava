package com.codegym;

import java.util.Scanner;

public class TinhSoNgay {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int thang = nhap.nextInt();
        switch (thang) {
            case 2:
                System.out.println("Thang 2 cos 28 hoac 28 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang: "+ thang+" co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + thang + "' has 30 days!");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
