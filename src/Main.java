import java.util.Scanner;

public class Main {

    public static double readNumber(Scanner scanner) {
        return scanner.nextDouble();
    }
    public static int menuOption(Scanner scanner){
        while (true) {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");

            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();

                if (option >= 1 && option <= 4) {
                    return option;
                }
            } else {
                scanner.next();
            }

            System.out.println("Opção inválida. Digite um número de 1 a 4.");
        }
    }
    public static double caseAddition(Scanner scanner){
        double number1;
        double number2;

        while (true) {
            System.out.println("Número - 1");
            if (scanner.hasNextDouble()) {
                number1 = readNumber(scanner);
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        while (true) {
            System.out.println("Número - 2");
            if (scanner.hasNextDouble()) {
                number2 = readNumber(scanner);
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        return number1 + number2;
    }
    public static double caseSubtraction(Scanner scanner){
        double number1;
        double number2;

        while(true){
            System.out.println("Número - 1");
            if(scanner.hasNextDouble()){
                number1 = readNumber(scanner);
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        while(true){
            System.out.println("Número - 2");
            if(scanner.hasNextDouble()){
                number2 = readNumber(scanner);
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        return number1 - number2;
    }
    public static double caseMultiplication(Scanner scanner){
        double number1;
        double number2;

        while(true){
            System.out.println("Número - 1");
            if(scanner.hasNextDouble()){
                number1 = readNumber(scanner);
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        while(true){
            System.out.println("Número - 2");
            if(scanner.hasNextDouble()){
                number2 = readNumber(scanner);
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        return number1 * number2;
    }
    public static double caseDivision(Scanner scanner){
        double number1;
        double number2;

        while(true){
            System.out.println("Número - 1");
            if(scanner.hasNextDouble()){
                number1 = readNumber(scanner);
                break;
            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }

        while(true){
            System.out.println("Número - 2");
            if(scanner.hasNextDouble()){
                number2 = readNumber(scanner);
                if (number2 == 0){
                    System.out.println("Não é possivel dividir por zero");

                } else {
                    return number1 / number2;
                }

            } else {
                scanner.next();
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String question;
        int option;

        do {
            option = menuOption(scanner);

            switch (option){
                case 1 -> {
                    double result = caseAddition(scanner);
                    System.out.println("Resultado: " + result);
                }

                case 2 -> {
                    double result = caseSubtraction(scanner);
                    System.out.println("Resultado: " + result);
                }

                case 3 -> {
                    double result = caseMultiplication(scanner);
                    System.out.println("Resultado: " + result);
                }

                case 4 -> {
                    double result = caseDivision(scanner);
                    System.out.println("Resultado: " + result);
                }
            };

            do {
                System.out.println("Deseja continuar utilizando a calculadora (s/n)?");
                question = scanner.next();

                if (!question.equalsIgnoreCase("s")
                        && !question.equalsIgnoreCase("n")) {
                    System.out.println("Resposta inválida. Digite s ou n.");
                }
            } while (!question.equalsIgnoreCase("s")
                    && !question.equalsIgnoreCase("n"));

        } while (question.equalsIgnoreCase("s"));


    }
}
