<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>�̵� ������</h1>
<!-- 
tr �±״� ǥ�� ���� ��Ÿ����.
td �±״� ǥ�� ���� ��Ÿ����, tr �±� ������ ��ġ�Ѵ�. 

-->
<table border="1">
  <tr>
    <th>����1</th>
    <th>����2</th>
    <th>����3</th>
  </tr>
  <tr>
    <td>����4</td>
    <td>����5</td>
    <td>����6</td> 
  </tr>
</table><br/>

<table border="1">
  <tr>
    <td colspan="2">colspan���� 2ĭ��ħ</td><td>qwrew</td>
  </tr>
  <tr>
    <td colspan="3">colspan���� 3ĭ��ħ</td>
  </tr>
</table><br/>

<table border="1">
  <tr>
    <th rowspan="2">rowspan���� 2ĭ ��ħ</th><th>bbb</th><th>ccc</th>
  </tr>
  <tr>
    <td>eeee</td><td>fff</td>
  </tr>
</table><br/>

<table border="1">
  <tr>
    <th>a.jpg</th><th>f1.png</th>
  </tr>
  <tr>
    <td><img src="img/a.jpg" style="width:200px;height:200px"></td>
    <td><img src="img/b.jpg" style="width:200px;height:200px"></td>
  </tr>
</table><br/>
</body>
</html>