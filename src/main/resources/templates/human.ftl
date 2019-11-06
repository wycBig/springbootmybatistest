<html>
<head>
    <title>Mybatis整合springboot</title>
</head>
<body>
    <table>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        <#list personList as Person >
        <tr>
            <td>${Person.pid}</td>
            <td>${Person.pname}</td>
            <td>${Person.page}</td>
        </tr>
        </#list>
    </table>

</body>