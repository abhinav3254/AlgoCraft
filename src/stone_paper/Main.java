package stone_paper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }


    private static void start() {
        System.out.println("Welcome to STONE PAPER Game...");

        do {
            System.out.println("1. For stone");
            System.out.println("2. For paper");
            System.out.println("3. For scissor");
            System.out.println("Press any key to exit");

            Scanner sc = new Scanner(System.in);
            short input = sc.nextShort();
            if (input  < 1 && input > 3) {
                System.out.println("Exit");
                break;
            }
            Grammar grammar = new Grammar();
            grammar.result(input-1);
        } while (true);

    }
}
