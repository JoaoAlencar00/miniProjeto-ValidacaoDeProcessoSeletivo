package sistemaDeContagemRegressivaParaUmFoguete;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para a contagem regressiva: ");
        int number = scanner.nextInt();

        try {
            contar(number);

        }catch (NumeroInvalidoException exception){
            System.out.println("Número deve ser maior que zero");
            return;
        }
    }
    static void contar(int number) throws NumeroInvalidoException{
        if(number <= 0) throw new NumeroInvalidoException();

        int contagem = number;

        for (int i = 1; i <= number; i++) {
            System.out.println("Contagem: " + contagem--);
        }
        System.out.println("Lançamento!");
    }
}

