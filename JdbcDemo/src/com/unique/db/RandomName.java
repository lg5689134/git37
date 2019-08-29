/**
 * @filename RandomName.java
 * @author lg
 * @date 2019��3��18�� ����5:38:21
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
  //�����
  JFrame rFrame=new JFrame("���������");
  //����
  String[] stuName={"��ڱ","¬��","����","������","����","³����","��ǰ","����","������","����","������","������","ͯ����","������","������","����","����","������","�η���","�����"};
  //���ڴ洢���ֵı�ǩ
  JLabel name = new JLabel();
  //��ť
  JButton btn = new JButton("��ʼ����");
  //���õ���α����������Ҳ���Բ����������������Ͽ����ҵ�java�����������
  Random rd = new Random();
  public void init()
  {
      //��ʾ��ǩҳ��
      JLabel jt= new JLabel("���������");
      //���ñ�ǩ����
      jt.setHorizontalAlignment(SwingConstants.CENTER);
      //���������С
      jt.setFont(new java.awt.Font("���������",1,35));
      //����������ʾ�ı�ǩ����
      name.setHorizontalAlignment(SwingConstants.CENTER);
      //ͨ��������ʵ��Action��ť�ļ����¼�
      btn.addActionListener(new ActionListener(){
 
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            //��ȡ���������
            String n=getRandomName();
            //����name��ǩ������
            name.setText(n);
            //��������
            name.setFont(new java.awt.Font(n,1,35));
            //����������ɫ
            name.setForeground(Color.red);
        }
           
      });
      //��ȡJFrame�����
      Container p = this.rFrame.getContentPane();
      //���ò��ַ�ʽ���Ҳ��õ�BorderLayout����
      p.setLayout(new BorderLayout(3,1));
      //�����ʾ��ǩ�ڱ���
      p.add(jt,BorderLayout.NORTH);
      //���������ǩ������
      p.add(name,BorderLayout.CENTER);
      //��Ӱ�ť�ؼ����Ϸ�
      p.add(btn,BorderLayout.SOUTH);
      //������С�������java���޷����ñ�ǩ�Ĵ�С
      rFrame.pack();
      //���ô����С
      rFrame.setSize(300, 300);
      //���ÿ�����ʾ
      rFrame.setVisible(true);
       
       
  }
  //��ȡ���������
  public String getRandomName()
  {
      int a = 0;
      //random��ȥʵ�������ʱ��ֻ���������ޣ�Ҳ����˵����������Ķ���0-stuName.length֮�������
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