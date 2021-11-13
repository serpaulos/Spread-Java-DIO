package br.com.dio.loops.loopsOutro;

import java.util.Scanner;

public class Valida {
//        Faça um programa que leia e valide as seguintes informações:
//        Nome: maior que 3 caracteres;
//        Idade: entre 0 e 150;
//        Salário: maior que zero;
//        Sexo: 'f' ou 'm';
//        Estado Civil: 's', 'c', 'v', 'd';
    public static void main(String[] args) {

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Entre com seu nome ");
            nome = scan.next();
            if (nome.length() < 3) {
                System.out.println("Entre com minimo de 3 caracteres: ");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Entre com sua idade ");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("Entre com valores entre 0 e 150: ");
            }
        }

        while (true) {
            System.out.println("Entre com seu salario ");
            salario = scan.nextDouble();

            if (salario > 0) {
                break;
            } else {
                System.out.println("Entre com valores acima de 0: ");
            }
        }
        while (true) {
            System.out.println("Entre com seu genero/sexo ");
            sexo = scan.next();
            sexo.toLowerCase();

            if (sexo.equals("f") || sexo.equals("m")) {
                break;
            } else {
                System.out.println("Entre com valores validos como f ou m: ");
            }
        }
        while (true) {
            System.out.println("Entre com seu Estado Civil ");
            estadoCivil = scan.next();
            estadoCivil.toLowerCase();

            if (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")) {
                break;
            } else {
                System.out.println("Entre com valores validos como s, c, v, d: ");
            }
        }


    }

}
