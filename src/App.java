import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        showMenu(scanner);
        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
        int option;
        do {
            System.out.println("============================");
            System.out.println(" Menu clase 5");
            System.out.println("----------------------------");
            System.out.println("1. Prueba del ciclo while");
            System.out.println("2. Prueba del ciclo do-while");
            System.out.println("3. Prueba del ciclo for");
            System.out.println("0. Salir de la aplicación");
            System.out.print("Ingresa su opción: ");
            option = scanner.nextInt(); //
            scanner.nextLine(); // Limpiar buffer = Gastar el <ENTER>
            switch (option) {
                case 1:
                    whileTest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.err.println("Ingrese una opción válida");
                    break;
            }
            if (option != 0) {
                pressEnter(scanner);
            }
        } while (option != 0);
    }

    private static void pressEnter(Scanner scanner) {
        System.out.print("Presione ENTER para continuar.");
        scanner.nextLine();
    }

    private static void forTest() {
        for (int i = 0; i < 10; i += 3) {
            System.out.println(--i);
        }
        System.out.println("You win!");
    }

    private static void doWhileTest() {
        var counter = 0;
        do {
            System.out.println(counter);

            // avance
            counter--;
        } while (counter > 0);
        System.out.println("Boom!");
    }

    private static void whileTest() {
        var counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
