<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Hello, items! </h1>

<table border="3">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Discription</th>
        <th>created at</th>
        <th>updated at at</th>
    </tr>
    <#list items as item>
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.description}</td>
            <td>${item.createdAt}</td>
            <td>${item.updateAt}</td>
        </tr>
    </#list>
</table>

</body>
</html>