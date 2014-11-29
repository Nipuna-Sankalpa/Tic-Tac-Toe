/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles;

import java.io.Serializable;

public abstract class Player implements Serializable {

    void playTurn(int pl, int turn) {
    }

    void playerInit() {
    }

    void notifyWin(int pl) {
    }

    void notifyLose(int pl) {
    }

    void notifyDraw() {
    }

    String getName() {
        return null;
    }

    int getWinCount() {
        return 0;
    }

    int getLossCount() {
        return 0;
    }

    int getDrawCount() {
        return 0;
    }

}
