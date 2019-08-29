/**
 * @filename SetCard.java
 * @author lg
 * @date 2019年3月18日 下午5:15:04
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SetCard {
    public static String huase[]={"方片","梅花","红桃","黑桃"};
    public static String point[]={"2","3","4","5","6","7","8","9","10","j","Q","K","A"};
    List<Card> CardList = new ArrayList();
    public  void buildCard(){
        for(int i=0;i<huase.length;i++){
            for(int j = 0;j<point.length;j++){
                Card card = new Card(huase[i],point[j]);
                CardList.add(card);
            }
        }

    }
    public void randomCard(){
        for (int i=0;i<1000;i++){
            Random random = new Random();
            int a = random.nextInt(CardList.size());
            int b = random.nextInt(CardList.size());
            CardList.get(a);
            Card temp = new Card(CardList.get(a).getHuase(),CardList.get(a).getPoint());
            CardList.get(a).setHuase(CardList.get(b).getHuase());
            CardList.get(a).setPoint(CardList.get(b).getPoint());
            CardList.get(b).setHuase(temp.getHuase());
            CardList.get(b).setPoint(temp.getPoint());
        }
    }

}
