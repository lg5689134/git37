/**
 * @filename RandomName.java
 * @author lg
 * @date 2019年3月18日 下午5:38:21
 * @version 1.0
 * Copyright (C) 2019 
 */

package com.unique.db;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
 
 
public class RandomName {
  //主面板
  JFrame rFrame=new JFrame("随机点名器");
  //名字
  String[] stuName={"杨诒","卢辉","荣鹏","刘健鹏","赵琨","鲁仕荣","许竞前","李攀","廖若辉","马鹏","曹天宇","李永成","童旭明","郭政誉","冯晓乐","王璐璐","王丹","刘慧兰","何发海","刘柏瑜"};
  //用于存储名字的标签
  JLabel name = new JLabel();
  //按钮
  JButton btn = new JButton("开始点名");
  //采用的是伪随机数，大家也可以不用这个，这个在网上可以找到java随机数的设置
  Random rd = new Random();
  public void init()
  {
      //提示标签页面
      JLabel jt= new JLabel("随机点名器");
      //设置标签居中
      jt.setHorizontalAlignment(SwingConstants.CENTER);
      //设置字体大小
      jt.setFont(new java.awt.Font("随机点名器",1,35));
      //设置名字显示的标签居中
      name.setHorizontalAlignment(SwingConstants.CENTER);
      //通过匿名类实现Action按钮的监听事件
      btn.addActionListener(new ActionListener(){
 
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            //获取随机的姓名
            String n=getRandomName();
            //设置name标签的文字
            name.setText(n);
            //设置字体
            name.setFont(new java.awt.Font(n,1,35));
            //设置字体颜色
            name.setForeground(Color.red);
        }
           
      });
      //获取JFrame的面板
      Container p = this.rFrame.getContentPane();
      //设置布局方式，我采用的BorderLayout布局
      p.setLayout(new BorderLayout(3,1));
      //添加提示标签在北方
      p.add(jt,BorderLayout.NORTH);
      //添加姓名标签在中央
      p.add(name,BorderLayout.CENTER);
      //添加按钮控件在南方
      p.add(btn,BorderLayout.SOUTH);
      //调整大小，这个是java中无法设置标签的大小
      rFrame.pack();
      //设置窗体大小
      rFrame.setSize(300, 300);
      //设置可以显示
      rFrame.setVisible(true);
       
       
  }
  //获取随机的姓名
  public String getRandomName()
  {
      int a = 0;
      //random类去实现随机数时，只能设置上限，也就是说随机数产生的都是0-stuName.length之间的数字
      a = rd.nextInt(stuName.length);
      //rd.setSeed();
      //a = (int)Math.random()*stuName.length;
       
      return stuName[a];
  }
 
  public static void main(String[] args)
  {
      RandomName rn=new RandomName();
      rn.init();
  }
}