<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Actors List</title>
    <style>
        .table-center {
            display: flex;
            place-content: center;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<div class="table-center">
    <div class="table-center" style="width: 100%; display: flex; align-content: center">
        <table class="table table-striped table-hover">
            <thead>
            <th> ID </th>
            <th> FirstName </th>
            <th> LastName </th>
            <th> Surname </th>
            <th> Rank </th>
            <th> Experience </th>
            <th> Description</th>
            <th> Created At</th>
            <th> Updated At</th>
            <th> DELETE</th>
            <th> EDIT</th>
            </thead>
            <tbody
            <#list actors as actor >
                <tr>
                    <td>${actor.id}</td>
                    <td>${actor.firstName}</td>
                    <td>${actor.secondName}</td>
                    <td>${actor.surname}</td>
                    <td>${actor.rank?if_exists}</td>
                    <td>${actor.expYear}</td>
                    <td>${actor.discription?if_exists}</td>
                    <td>${actor.createdAt}</td>
                    <td>${actor.updatedAt?if_exists}</td>
                    <td><a href="/ui/actors/del/${actor.id}"><button type="button" class="btn btn-danger">Del</button></a></td>
                    <td><a href="/ui/actors/edit/${actor.id}"><button type="button" class="btn btn-info">Edit</button></a></td>
                </tr>
            </#list>
            </tbody>


        </table>
    </div>
</div>
</body>
</html>