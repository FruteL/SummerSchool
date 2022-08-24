<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Actor update</title>
</head>
<body>
<div>

    <fieldset>
        <form name="actor" action="" method="POST">
            id:<@spring.formInput "form.id" "" "text" />
            <br>
            First Name: <@spring.formInput "form.firstName" "" "text" />
            <br>
            Last Name: <@spring.formInput "form.secondName" "" "text" />
            <br>
            Surname: <@spring.formInput "form.surname" "" "text" />
            <br>
            Rank: <@spring.formInput "form.rank" "" "text" />
            <br>
            expYear: <@spring.formInput "form.expYear" "" "text" />
            <br>
            created :<@spring.formInput "form.createdAt" "" "date" />
            <br>
            updated :<@spring.formInput "form.updatedAt" "" "date" />
            <br>

            <input type="submit" value="Save">

        </form>

    </fieldset>



</div>
</body>
</html>