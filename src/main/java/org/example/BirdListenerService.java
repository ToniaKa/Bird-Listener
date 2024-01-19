package org.example;

import java.util.Scanner;

public class BirdListenerService {
    public void startTheGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        while (true) {
            System.out.println("Пожалуйста выберите какую птицу вы бы хотели послушать: А - если хотетите услышать кукушку, В - если хотите услышать соловья, Х - для выхода из программы.");
            String command = scanner.next();
            if ("A".equals(command)) {
                BirdUtils.songOfCuckoo();
            } else if ("B".equals(command)) {
                BirdUtils.songOfNightingale();
            } else {
                System.out.println("До свидания!");
                return;
            }
        }
    }
}
