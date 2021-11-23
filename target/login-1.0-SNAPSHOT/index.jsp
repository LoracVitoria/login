<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - LOGIN E LOGOUT</title>

</head>

<script type='text/javascript'>
    function validarCampos()
    {
        if (document.loginservlet.campo_user.value=="")
        {
            alert("O usuário está vazio!");
            return;
        }
        if (document.loginservlet.campo_password.value=="")
        {
            alert("A senha está vazia!");
            return;
        }
        document.loginservlet.submit();
    }
</script>

<body>
<h1><%= "Login e Logout!" %></h1>
<br/>


<%--<p>	 ${param.msg}</p>--%>

<form method="get" action="login" enctype="multipart/form-data" name="loginservlet">

    <label for="user-id">User: </label>
    <input id="user-id" type="text" name="campo_login" value="name" />

    <br/>
    <br/>
    <label for="password-id">Password: </label>
    <input id="password-id" type="password" name="campo_password" value="name" />

    <br/>
    <br/>
    <input type="submit" value="Entrar" onclick="validarCampos()"/>
    <br/>

</form>

<br/>
</body>
</html>