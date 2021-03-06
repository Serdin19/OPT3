package com.gamesgo;

import java.util.ArrayList;

public  class Xbox extends Console{

    private String xboxController;
    private static ArrayList<Game> xboxGames;

    public Xbox(String name, String xboxController) {
        super(name);
        this.xboxController = xboxController;
        this.xboxGames = new ArrayList<>();
    }


    public static void allActionGamesXbox() {
        Xbox xbox = new Xbox("Xbox", "aesthetics");
        Game game = new Game("Halo 3", 10,  "Action");
        Game game1 = new Game("Forza Horizon 4", 30, "Sport");

        consoles.add(xbox);
        xboxGames.add(game);
        xboxGames.add(game1);
        System.out.println("Name: " + game.getName() + "\n" + "Price: " + game.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game.getGenre() + "\n" + "\n" + "Name: " + game1.getName() + "\n" + "Price: " + game1.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game1.getGenre());
    }

    public static void allSportGamesXbox() {
        Xbox xbox = new Xbox("Xbox", "aesthetics");
        Game game2 = new Game("Fifa 21", 20, "Sport");
        Game game3 = new Game("NBA2k", 20, "Sport");

        consoles.add(xbox);
        xboxGames.add(game2);
        xboxGames.add(game3);
        System.out.println("Name: " + game2.getName() + "\n" + "Price: " + game2.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game2.getGenre() + "\n" + "\n" + "Name: " + game3.getName() + "\n" + "Price: " + game3.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game3.getGenre());
    }

    @Override
    public void designConsole(){
        System.out.println("Measurement xbox: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }

    public String getXboxController() {
        return xboxController;
    }

    public void setXboxController(String xboxController) {
        this.xboxController = xboxController;
    }
}

