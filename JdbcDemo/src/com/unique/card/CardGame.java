/**
 * @filename CardGame.java
 * @author lg
 * @date 2019年3月18日 下午5:16:04
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardGame {

    Scanner scan = new Scanner(System.in);
    public People creatPlayer() throws WrongCommand{
        try{
            System.out.println("请输入玩家姓名");
             String name = scan.next();
            System.out.println("请输入玩家ID");
             int ID = scan.nextInt();
             People player= new People(ID,name);
             return player;
        }catch(Exception e){
            throw new WrongCommand("请输入正确的ID类型");
        }

    }
    public void Game(SetCard e,People p1,People p2 ){
//游戏内容主体
        e.buildCard();
        System.out.println("扑克牌已生成");
        for(Card card:e.CardList){
            System.out.println(card.getHuase()+card.getPoint());
        }
        e.randomCard();
        System.out.println("扑克牌已洗牌");
        for(Card card:e.CardList){
            System.out.println(card.getHuase()+card.getPoint());
        }
        for(int i=0;i<e.CardList.size();i=i+4){
            for (int j = 0;j<2;j++){
                Card card = new Card(e.CardList.get(i+j).getHuase(),e.CardList.get(i+j).getPoint());
                p1.getHandCard().add(card);
            }
            for (int j = 2;j<4;j++){
                Card card = new Card(e.CardList.get(i+j).getHuase(),e.CardList.get(i+j).getPoint());
                p2.getHandCard().add(card);
            }
            Collections.sort(p1.getHandCard());
            Collections.sort(p2.getHandCard());
            Card card1 = new Card(p1.getHandCard().get(p1.getHandCard().size()-1).getHuase(),p1.getHandCard().get(p1.getHandCard().size()-1).getPoint());
            Card card2 = new Card(p2.getHandCard().get(p2.getHandCard().size()-1).getHuase(),p2.getHandCard().get(p2.getHandCard().size()-1).getPoint());
            List<Card> GameList  = new ArrayList<Card>();
            GameList.add(card1);
            GameList.add(card2);
            Collections.sort(GameList);
            if (p1.getHandCard().contains(GameList.get(1))){
                System.out.println("本轮"+p1.getName()+"获胜");
            }else if(p2.getHandCard().contains(GameList.get(1))){
                System.out.println("本轮"+p2.getName()+"获胜");
            }
            System.out.println(p1.getName()+"手牌:");
            for(Card card:p1.getHandCard()){
                System.out.println(card.getHuase()+card.getPoint());
            }
            System.out.println(p2.getName()+"手牌");
            for(Card card:p2.getHandCard()){
                System.out.println(card.getHuase()+card.getPoint());
            }
            p1.getHandCard().clear();
            p2.getHandCard().clear();
            System.out.println("请输入是否进继续进行游戏，请输入yes或者no");
            String choose = scan.next();
            if(scan.equals("no")){break;}
        }
        System.out.println("游戏结束");
    }

    public static void main(String[] args) {
        CardGame CG = new CardGame();
        People[] player=new People[2];
        for (int i =0;i<2;i++){
            boolean flag = true;
            while(flag){
                try{
                player[i] = CG.creatPlayer();

                }catch(WrongCommand e){
                    System.out.println(e.getMessage());
                    continue;
                }
                if (player[i].getName()!=null){
                    flag = false;
                }

            }
        }
        SetCard SC = new SetCard();
        CG.Game(SC, player[0], player[1]);
    }

}
