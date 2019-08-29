<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>猜数字小游戏</title>
<style type="text/css">
#my_guess_num {
	height: 18px;
	vertical-align: middle;
	text-align: center;
	line-height: 18px; /*line-height must be equal to height*/
}
</style>
</head>
<script>
	var count = 1;
	var num = null;
	//获取随机数
	function GetRandomNum(Min, Max) {
		count = 1;
		var Range = Max - Min;
		var Rand = Math.random();
		num = Min + Math.round(Rand * Range);
		alert("随机数已生成，请开始猜吧！" + num)
	}
	//获取文本框内容
	function checknum() {
		if (num == null) {
			alert("请先生成一个随机数再开始猜哦！");
			return;
		}
		var nums = document.getElementById("my_guess_num").value;
		if ("" == nums) {
			alert("请输入您要猜的数！");
			return;
		}
		if (nums == num) {
			alert("恭喜您尝试" + count + "次猜对了！");
			return;
		} else {
			alert("已猜次数" + count)
			if (count == 10) {
				if (nums != num) {
					alert("猜错了，您已经没机会了，真遗憾！重新生成随机数再来一次吧！")
					return;
				}
			}
			if (nums < num) {
				alert("数字有些小了,您还有" + (10 - count) + "次机会");
			} else {
				alert("数字有些大了,您还有" + (10 - count) + "次机会");
			}
 
			count++;
		}
 
	}
</script>
<body>
	<h1>猜数字小游戏</h1>
	说明：点击【生成随机数】产生一个1-99的随机数，然后输入您要猜的数字，点击【猜】即可；共有10次机会；
	<br />
	<br />
	<input type="button" id="result" name="result"
		onclick="GetRandomNum(1,100)" value="生成随机数" />
	<br />
	<br />
	<input type="text" id="my_guess_num" name="my_guess_num" />
	<input type="button" id="guess" name="guess" onclick="checknum()"
		value="猜" />
 
</body>
</html>