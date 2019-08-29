<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <%!int e=0; %>
  <%
  	int res=0;
    Object obj=session.getAttribute("guessnum");
    if(obj==null){    
	    Random rand=new Random();
	     res=rand.nextInt(100);
	    session.setAttribute("guessnum", res);
    }else{
      res=Integer.parseInt(obj+"");
     }
     String num=request.getParameter("num");
     if(num!=null && !"".equals(num)){
	     int nnum=Integer.parseInt(num);
	     if(nnum>res){
	     	e++;
	     	out.println("猜大啦");
	     }else if(nnum<res){
	     	e++;
	      	out.println("猜小啦");
	     }else{
	      	out.println("猜对啦");
	      	e=0;
	      	Random rand=new Random();
	     	res=rand.nextInt(100);
	    	session.setAttribute("guessnum", res);
	     }
	     
	   }
    %>
    <%=res %>,错误次数，<%=e %>欢迎您玩猜数游戏
<form action="index.jsp" method="post">
	<input type="text" name="num">
	<input type="submit" value="提交" >
</form>
  </body>
</html>
