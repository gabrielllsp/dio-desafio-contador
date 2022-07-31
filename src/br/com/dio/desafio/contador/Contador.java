package br.com.dio.desafio.contador;


import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            Calcular calc = new Calcular();

            System.out.println("Digite o primeiro parametro");
            int parametroUm = entrada.nextInt();
            System.out.println("Digite o segundo parametro");
            int parametroDois = entrada.nextInt();

            int contagem = parametroDois - parametroUm;

            do {
                calc.incrementar();
                System.out.println(calc.valor);

            }while(calc.valor < contagem); {
                System.out.println("Calculado com Sucesso!!! ");
            }

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {

            }
        }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

}
