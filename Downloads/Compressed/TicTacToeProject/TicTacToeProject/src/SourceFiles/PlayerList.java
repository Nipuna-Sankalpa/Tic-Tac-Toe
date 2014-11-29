/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dilip
 */
public class PlayerList implements Serializable {

    private static ArrayList<Human> players = new ArrayList<Human>();

    void addPlayers(Human player) {
        players.add(player);
    }

    public ArrayList getList() {
        return players;
    }

    public Human getPlayers(String name) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName() == name) {
                return players.get(i);
            }

        }
        return null;
    }
    public boolean contain(String name)
    {
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getName() == name)
                return true ;
        }
        return false ;
    }
    public String getPlayerName(int index) {
        return players.get(index).getName();
    }

    public int getSize() {
        return players.size();
    }

}
