package com.gamesgo;

import java.util.ArrayList;

public  class Pc extends Console{

    private String muis;
    private String keyboard;
    private static ArrayList<Game> pcGames;

    public Pc(String name, String muis, String keyboard) {
        super(name);
        this.muis = muis;
        this.keyboard = keyboard;
        this.pcGames = new ArrayList<>();
    }


    public static void allActionGamesPc() {
        Pc pc = new Pc("Pc", "Razer", "gembird");
        Game game = new Game("Call of duty black ops", 20,  "Action");
        Game game1 = new Game("Battlefield 4", 20, "Action");

        consoles.add(pc);
        pcGames.add(game);
        pcGames.add(game1);
        System.out.println("Name: " + game.getName() + "\n" + "Price: " + game.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game.getGenre() + "\n" + "\n" + "Name: " + game1.getName() + "\n" + "Price: " + game1.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game1.getGenre());
    }

    public static void allSportGamesPc() {
        Pc pc = new Pc("Pc", "Razer", "gembird");
        Game game2 = new Game("Fifa 21", 50, "Sport");
        Game game3 = new Game("NBA2K", 50, "Sport");

        consoles.add(pc);
        pcGames.add(game2);
        pcGames.add(game3);
        System.out.println("Name: " + game2.getName() + "\n" + "Price: " + game2.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game2.getGenre() + "\n" + "\n" + "Name: " + game3.getName() + "\n" + "Price: " + game3.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game3.getGenre());
    }

    @Override
    public void designConsole(){
        System.out.println("Measurement pc: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }


    public String combineSet() {
        return this.muis + " & " + this.keyboard;
    }

    public String getMuis() {
        return muis;
    }

    public void setMuis(String muis) {
        this.muis = muis;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard)     {
        this.keyboard = keyboard;
    }
}
