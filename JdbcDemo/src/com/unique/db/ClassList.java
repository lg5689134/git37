/**
 * @filename ClassList.java
 * @author lg
 * @date 2019年3月18日 下午5:25:07
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ClassList {

	
	public static void main(String[] args) throws IOException {
		/*File f=new File("d:/class.txt");
		if(!f.exists()){
			f.createNewFile();
		}
		FileWriter writer=new FileWriter(f)
		writer.write("张三,李四,王五");
		writer.close();
		
		FileReader read=new FileReader(f);
		BufferedReader br=new BufferedReader(read);
		String str=null;
		StringBuilder sb=new StringBuilder();
		while((str=br.readLine())!=null){
			sb.append(str);
		}
		br.close();
		String names[]=sb.toString().split(",");
		Random ran=new Random();
		int rr=ran.nextInt(names.length);
		System.out.println(rr+":"+names.length);
		System.out.println(names[rr]);*/
		
		String arr[]={"a","b","c","d"};
		String a=arr[new Random().nextInt(arr.length)];
		System.out.println(a);
		
		
	}
}
