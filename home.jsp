
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <link rel = "stylesheet" href = "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">  
    <style>
#main{
  overflow: auto;
  border: 2px solid black;
  box-shadow: 10px 10px 10px rgb(226, 226, 226);


}
    </style>

</head>
<body> <br><br>
    <div class="row mb-5">
        <form action="">  
          <div class="col-lg-8 mx-auto">    

          <div class="form-floating input-group  mb-4">  
            <input type="search" placeholder="Search here..." id="floatingInput" class="form-control">  
            <label for="floatingInput">Search Here.......</label>
            <div class="input-group-append">  
              <button id="button-addon5" type="submit" class="btn btn-primary" style="padding: 15px 20px; margin-left: 10px;"> <i class="fa fa-search"></i> </button>  
            </div>  
          </form>
            <div class="input-group-append">
              <form action="Skilll/profile" method="POST">
           <button  id="button-addon5" class="btn btn-secondary" type="submit" onclick="Skill/sjljl" style="padding: 15px 20px; margin-left: 20px; border:2px solid white;"> <i class="fa fa-user"></i></button>
            </div>
          </div>  
          </div>
        </form>  
      </div>
      <div class="container mb-5" style="height: 400px;" id="main">



        <button type="submit" formaction="/Skilll/home" id="button-addon5" class="btn btn-info" style="padding: 15px 20px; margin-left: 20px; border:2px solid black;"><i class="fa fa-arrow-left"></i></button>
      
      
      

      <br>
      <div class="d-flex flex-column">
        <div class="card w-75 mb-3 p-2">
          <div class="card-body d-flex justify-content-between align-items-center">
            <div>
              <h5 class="card-title">Title Here</h5>
              <p class="card-text">Text Here</p>
            </div>
            <form method="POST" action="/Skilll/delete" class="p-2">
              <button class="btn btn-danger rounded-circle border border-dark"><i class="fa fa-close"></i></button>
            </form>
          </div>
        </div>
      </div>
      


</div>
    
      <div class="row mb-5">
        <form action="/Skilll/addcommand" method="POST">  
          <div class="col-lg-8 mx-auto">    

          <div class="form-floating input-group  mb-4">  
            <input type="text" class="form-control" id="floatingInput" placeholder="Command" name="cmd" >
            <label for="floatingInput">Enter Command</label>
            <div class="input-group-append">  
              <button id="button-addon5" type="submit" class="btn btn-primary" style="padding: 15px 20px; margin-left: 10px;"><i class="fa fa-send"></i> </button>  
            </div>  
          </div>  
          </div>
        </form>  
      </div>
       
          
      
</body>
</html>








<div class="container-fluid" id="login" style="width:40%;">
  <form action="/Skilll/update" method="POST" class="needs-validation" novalidate><br>
      <div class="form-floating">
          <input type="text" class="form-control" id="floatingInputGroup1" placeholder="username" name="uname" value="" >
         
      </div><br><br>
      <div class="form-floating">
          <input type="email" class="form-control" id="floatingInputGroup2" placeholder="name@gmail.com" name="email" value="" hidden>

      </div><br><br>
      <div class="form-floating">
          <input type="text" class="form-control" id="floatingInputGroup3" placeholder="phone number" name="phno" value="">

      </div><br><br>
      <div class="form-floating">
          <input type="text" class="form-control" id="floatingPassword" placeholder="Password" name="pword" value="">

      </div><br>
      <input type="submit" value="Update" class="btn btn-primary" style="border: 2px solid black;"> <br><br>
  </form>
</div>



<form method="get">

  <button type="submit" formaction="/Skilll/home">dsjlkjkl</button>
<input type="submit"  ><i class=""></i>
</form>