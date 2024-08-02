<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" />
    <style>
        body {
            color: black;
            margin-top: 150px;
        }
        .container {
            width: 50%;
            text-align: center;
            justify-content: center;
            align-items: center;
            border: 2px solid rgb(233, 163, 192);
            border-radius: 10px;
            box-shadow: 10px 10px 10px rgb(233, 163, 192);
        }
        input[type="submit"],
        input[type="reset"] {
            margin: 20px;
            border: 2px solid black;
        }
    </style>
</head>
<body>

<div class="container">
    <form action="/Skilll/cmd" method="POST" class="needs-validation" novalidate><br>
      
        <input type="submit" value="Login" class="btn btn-success"> <input type="reset" value="Reset" class="btn btn-danger"><br><br>
    </form>
    New User Register Here<a href="register.jsp"><button class="btn btn-primary" style="border: 2px solid black;">Register</button></a>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
