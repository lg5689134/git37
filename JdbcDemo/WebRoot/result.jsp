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
    <div>
    <%!int c=0; %>
    <%
    Object obj=session.getAttribute("guessnum");
    int  res=0;
    if(obj==null){    
	    Random rand=new Random();
	    res=rand.nextInt(100);
	    session.setAttribute("guessnum", res);
    }else{
    	res=Integer.parseInt(obj+"");
    }
    String num=request.getParameter("num");
    if(num!=null && !"".equals(num)) {
    	int nn=Integer.parseInt(num);
    	++c;
	    if(nn>res){
	    	out.println("太大啦");
	    }else if(nn<res){
	    	out.println("太小啦");
	    }else{
	    	c=0;
	    	out.println("猜对啦");	    	
	    }
    
    }
     
     
    %>
    </div>
<% out.println(res); %>
    欢迎您玩猜数游戏,错误次数<%=c %>
   
<form action="result.jsp" method="post">
	<input type="text" name="num" id="num">
	<input type="submit" value="提交" >
</form>

 <script type="text/javascript">
    document.getElementById("num").setAttribute("readonly", "readonly");
    </script>
  </body>
</html>
