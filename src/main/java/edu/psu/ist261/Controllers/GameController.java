package edu.psu.ist261.Controllers;

import edu.psu.ist261.Models.PlayerModel;
import edu.psu.ist261.Models.BoardModel;

public class GameController {

    private PlayerModel player_one;
    private PlayerModel player_two;
    private BoardModel board_model;
    private int last_row_added;

    public GameController(String player_one_name, String player_two_name){
        // Create Players
        this.player_one = new PlayerModel(player_one_name, "yellow", true);
        this.player_two = new PlayerModel(player_two_name, "red", false);
        this.board_model = new BoardModel();
        this.last_row_added = 0;

    }



    public String get_player_one_name(){
        return this.player_one.get_name();
    }

    public String get_player_two_name(){
        return this.player_two.get_name();
    }


    // Return Values
    // -4: Column Full
    // -3: Draw
    // -2: Player Two Wins
    // -1: Player One Wins
    //  0-6: Row added

    public int processTurn(int column){
        // Player one turn
        if(this.player_one.get_turn()){
            // Switch Turns
            this.player_one.set_turn(false);
            this.player_two.set_turn(true);
            int row_added = this.board_model.processTurn(column, 1);
            if(row_added == -1){
                return -4;
            }
            this.last_row_added = row_added;
            int game_status = this.board_model.boardStatus();
            if(game_status == 1){
                return -1;
            }
            else if(game_status == 2){
                return -2;
            }
            else if(game_status == 3){
                return -3;
            }
            return row_added;
        }
        // Player two turn
        else{
            // Switch Turns
            this.player_two.set_turn(false);
            this.player_one.set_turn(true);
            int row_added = this.board_model.processTurn(column, 2);
            if(row_added == -1){
                return -4;
            }
            this.last_row_added = row_added;
            int game_status = this.board_model.boardStatus();
            if(game_status == 1){
                return -1;
            }
            else if(game_status == 2){
                return -2;
            }
            else if(game_status == 3){
                return -3;
            }
            return row_added;
        }

    }

    public int get_last_row_added(){
        return this.last_row_added;
    }






}
