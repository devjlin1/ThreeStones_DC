
package ThreeStones_Game.views;

import ThreeStones_Game.enums.Turn;
import java.util.ArrayList;
import java.util.List;

public class Board{
    private Turn turn;
    private int[] lastPlayed;
    private final int stoneCount;
    private int[][] gameBoard;

    public Board() {
        int[][] gameboard = {
        {9,9,9,9,9,9,9,9,9,9,9},
        {9,9,9,9,9,9,9,9,9,9,9},
        {9,9,9,9,0,0,0,9,9,9,9},
        {9,9,9,0,0,0,0,0,9,9,9},
        {9,9,0,0,0,0,0,0,0,9,9},
        {9,9,0,0,0,9,0,0,0,9,9},
        {9,9,0,0,0,0,0,0,0,9,9},
        {9,9,9,0,0,0,0,0,9,9,9},
        {9,9,9,9,0,0,0,9,9,9,9},
        {9,9,9,9,9,9,9,9,9,9,9},
        {9,9,9,9,9,9,9,9,9,9,9}
        };
        this.gameBoard = gameboard;
        this.stoneCount = 30;
        this.lastPlayed = new int[2];
    }
    public List<int[]> getAvailable(int[] lastPlayed){
        System.out.println("Last Played: "+lastPlayed[0]+" "+lastPlayed[1]);
        int x = lastPlayed[0];
        int y = lastPlayed[1];
        List<int[]> available = new ArrayList<>();
        for(int i=0;i<11;i++){
            if (this.gameBoard[i][y]==0){
                int[] slot = {i,y};
                System.out.println("Row values: "+slot[0]+" "+slot[1]);
                if(slot[0]!=lastPlayed[0]){
                    available.add(slot);
                }
            }
        }
        for(int j=0;j<11;j++){
            if (this.gameBoard[x][j]==0){
                int[] slot = {x,j};
                System.out.println("Column values: "+slot[0]+" "+slot[1]);
                if(slot[1]!=lastPlayed[1]){
                    available.add(slot);
                }
            }
        }
        return available;
    }
}