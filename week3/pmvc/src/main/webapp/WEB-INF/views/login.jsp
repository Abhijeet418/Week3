<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Faculty Login</title>
    <script>
        function submitForm(event) {
            event.preventDefault();
            
            const formData = new FormData(document.getElementById("loginForm"));
            
            fetch("login", {
                method: "POST",
                body: new URLSearchParams(formData)
            })
            .then(response => {
                if (response.redirected) {
                    window.location.href = response.url;
                } else {
                    alert("Invalid Credentials!");
                }
            })
            .catch(error => console.error("Error:", error));
        }
    </script>
</head>
<body>
    <h2>Faculty Login</h2>
    
    <form id="loginForm">
        <label for="id">Faculty ID:</label>
        <input type="text" name="id" required><br><br>

        <label for="pass">Password:</label>
        <input type="password" name="pass" required><br><br>

        <button type="submit" onclick="submitForm(event)">Login</button>
    </form>
</body>
</html>
