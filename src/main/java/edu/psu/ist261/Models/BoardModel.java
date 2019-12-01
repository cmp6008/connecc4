package edu.psu.ist261.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoardModel {

    private Map<Integer, ArrayList<Integer>> board;

    public BoardModel(){
        this.board = new HashMap<Integer, ArrayList<Integer>>();
        for(int x = 0; x < 7; x++){
            Integer xx = new Integer(x);
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int y = 0; y < 6; y++){ temp.add(0); }
            this.board.put(xx,temp);
        }
    }


    // Input Values
    // player: 1 ? 2
    // column: 0, 1, ...,6
    // Return Values
    // 0-6: row added on
    // -1: column is full
    public int processTurn(int column, int player){
        Integer col_idx = new Integer(column);
        ArrayList<Integer> col = this.board.get(col_idx);
        for(Integer x = 0; x < col.size(); x++){
            Integer xx = new Integer(x);
            if(col.get(xx) == 0){
                col.set(xx, player);
                this.board.replace(col_idx,col);
                return x;
            }
        }
        return -1;
    }


    //Return Values
    // 0: Game has not finished
    // 1: Player one wins
    // 2: Player two wins
    // 3: Draw
    public int boardStatus(){
        ArrayList<ArrayList<Integer>> table = getBoardArrayList();
        if(checkDraw()){
            return 3;
        }
        if(checkPlayerWin(table, 1)){
            return 1;
        }
        if(checkPlayerWin(table, 2)){
            return 2;
        }
        return 0;
    }



    private ArrayList<ArrayList<Integer>> getBoardArrayList(){
        ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();
        for(Integer x = 0; x < 7; x++){
            ArrayList<Integer> col = this.board.get(x);
            table.add(col);
        }
        return table;
    }


    private boolean checkPlayerWin(ArrayList<ArrayList<Integer>> table, int player){
        // Horizontal
        for (int i = 0; i< 6 ; i++ ){ // rows
            for (int j = 0; j< 4; j++){ // columns
                if (table.get(j).get(i) == player && table.get(j+1).get(i) == player && table.get(j + 2).get(i) == player && table.get(j + 3).get(i) == player){
                    return true;
                }
            }
        }
        // Vertical
        for (int i = 0; i< 7 ; i++ ){ // columns
            for (int j = 0; j< 3; j++){ // rows
                if (table.get(i).get(j) == player && table.get(i).get(j+1) == player && table.get(i).get(j + 2) == player && table.get(i).get(j + 3) == player){
                    return true;
                }
            }
        }
        // UpDiagonalCheck
        for (int i=3; i < 6; i++){
            for (int j=0; j< 7-3; j++){
                if (table.get(j).get(i) == player && table.get(j + 1).get(i - 1) == player && table.get(j + 2).get(i - 2) == player && table.get(j + 3).get(i - 3) == player)
                    return true;
            }
        }
        // DownDiagonalCheck
        for (int i=3; i < 6; i++){
            for (int j=3; j < 7; j++){
                if (table.get(j).get(i) == player && table.get(j - 1).get(i - 1) == player && table.get(j - 2).get(i - 2) == player && table.get(j - 3).get(i - 3) == player)
                    return true;
            }
        }
        return false;
    }


    private boolean checkDraw(){
        for(Integer x = 0; x < 7; x++){
            ArrayList<Integer> col = this.board.get(x);
            for(Integer y = 0; y < col.size(); y++){
                if(col.get(y) == 0){
                    return false;
                }
            }
        }
        return true;
    }






}
