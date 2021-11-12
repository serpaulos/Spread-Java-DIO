package br.com.dio.loops;

import java.util.Scanner;

public class Nota {
    /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido
    e continue pedindo
    até que o usuário informe um valor válido.
    */

    public static void main(String[] args) {

        int nota;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Digite uma nota");
            nota = scan.nextInt();
            if(nota >= 0 && nota <10){
                System.out.println("Valor Valido");
                break;
            }else{
                System.out.println("Valor Invalido");
            }
        }

        System.out.println("O numero foi " + nota);
    }

}
