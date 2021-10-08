package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    JuegoDados juegoDados;
    boolean salir = true;

    public Menu (ArrayList<Player> playerList){
        juegoDados = new JuegoDados(playerList);
    }

    public void show(Menu menu) {
        while(salir){
        String option;

        System.out.println("Elige un juego");
        System.out.println();
        System.out.println("1--> Dados");
        System.out.println("2--> Parchís");
        System.out.println("3--> Tic Tac Toe");
        System.out.println("4--> Salir");
        option = scan.nextLine();


            switch (option) {
                case "1":
                    juegoDados.play(menu);
                    break;
                case "2":
                    System.out.println("Juego no disponible temporalmente");
                    break;
                case "3":
                    System.out.println("Juego no disponible temporalmente");
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    System.out.println("Escoja una opción existente");
            }
        }
    }
    public void volverTirarMenu(Menu menu) {
        System.out.println("Quieres volver a lanzar?");

        System.out.println("1. Si");
        System.out.println("2. No");
        String op = scan.nextLine();

        switch (op) {
            case "1":
                juegoDados.volverLanzar = true;
                break;
            case "2":
                juegoDados.volverLanzar = false;
                show(menu);
                break;
            default:
                System.out.println("¡Seleccione una opcion existente!");
        }
    }
}