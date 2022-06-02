package com.codegym;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD: ");
        double rate = 23000;
        double USD = sc.nextDouble();
        double VND = USD * rate;
        System.out.println("VND: "+VND);

    }
}
