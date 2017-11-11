<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form action="add" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" name="gender" value="男"/>男</td>
                <td><input type="radio" name="gender" value="女"/>女</td>

            </tr>
            <tr>
                <td>生日</td>
                <td><input type="text" name="birthday"/></td>
            </tr>
            <tr>
                <td>手机</td>
                <td><input type="text" name="mobile"/></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="注册"/></td>
                <td><input type="reset" value="取消"/></td>
            </tr>
        </table>
    </form>

</body>
</html>