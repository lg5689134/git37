/**
 * @filename Card.java
 * @author lg
 * @date 2019年3月18日 下午5:13:17
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.card;

public class Card implements Comparable<Card>{
    private String huase;
    private String point;
    public static String points[]={"2","3","4","5","6","7","8","9","10","j","Q","K","A"};
    public static String huases[]={"方片","梅花","红桃","黑桃"};
    public Card(String _huase,String _point){
        this.huase = _huase;
        this.point = _point;
    }
    public String getHuase() {
        return huase;
    }
    public void setHuase(String huase) {
        this.huase = huase;
    }
    public String getPoint() {
        return point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    @Override
    public int compareTo(Card o) {
        // TODO Auto-generated method stub
        int a=0  ,b = 0, c=0 ;
        for(int i = 0;i<points.length;i++){
            if(this.point.equals(points[i])){
                 a = i;
                break;
            }
        }
        for(int i = 0;i<points.length;i++){
            if(o.point.equals(points[i])){
                 b =i;
                break;
            }
        }
        c = a-b;
        if(c!=0){
            return c;
        }else{
            int d=0,e=0,f=0;
            for (int i =0;i<huases.length;i++){
                if (this.getHuase().equals(huases[i])){
                    d = i;
                    break;
                }
            }
            for (int i =0;i<huases.length;i++){
                if (o.getHuase().equals(huases[i])){
                    e = i;
                    break;
                }

           }
            return d-e;

        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Card))
            return false;
        Card other = (Card) obj;
        if (huase == null) {
            if (other.huase != null)
                return false;
        } else if (!huase.equals(other.huase))
            return false;
        if (point == null) {
            if (other.point != null)
                return false;
        } else if (!point.equals(other.point))
            return false;
        return true;
    }

}
