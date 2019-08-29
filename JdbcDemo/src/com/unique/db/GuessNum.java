/**
 * @filename GuessNum.java
 * @author lg
 * @date 2019年3月18日 上午11:37:11
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.db;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		int res=ran.nextInt(10);
		System.out.println(res);
		//int rand=(int)(Math.random()*10);
		System.out.println("请输入你要猜的数字：");
		int input=scan.nextInt();
		int c=0;
		while(res!=input){
			if(input==-1){
				System.out.println("我要走啦！");
				break;
			}
			 if(input>res){
				System.out.println("数字猜大啦");
			}else{
				System.out.println("数字猜小啦");
			}
			 c++;
			 System.out.println("错误次数："+c);
			 System.out.println("请输入你要猜的数字：");
			input=scan.nextInt();
			
		}
		if(input==res){
			System.out.println("恭喜你猜对啦");
		}*/
		
		
		
		Random rand=new Random();
		int guessnum=rand.nextInt(10);
		System.out.println(guessnum+"请输入（1-10）之间你要猜的数字：");
		Scanner scan=new Scanner(System.in);
		int inputnum=scan.nextInt();
		int c=0;
		
		while(inputnum!=guessnum){
			if(inputnum>guessnum){
				c++;
				System.out.println("输入的数字太大啦");
			}else if(inputnum<guessnum){
				c++;
				System.out.println("输入的数字太小啦");
			}else if(inputnum==-1){
				System.out.println("再见");
				break;
			}
			
			if(c>3){
				System.out.println("最多只能猜3次");
				break;
			}
			
			System.out.println("请输入（1-10）之间你要猜的数字：");
			 scan=new Scanner(System.in);
			 inputnum=scan.nextInt();
		}
		
		if(inputnum==guessnum){
			System.out.println("恭喜你第"+c+"次猜对啦");
		}
			
	
	}

}
