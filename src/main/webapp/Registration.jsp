	function validateForm() {
		var pw1 = document.getElementById("pswd1").value;
		var pw2 = document.getElementById("pswd2").value;
		var name1 = document.getElementById("fname").value;
		var name2 = document.getElementById("lname").value;
		var userinput = document.getElementById("dob").value;
		var dob = new Date(userinput);
		 if(userinput==null || userinput=='') {
		      document.getElementById("message").innerHTML = "**Choose a date please!";  
		      return false; 
		    }  
		 else{
		    var month_diff = Date.now() - dob.getTime();
		    var age_dt = new Date(month_diff);   
		    var year = age_dt.getUTCFullYear();
		    var age = Math.abs(year - 1970);
		    if(age<18)
		    { 
		    	 document.getElementById("message").innerHTML ="***Not eligeable to Register"
		    return false;
		    }
		 }
		if (name1 == "") 
		{
			document.getElementById("blankMsg").innerHTML = "**Fill the first name";
			return false;
		}
		if (!isNaN(name1)) {
			document.getElementById("blankMsg").innerHTML = "**Only characters are allowed";
			return false;
		}
		if (!isNaN(name2)) {
			document.getElementById("charMsg").innerHTML = "**Only characters are allowed";
			return false;
		}
		if (pw1 != pw2) {
			document.getElementById("message2").innerHTML = "**Passwords are not same";
			return false;
		} 
	}