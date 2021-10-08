package com.company;


public class Dados {

    int dado1;
    int dado2;
    int dado3;
    public static boolean win;
    public static int numberWin;

    public void play() {
        dado1 = (int) (Math.random() * 6 + 1);
        dado2 = (int) (Math.random() * 6 + 1);
        dado3 = (int) (Math.random() * 6 + 1);

        System.out.println(dado1 + " " + dado2 + " " + dado3);
        if (dado1 == dado2 && dado2 == dado3) {
            win = true;
            numberWin++;
            System.out.println("Buena tirada!");
        } else {
            System.out.println("Lanza otra vez");
            win = false;
        }
    }
}