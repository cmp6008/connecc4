package edu.psu.ist261.Models;

public class PlayerModel {

    private String name;
    private String color;
    private boolean is_turn;


    public PlayerModel(String name, String color, boolean is_turn){
        this.name = name;
        this.color = color;
        this.is_turn = is_turn;
    }

    //--> Getters
    public String get_name(){
        return this.name;
    }
    public boolean get_turn(){
        return this.is_turn;
    }
    public String get_color(){
        return this.color;
    }

    //--> Setters
    public void set_name(String name){
        this.name = name;
    }
    public void set_color(String color){
        this.color = color;
    }
    public void set_turn(boolean is_turn){
        this.is_turn = is_turn;
    }
}
