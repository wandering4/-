
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="static/js/jquery.min.js"></script>
    <script>
      var xhr ;
      function checkUname(){
        // 获取输入框中的内容

        if(null == $("#unameI").val() || $("#unameI").val() == ''){
          $("#unameInfo").text("用户名不能为空");
          return;
        }
        $("#unameInfo").text("");

        // 发送异步请求
        // 获取一个 XMLHttpRequest对象 ,对象可以帮助我们发送异步请求
        //xhr =new XMLHttpRequest();
        // 通过JQuery来做
        // 使用xhr对象设置打开链接,设置请求方式和参数xhr.open("请求方式","请求的URL",是否使用异步方式);
        // xhr.open("GET","unameCheckServlet.do?uname="+unameText,true);
        $.ajax(
                {
                  type: "GET",
                  url: "unameCheckServlet.do?",
                  data: "uname=" + $("#unameI").val(),
                  success: function (info) {
                    $("#unameInfo").text(info);
                  }
                }
        )
/*        $.get("servlet1.do",
                {"username": $("#unameI").val()},
                function (list) {
                  $.each(list, function (i, e) {
                    console.log(e);
                  }, "json")*/

      }

    </script>
  </head>
  <body>
  <form action="servlet1.do" >
    用户名:<input id="unameI" type="text" name="uname" onblur="checkUname()">
    <span id="unameInfo" style="color: red"></span><br/>
    密码:<input type="password" name="pwd"><br/>
    <input type="submit">
  </form>
  </body>
</html>
