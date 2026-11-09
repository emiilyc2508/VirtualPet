package Loops;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        System.out.print("Type pet name: ");
        String nombre = Teclat.llegirString();


        int tipo = 0;
        while (tipo != 1 && tipo != 2) {
            System.out.print("Type pet: (1 = dog, 2 = cat): ");
            tipo = Teclat.llegirInt();

            Mascota mascota = new Mascota(nombre, tipo == 1);


            int opcion = -1;
            while (opcion != 0) {
                System.out.println("\n" + mascota);
                System.out.println("1. Sleep");
                System.out.println("2. Play");
                System.out.println("3. Eat");
                System.out.println("4. Clean");
                System.out.println("5. Attack");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                opcion = Teclat.llegirInt();

                switch (opcion) {
                    case 1 -> mascota.sleep();
                    case 2 -> mascota.play();
                    case 3 -> mascota.eat();
                    case 4 -> mascota.clean();
                    case 5 -> mascota.attack();
                    case 0 -> System.out.println("EXIT.");
                    default -> System.out.println("Invalid option.");
                }

                if (opcion != 0 && mascota.isDie()) {
                    System.out.println("\n" + mascota);
                    System.out.println("PET DIE: " + mascota.getName() + " dies.");
                    break;
                }


            }
        }
    }
}