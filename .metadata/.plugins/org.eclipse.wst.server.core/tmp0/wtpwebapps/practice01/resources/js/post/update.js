function updateCheck(){
	if($("#writer").val() == ""){
		alert("작성자를 입력해주세요");
		$("#writer").focus();
		return;
	}else if($("#subject").val() == ""){
		alert("제목을 입력해주세요");
		$("#subject").focus();
		return;
	}else if($("#content").val() == ""){
		alert("내용을 입력해주세요");
		$("#content").focus();
		return;
	}else {
		var form = document.getElementById('updateForm');
		form.action = "update.do";
		form.method = "POST";
		form.submit();
	}
	

}