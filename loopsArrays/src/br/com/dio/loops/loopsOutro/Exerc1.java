package br.com.dio.loops.loopsOutro;

import java.util.Scanner;

public class Exerc1 {

//    Faça um programa que leia um nome de usuário e a sua senha e não aceite a
//    senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando
//    a pedir as informações.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        String senha;

        System.out.println("Entre com seu nome ");
        nome = scan.next();

        while (true){
            System.out.println("Entre com sua senha ");
            senha = scan.next();
            if (senha.equals(nome)){
                System.out.println("Senha invalida");
            }else{
                break;
            }
        }
            System.out.println("Nome " + nome);
            System.out.println("Senha " + senha);

    }
}
