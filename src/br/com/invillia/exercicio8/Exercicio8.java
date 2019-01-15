package br.com.invillia.exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static final int LIMIT = 1000000;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String a, b, c = "";
        a = String.valueOf(scn.nextInt());
        b = String.valueOf(scn.nextInt());

        while (true) {
            if (!a.isEmpty()) {
                c += a.charAt(0);
                a = a.substring(1);
            }
            if (!b.isEmpty()) {
                c += b.charAt(0);
                b = b.substring(1);
            }
            if (a.isEmpty() && b.isEmpty()) {
                break;
            }
        }
        if (Integer.parseInt(c) > LIMIT) {
            System.out.println(-1);
        } else {
            System.out.println(c);
        }
    }
}
