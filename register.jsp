<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" />

    <style>
        body {
            color: black;
            margin-top: 150px;
        }
        #login {
            text-align: center;
            justify-content: center;
            align-items: center;
            border: 2px solid rgb(233, 163, 192);
            border-radius: 10px;
            box-shadow: 10px 10px 10px rgb(233, 163, 192);
        }
    </style>
</head>
<body>

    <div class="container-fluid" id="login" style="width:40%;">
        <form action="/Skilll/register" method="POST" class="needs-validation" novalidate><br>
            <div class="form-floating">
                <input type="text" class="form-control" id="floatingInputGroup1" placeholder="username" name="uname" required>
                <label for="floatingInputGroup1">Username</label>
                <div class="invalid-feedback">
                    Please enter username.
                </div>
            </div><br><br>
            <div class="form-floating">
                <input type="email" class="form-control" id="floatingInputGroup2" placeholder="name@gmail.com" name="email" required>
                <label for="floatingInputGroup2">Email Address</label>
                <div class="invalid-feedback">
                    Please enter a valid email address.
                </div>
            </div><br><br>
            <div class="form-floating">
                <input type="text" class="form-control" id="floatingInputGroup3" placeholder="phone number" name="phno" required>
                <label for="floatingInputGroup3">Phone Number</label>
                <div class="invalid-feedback">
                    Please enter a valid phone number.
                </div>
            </div><br><br>
            <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="pword" required>
                <label for="floatingPassword">Password</label>
                <div class="invalid-feedback">
                    Please enter password.
                </div>
            </div><br>
            <input type="submit" value="Register" class="btn btn-primary" style="border: 2px solid black;"> <br><br>
        </form>
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
