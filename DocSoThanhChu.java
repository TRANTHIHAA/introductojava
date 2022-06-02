package com.codegym;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("nhap so muon doc: ");
        int width = so.nextInt();
        int dv = width % 10;
        width /= 10;
        int chuc = width % 10;
        int tram = width / 10;
        switch (tram){
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("Mot tram ");
                break;
            case 2:
                System.out.print("Hai tram ");
                break;
            case 3:
                System.out.print("Ba tram ");
                break;
            case 4:
                System.out.print("Bon tram ");
                break;
            case 5:
                System.out.print("Nam tram ");
                break;
            case 6:
                System.out.print("Sau tram ");
                break;
            case 7:
                System.out.print("Bay tram ");
                break;
            case 8:
                System.out.print("Tam tram ");
                break;
            case 9:
                System.out.print("Chin tram ");
                break;
            default:
                System.out.print("Chịu ko đọc được");
        }
        switch (chuc) {
            case 0:
                if(tram == 0){
                    System.out.print("");
                } else if(dv == 0){
                    System.out.println("");
                } else {
                    System.out.println("linh");
                }
                break;
            case 1:
                System.out.print("muoi ");
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon muoi ");
                break;
            case 5:
                System.out.print("nam muoi ");
                break;
            case 6:
                System.out.print("sau muoi ");
                break;
            case 7:
                System.out.print("bay muoi ");
                break;
            case 8:
                System.out.print("tam muoi ");
                break;
            case 9:
                System.out.print("chin muoi ");
                break;
            default:
                System.out.print("");
        }
        switch (dv){
            case 0:
                if(tram == 0 && chuc == 0) {
                    System.out.println("Khong");
                } else {
                    System.out.println("");
                }

                break;
            case 1:
                System.out.print("Mot  ");
                break;
            case 2:
                System.out.print("Hai  ");
                break;
            case 3:
                System.out.print("Ba  ");
                break;
            case 4:
                System.out.print("Bon  ");
                break;
            case 5:
                System.out.print("Nam  ");
                break;
            case 6:
                System.out.print("Sau  ");
                break;
            case 7:
                System.out.print("Bay  ");
                break;
            case 8:
                System.out.print("Tam  ");
                break;
            case 9:
                System.out.print("Chin  ");
                break;
            default:
                System.out.print("Chịu ko đọc được");

        }

    }
}
