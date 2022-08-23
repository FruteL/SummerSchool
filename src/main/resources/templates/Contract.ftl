<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contracts List</title>
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
            <th> Actor </th>
            <th> Role </th>
            <th> Year Payment </th>
            <th> Bonuses </th>
            <th> Description</th>
            <th> Text </th>
            <th> Created At</th>
            <th> Updated At</th>

            </thead>
            <tbody
            <#list contracts as contract >
                <tr>
                    <td>${contract.id}</td>
                    <td>${contract.actor}</td>
                    <td>${contract.role}</td>
                    <td>${contract.YearPayment}</td>
                    <td>${contract.bonus}</td>
                    <td>${contract.description?if_exists}</td>
                    <td>${contract.createdAt}</td>
                    <td>${contract.updatedAt?if_exists}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>