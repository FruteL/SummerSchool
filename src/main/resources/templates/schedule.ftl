<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Schedule List</title>
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
                <th> Performance </th>
                <th> Actors </th>
                <th> Date </th>
                <th> Price </th>
                <th> Sold places </th>
                <th> Description </th>
                <th> Created At</th>
                <th> Updated At</th>
            </thead>

            <tbody
            <#list schedules as schedule >
                <tr>
                    <td>${schedule.id}</td>
                    <td>${schedule.performance.name}</td>
                    <td><a href="/ui/actors/"><button type="button" class="btn btn-light">Actors</button></a></td>
                    <td>${schedule.date}</td>
                    <td>${schedule.price}</td>
                    <td>${schedule.holdPlaces}</td>
                    <td>${schedule.description?if_exists}</td>
                    <td>${schedule.createdAt}</td>
                    <td>${schedule.updatedAt?if_exists}</td>
                </tr>
            </#list>
            </tbody>

        </table>
    </div>
</div>
</body>
</html>