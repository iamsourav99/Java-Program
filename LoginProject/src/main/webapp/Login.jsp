<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style1.css">
</head>

<body onload="showAlert('<%= request.getAttribute("loginMessage") %>')">
	 <div class="form-container">
        <h1>Login Page</h1>
        <form name="valid" action="LoginServlet" method="post" onsubmit="return validate()">
            <input type="text" name="username" placeholder="Username"><br>
            <input type="password" name="password" placeholder="Password"><br>
            <button type="submit">Submit</button>
        </form>
	New User <a href="Register.jsp">Register</a>
    </div>
	<%-- javascript code for check user input  --%>
	<script type="text/javascript">
	  function showAlert(message) {
          if (message === "success") {
              alert("You have successfully logged in!");
          } else if (message === "failure") {
              alert("Incorrect username or password. Please try again.");
          }
      }
		function validate(){
			var x1=document.valid.username.value;
			if(x1==null || x1=="")
				{
					alert("username shuld not be empty")
					return false;
				
				}
			var x2=document.valid.password.value;
			if(x2==null || x2=="")
			{
				alert("password shuld not be empty")
				return false;
			
			}
			return true;
		}
	</script>
</body>
</html>