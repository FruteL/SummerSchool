<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Performances List</title>
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
            <th> Name </th>
            <th> Date </th>
            <th> Roles </th>
            <th> Budget </th>
            <th> Description</th>
            <th> Created At</th>
            <th> Updated At</th>

            </thead>
            <tbody
            <#list performances as performance >
                <tr>
                    <td>${performance.id}</td>
                    <td>${performance.name}</td>
                    <td>${performance.date}</td>
                    <td>${performance.roles}</td>
                    <td>${performance.budjet}</td>
                    <td>${performance.description?if_exists}</td>
                    <td>${performance.createdAt}</td>
                    <td>${performance.updatedAt?if_exists}</td>
                </tr>
            </#list>
            </tbody>


        </table>
    </div>
</div>

</body>
</html>