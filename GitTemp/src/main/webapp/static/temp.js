window.onload = function(){
	
    document.getElementById("submitButton").addEventListener("click", addData);
}

	function addData(){
		
		var xhr = new XMLHttpRequest();
	    
	    xhr.onreadystatechange = function(){
	
	    	console.log("response text: "+ xhr.responseText+
			" http status: "+ xhr.status + 
			" http status text: "+ xhr.statusText + 
			" readyState: "+ xhr.readyState
	    	);
	    	
	    	if(xhr.readyState == 4 && xhr.status == 200){
	    		
	    		let obj = JSON.parse(xhr.responseText);
	    		
	    		document.getElementById("name").innerHTML = obj.name;
	    		document.getElementById("priority").innerHTML = obj.priority;
	            
	         }
	    }
	    
	    xhr.open("POST", "http://localhost:8080/GitTemp/api");
	    xhr.setRequestHeader("Content-Type", "application/json");
	    xhr.send();
	    
	}
	