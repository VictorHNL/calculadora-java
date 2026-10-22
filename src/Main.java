import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        String question;

        do {
            while (true) {
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");

                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();

                    if (option >= 1 && option <= 4) {
                        break;
                    }
                } else {
                    scanner.next(); // descarta o texto inválido, por exemplo "abc"
                }

                System.out.println("Opção inválida. Digite um número de 1 a 4.");
            }

            switch (option){
                case 1 -> {
                    double number1;
                    double number2;

                    while (true) {
                        System.out.println("Número - 1");
                        if (scanner.hasNextDouble()) {
                            number1 = scanner.nextDouble();
                            break;
                        } else {
                            scanner.next();
                            System.out.println("Entrada inválida. Digite um número.");
                        }
                    }

                    while (true) {
                        System.out.println("Número - 2");
                        if (scanner.hasNextDouble()) {
                            number2 = scanner.nextDouble();
                            break;
                        } else {
                            scanner.next();
                            System.out.println("Entrada inválida. Digite um número.");
                        }
                    }

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
