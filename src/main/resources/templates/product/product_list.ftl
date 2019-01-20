<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>List of products</title>
<body>


<#list products as item>
    <div>
        <span>Product: #${item_index}</span>
        <p>Name: ${item.name}</p>
        <p>Price: ${item.price}</p>
    </div>
</#list>


<a href="/product">Back</a>
</body>
</html>