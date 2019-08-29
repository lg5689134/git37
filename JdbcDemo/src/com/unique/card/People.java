/**
 * @filename People.java
 * @author lg
 * @date 2019年3月18日 下午5:14:08
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.card;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class People {
    private int ID;
    private String name;
    private List<Card> HandCard;
    public People(int _ID , String _name){
        this.ID = _ID;
        this.name = _name;
        HandCard = new ArrayList<Card>();
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Card> getHandCard() {
        return HandCard;
    }
    public void setHandCard(List<Card> handCard) {
        HandCard = handCard;
    }

}
