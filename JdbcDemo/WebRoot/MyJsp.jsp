<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <style>
        body{
            background-color: aliceblue;
        }
        .box{
            width: 1000px;
            height: 240px;
            /*background-color: aqua;*/
            margin: 0 auto;
            margin-top: 100px;
            clear: both;
        }
        #btn{
            width: 100px;
            height: 30px;
            margin-left: 600px;
            margin-top: 10px;
        }
        .name{
            width: 100px;
            height: 30px;
            float: left;
            background-color: antiquewhite;
            margin-left: 10px;
            margin-top: 10px;
            text-align: center;
            line-height: 30px;
        }
        #span{
            float: right;
            position: relative;
            top: 55px;
            right: 185px;
        }
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>随机点名系统</h1>
    <span id="span"></span>
   
   <a href="index.jsp"><input type="button" id="btn" value="点名"/></a>
   
</body>
</html>