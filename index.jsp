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
    <form action="/Skilll/login" method="POST" class="needs-validation" novalidate><br>
        <div class="form-floating">
            <input type="text" class="form-control" id="floatingInput" placeholder="username" name="uname" required>
            <label for="floatingInput">Username</label>
            <div class="invalid-feedback">
                Please enter username.
            </div>
        </div><br><br>
      
            <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="pword" required>
                <label for="floatingPassword">Password</label>
            
            <div class="invalid-feedback">
                Please enter password.
            </div>
        </div><br>
        <input type="submit" value="Login" class="btn btn-success"> <input type="reset" value="Reset" class="btn btn-danger"><br><br>
    </form>
    New User Register Here<a href="register.jsp"><button class="btn btn-primary" style="border: 2px solid black;">Register</button></a>
    <br><br>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script>
    (function () {
        'use strict';

        // Fetch all the forms we want to apply custom Bootstrap validation styles to
        var forms = document.querySelectorAll('.needs-validation');

        // Loop over them and prevent submission
        Array.prototype.slice.call(forms)
            .forEach(function (form) {
                form.addEventListener('submit', function (event) {
                    if (!form.checkValidity()) {
                        event.preventDefault();
                        event.stopPropagation();
                    }

                    form.classList.add('was-validated');
                }, false);
            });
    })();
</script>
</body>
</html>
