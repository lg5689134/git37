/**
 * @filename GuessNum.java
 * @author lg
 * @date 2019��3��18�� ����11:37:11
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
		System.out.println("��������Ҫ�µ����֣�");
		int input=scan.nextInt();
		int c=0;
		while(res!=input){
			if(input==-1){
				System.out.println("��Ҫ������");
				break;
			}
			 if(input>res){
				System.out.println("���ֲ´���");
			}else{
				System.out.println("���ֲ�С��");
			}
			 c++;
			 System.out.println("���������"+c);
			 System.out.println("��������Ҫ�µ����֣�");
			input=scan.nextInt();
			
		}
		if(input==res){
			System.out.println("��ϲ��¶���");
		}*/
		
		
		
		Random rand=new Random();
		int guessnum=rand.nextInt(10);
		System.out.println(guessnum+"�����루1-10��֮����Ҫ�µ����֣�");
		Scanner scan=new Scanner(System.in);
		int inputnum=scan.nextInt();
		int c=0;
		
		while(inputnum!=guessnum){
			if(inputnum>guessnum){
				c++;
				System.out.println("���������̫����");
			}else if(inputnum<guessnum){
				c++;
				System.out.println("���������̫С��");
			}else if(inputnum==-1){
				System.out.println("�ټ�");
				break;
			}
			
			if(c>3){
				System.out.println("���ֻ�ܲ�3��");
				break;
			}
			
			System.out.println("�����루1-10��֮����Ҫ�µ����֣�");
			 scan=new Scanner(System.in);
			 inputnum=scan.nextInt();
		}
		
		if(inputnum==guessnum){
			System.out.println("��ϲ���"+c+"�β¶���");
		}
			
	
	}

}
