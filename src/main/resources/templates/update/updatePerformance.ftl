<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Performance update</title>
</head>
<body>
<div>

    <fieldset>
        <form name="form" action="" method="POST">
            id:<@spring.formInput "form.id" "" "text" />
            <br>
            Name: <@spring.formInput "form.name" "" "text" />
            <br>
            Date of created: <@spring.formInput "form.date" "" "text" />
            <br>
            Budjet: <@spring.formInput "form.budget" "" "text" />
            <br>
            Description: <@spring.formInput "form.description" "" "text" />
            <br>
            created :<@spring.formInput "form.createdAt" "" "text" />
            <br>
            updated :<@spring.formInput "form.updatedAt" "" "text" />
            <br>

            <input type="submit" value="Save">

        </form>

    </fieldset>



</div>
</body>
</html>