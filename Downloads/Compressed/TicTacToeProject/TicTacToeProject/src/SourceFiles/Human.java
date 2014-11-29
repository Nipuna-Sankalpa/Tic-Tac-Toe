/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Human extends Player implements Serializable {

    private int winCount = 0;
    private int lossCount = 0;
    private int drawCount = 0;
    private String name;

    public int getWinCount() {
        return winCount;
    }

    public int getLossCount() {
        return lossCount;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    void playTurn(int pl, int turn) {
        while (TicTacToe.butClicked == 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Human.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        switch (TicTacToe.butClicked) {
            case 1:
                TicTacToe.state[0][0] = pl;
                break;
            case 2:
                TicTacToe.state[0][1] = pl;
                break;
            case 3:
                TicTacToe.state[0][2] = pl;
                break;
            case 4:
                TicTacToe.state[1][0] = pl;
                break;
            case 5:
                TicTacToe.state[1][1] = pl;
                break;
            case 6:
                TicTacToe.state[1][2] = pl;
                break;
            case 7:
                TicTacToe.state[2][0] = pl;
                break;
            case 8:
                TicTacToe.state[2][1] = pl;
                break;
            case 9:
                TicTacToe.state[2][2] = pl;
                break;
        }
        TicTacToe.butClicked = 0;
    }

    public void notifyWin(int pl) {
        winCount++;
    }

    public void notifyLose(int pl) {
        lossCount++;
    }

    public void notifyDraw() {
        drawCount++;
    }

}
