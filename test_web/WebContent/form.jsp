<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function a(){
	alert("�Ϲݹ�ư Ŭ����");
}
</script>
</head>
<body>
<h3>ȸ������</h3>
<!-- �����: ����� �Է� �������̽�. ���� ���� -->
<!-- <form action="����������" method=get/post> -->
<!-- get: url? �ڿ� ���� �Ķ���͸� �ٿ��� ����. ���ȿ� ���. ���̿� ����. -->
<!-- post: ���� ��Ŷ ����� ��� ����. �����Ͱ� url�� ���� �ȵ�. ���̿� ���� ���� -->
<form action="a.jsp" method="post">
id:<input type="text" name="id"><br>
pwd:<input type="password" name="pwd"><br>
name:<input type="text" name="name"><br>
����: <input type="radio" name="gen" value="f">����
<input type="radio" name="gen" value="m">����<br>
���: <input type="checkbox" name="hobby" value="1">����
<input type="checkbox" name="hobby" value="2">����
<input type="checkbox" name="hobby" value="3">����
<input type="checkbox" name="hobby" value="4">�౸<br>
<select name="grade">
<option value="g1">1�г�</option>
<option value="g2">2�г�</option>
<option value="g3">3�г�</option>
<option value="g4">4�г�</option>
</select><br>
<textarea name="info" cols=45 rows="10">�����λ� �Է�</textarea><br>
<input type="submit" value="����">
<input type="reset" value="���">
<input type="button" value="�Ϲݹ�ư" onclick="a()">
</form>
</body>
</html>