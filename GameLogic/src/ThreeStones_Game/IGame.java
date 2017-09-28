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
public interface IGame {
    //public  validateMove(int y, int x);
    public boolean updateBoard(int y, int x, int player);
    
}
