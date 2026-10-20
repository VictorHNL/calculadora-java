import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String question;

        do {

            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");

            option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.println("Número - 1");
                    double number1 = scanner.nextDouble();

                    System.out.println("Número - 2");
                    double number2 = scanner.nextDouble();

                    double addition = number1 + number2;
                    System.out.println("Resultado: " + addition);
                }

                case 2 -> {
                    System.out.println("Número - 1");
                    double number1 = scanner.nextDouble();

                    System.out.println("Número - 2");
                    double number2 = scanner.nextDouble();

                    double subtraction = number1 - number2;
                    System.out.println("Resultado: " + subtraction);
                }

                case 3 -> {
                    System.out.println("Número - 1");
                    double number1 = scanner.nextDouble();

                    System.out.println("Número - 2");
                    double number2 = scanner.nextDouble();

                    double multiplication = number1 * number2;
                    System.out.println("Resultado: " + multiplication);
                }

                case 4 -> {
                    System.out.println("Número - 1");
                    double number1 = scanner.nextDouble();

                    System.out.println("Número - 2");
                    double number2 = scanner.nextDouble();
                    if (number2 == 0 ){
                        System.out.println("Não é possivel dividir por zero");
                    } else {
                        double division = number1 / number2;
                        System.out.println("Resultado: " + division);
                    }
                }
                default -> System.out.println("Selecione uma opção válida");

            };

            System.out.println("Deseja continuar utilizando a calculadora (s/n)?");
            question = scanner.next();

        } while (question.equalsIgnoreCase("s"));

    }
}
