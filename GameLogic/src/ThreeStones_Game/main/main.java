/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeStones_Game.main;

import ThreeStones_Game.views.Board;
import java.util.List;

/**
 *
 * @author 1331680
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createBoard();
    }
    
    private static void createBoard(){
        Board board = new Board();
        int[] position = {4,2};
        List<int[]> availables = board.getAvailable(position);
        for(int[] available: availables){
            System.out.println(available[0]+" "+available[1]);
        }
    }
    
}
