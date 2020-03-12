function sayHello() {

	document.write("<h1>Hello Good Afternoon</h1>");
	document.write("<h1>Today's date is " + new Date() + "</h1>");
}

function validate() {

	var name = document.lf.userName.value.trim();
	var pass = document.lf.password.value.trim();
	if (name == "") {
		alert("Username  should not be empty");
		return false;
	}

	else if (pass == "") {
		alert("Password  should not be empty");
		return false;
	}
}