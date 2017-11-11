<html  xmlns:th="http://www.thymeleaf.org">
    <meta charset="UTF-8"/>
    <head>
       <body>
        登陆成功
     <br/>

    欢迎您：<span th:text="${session.user.getUsername()}"></span>
    <br/>
        <a th:href="@{/loginOut}" th:unless="${session.user==null}">退出登陆</a>
    </body>
    </head>
</html>