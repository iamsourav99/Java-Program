<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body onload="showAlert('<%=request.getAttribute("messege")%>')">
	 <div class="form-container">
        <h1>Register</h1>
        <form name="reg" action="RegisterServlet" method="post" onsubmit="return validate()">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your name">

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" placeholder="Enter your username">

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" placeholder="Enter your password">

            <label for="re-password">Re-Type:</label>
            <input type="password" id="re-password" name="re-password" placeholder="Re-enter your password">

            <button type="submit">Submit</button>
        </form>
        <p>Already have an account? <a href="Login.jsp">Login here</a></p>
    </div>
	<script type="text/javascript">
	function showAlert(messege){
		if(messege=="success"){
			alert("You have successfully registered");
		}else(messege=="failure"){
			alert("failed to register");
		}
	}
	function validate(){
		 var name = document.reg.name.value;
         var username = document.reg.username.value;
         var password = document.reg.password.value;
         var rePassword = document.reg['re-password'].value;

         if (name === "" || username === "" || password === "" || rePassword === "") {
             alert("All fields must be filled out");
             return false;
         }

         if (password !== rePassword) {
             alert("Passwords do not match");
             return false;
         }

         return true;
	}
	</script>
</body>
</html>