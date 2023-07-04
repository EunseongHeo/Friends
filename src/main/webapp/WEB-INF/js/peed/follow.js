
	console.log("test~~~")
	function followAgree(userName) {
		console.log("function()실행");
		let name = userName;
		console.log(name);
		
		$.ajax({
			url: 'requestOk',
			type: 'post',
			data: {
				name : name
			},
			success: function(data){
				console.log("요청성공!")
			},
			error: e => {
				console.log(e.status + ': ' + e.statusText);
			}
		
			
		});
		
	}
	
	function followDelete(userName) {
		console.log("followDelete()실행");
		let name = userName;
		console.log(name);
		
		$.ajax({
			url: 'requestDelete',
			type: 'post',
			data: {
				name : name
			},
			success: function(data){
				console.log("요청성공!")
			},
			error: e => {
				console.log(e.status + ': ' + e.statusText);
			}
		
			
		});
		
	}
