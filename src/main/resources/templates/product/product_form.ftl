<#import "/spring.ftl" as spring />
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Product form</title>
</head>
<body>

<@spring.bind "product"/>
<form action="/product/new" method="post">

    <span>Name</span>
    <@spring.formInput "product.name"/>
    <br>
    <br>
    <span>Price</span>
    <@spring.formInput "product.price", "", "number"/>
    <br>
    <br>
    <input type="submit">
</form>

</body>
</html>