package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoDados {
    Scanner scan = new Scanner(System.in);
    Dados dados = new Dados();
    public boolean volverLanzar;
    int wins = 0;
    int loses = 0;

    public static ArrayList<Player> playerList;

    public JuegoDados(ArrayList<Player> playersList) {
        this.playerList = playersList;
    }

    public void play(Menu menu){
        System.out.println("Introduzca un apodo:");
        volverLanzar = true;
        String name = scan.nextLine();
        playerList.add(new Player(name));
        for (Player player : playerList) {
            if (player.getName().equals(name)){
                while(volverLanzar) {
                    dados.play();
                    if (dados.win) {
                        player.setWins(wins = wins + 1);
                        System.out.println(player.getName() + " " + player.getWins() + " " + player.getLoses());
                    } else {
                        player.setLoses(loses = loses + 1);
                        System.out.println(player.getName() + " " + player.getWins() + " " + player.getLoses());
                    }
                    menu.volverTirarMenu(menu);
                }
            }
        }
    }






}
