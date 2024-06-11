<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" action="submit" method="post">
		제목 : <input type="text" name="title" > <br/>
		내용 : <input type="text" name="content"> <br/>
		선택1 : <select name="select1">
				<option value="select_1">1</option>
				<option value="select_2">2</option>
				<option value="select_3">3</option>
			  </select><br/>
		선택2 : 
			<input type="radio" name="radio1" value="radio1">1
			<input type="radio" name="radio1" value="radio2">2
			<input type="radio" name="radio1" value="radio3">3 <br/>
			
		선택3 : 
			<input type="checkbox" name="chk1" value="check1">1
			<input type="checkbox" name="chk1" value="check2">2
			<input type="checkbox" name="chk1" value="check3">3 <br/>
		<input type="submit" name="submit" value="submit"/>	
	</form>
</body>
</html>