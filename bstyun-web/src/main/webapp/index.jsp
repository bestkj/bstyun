<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
var json = "{'treeNodes':[{'childrenMenuTreeNodeList':[	{'childrenMenuTreeNodeList':null,'displayOrder':1,'expandPath':null,'functionCode':'access_rule','imagePath':null,'level':2,'linkAction':'\/policy\/access_rules_list.jsp','linkResId':'access_rule','linkType':'function','menuCode':'menu_access_rule','menuId':0,'menuName':'设置安全策略','menuPrimeKey':'50','menuSeq':'.1.50.','openMode':null,'parentMenuTreeNode':null},{'childrenMenuTreeNodeList':null,'displayOrder':1,'expandPath':null,'functionCode':'dict_manager','imagePath':null,'level':2,'linkAction':'\/coframe\/dict\/dict_manager.jsp','linkResId':'dict_manager','linkType':'function','menuCode':'menu_dict_manager','menuId':0,'menuName':'配置业务字典','menuPrimeKey':'51','menuSeq':'.1.51.','openMode':null,'parentMenuTreeNode':null},{'childrenMenuTreeNodeList':null,'displayOrder':6,'expandPath':null,'functionCode':'role_auth','imagePath':null,'level':2,'linkAction':'\/coframe\/auth\/role_auth.jsp','linkResId':'role_auth','linkType':'function','menuCode':'menu_auth','menuId':0,'menuName':'授权管理','menuPrimeKey':'5','menuSeq':'.1.5.','openMode':null,'parentMenuTreeNode':null}],'displayOrder':1,'expandPath':null,'functionCode':null,'imagePath':null,'level':1,'linkAction':null,'linkResId':null,'linkType':'function','menuCode':'menu_auth','menuId':0,'menuName':'权限管理','menuPrimeKey':'1','menuSeq':'.1.','openMode':null,'parentMenuTreeNode':null}]}";
jsonStr = eval('(' + json + ')'); 
console.log(jsonStr.treeNodes);
// $(jsonStr).treeNodes.each(function(index,element){
// 	alert(element);
// });

</script>
</head>
<body>
hello world
</body>
</html>