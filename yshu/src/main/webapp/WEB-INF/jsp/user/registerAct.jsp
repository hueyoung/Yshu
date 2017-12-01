<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
	  <meta charset="utf-8">
	  <title>遗书/注册</title>
	  <link rel="stylesheet" href="/layui/css/layui.css" media="all">
	  <script>
		//Demo
		layui.use('form', function(){
		  var form = layui.form;
		  
		  //监听提交
		  form.on('submit(formDemo)', function(data){
		    layer.msg(JSON.stringify(data.field));
		    alert("点击按钮了！")
		    return true;
		  });
		});
	</script>
	</head>
	
	<body>
		<ul class="layui-nav" style="text-align: center;" lay-filter="">
		  <li class="layui-nav-item"><a href="">首页</a></li>
		  <li class="layui-nav-item"><a href="">我的</a></li>
		  <li class="layui-nav-item"><a href="">关于</a></li>
		</ul>
		 
		<script>
			//注意：导航 依赖 element 模块，否则无法进行功能性操作
			layui.use('element', function(){
			  var element = layui.element;
			  alert(Element);
			  
			});
		</script>
		
		<div style="background-color: white; margin:0 auto; margin-top: 10%; width:400px; height:100px; border:1px;">
		
			<form class="layui-form" action="">
			  <div class="layui-form-item">
			    <label class="layui-form-label">账号</label>
			    <div class="layui-input-inline">
			      <input type="text" name="phone" required  lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">
			    </div>
			    <div class="layui-form-mid layui-word-aux">有效手机号</div>
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">密码</label>
			    <div class="layui-input-inline">
			      <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
			    </div>
			    <div class="layui-form-mid layui-word-aux">3位以上字符</div>
			  </div>
			  
			  <div class="layui-form-item">
			    <div class="layui-input-block">
			      <button class="layui-btn" lay-submit lay-filter="formDemo">登录</button>
			      <button class="layui-btn">注册</button>
			    </div>
			  </div>
			</form>
		</div>
	</body>
</html>