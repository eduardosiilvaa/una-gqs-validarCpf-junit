package com.validarcpf;

import java.util.Scanner;

public class ValidadorCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        
        if (validarCpf(cpf)) {
            System.out.println("Bem vindo(a)!");
        } else {
            System.out.println("Tente novamente mais tarde.");
        }
    }

    public static boolean validarCpf(String cpf) {
        return cpf.length() == 11;
    }
}
