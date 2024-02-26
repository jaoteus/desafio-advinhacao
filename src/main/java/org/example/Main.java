package org.example;

public class Main {

    public static int entradaUsuario;
    public static int numeroAleatorio;
    public static java.util.Random aleatorio = new java.util.Random();
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            try {
                numeroAleatorio = aleatorio.nextInt(1, 6);
                System.out.print("Digite um número de 1 a 5: ");
                entradaUsuario = scanner.nextInt();
                if (entradaUsuario == numeroAleatorio) {
                    System.out.println("Você acertou!!!");
                } else {
                    System.out.println("Você errou :(");
                    System.out.println("O número escolhido foi " + numeroAleatorio);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Digite apenas números na próxima!");
                break;
            }
        }
    }
}