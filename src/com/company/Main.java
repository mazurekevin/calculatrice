package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int j = 0;
        int res = 0;
	System.out.println("1 addition, 2 soustraction, 3 multiplication, 4 division ");
        Scanner scan = new Scanner(System.in);
        j = scan.nextInt();

        System.out.println("taper vos 2 nombres: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        switch (j){
            case 1:
                res = fonction.addition(a,b);
                System.out.println("Le résultat est : "+res);
            break;
            case 2:
                res = fonction.soustraction(a,b);
                System.out.println("Le résultat est : "+res);
            break;
            case 3:
                res = fonction.multiplication(a,b);
                System.out.println("Le résultat est : "+res);
            break;
            case 4:
                res = fonction.division(a,b);
                System.out.println("Le résultat est : "+res);
            break;
            default:
            System.out.println("réessaye");
            break;
        }
    }
}
