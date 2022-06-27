package main;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de algorítimos na soma:");


        int N = sc.nextInt();
        int soma = 0;

        for (int I = 0; I < N; I++) {

            System.out.print("Digite os números que deseja somar: ");
            int x = sc.nextInt();
            soma = soma + x;


        }
        System.out.print("O soma dos números foi: " + soma);

        sc.close();


    }
}