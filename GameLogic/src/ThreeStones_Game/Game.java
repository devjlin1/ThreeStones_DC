/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeStones_Game;

/**
 *
 * @author 1434032
 */
public class Game implements IGame{
    private int[] lastPlayed = new int [2];
    private int stoneCount = 30;
    private int[][] gameBoard;

    public Game() {
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
        int[] lastplayed = {-1,-1};
        this.lastPlayed = lastplayed;
    }

    public int[] getLastPlayed() {
        return lastPlayed;
    }

    public int getStoneCount() {
        return stoneCount;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }
    
    @Override
    public boolean updateBoard(int y, int x, int player) {
        //server always player 2
        if (gameBoard[y][x] == 0 && checkAxis(y,x) && stoneCount != 0) {
            //update board
            gameBoard[y][x] = player;
            
            //update last played
            lastPlayed[0] = y;
            lastPlayed[1] = x;
            
            //stonecount update
            stoneCount--;
        } else {
            System.out.println("Invalid coordinates!");
            return false;
        }
        
        return true;
    }
    
    private boolean checkAxis(int y, int x) {
        //check lastPlayed horizontal or vertical
        //check if horizontal and vertical full: place anywhere
        
        return true;
    }
    
}
