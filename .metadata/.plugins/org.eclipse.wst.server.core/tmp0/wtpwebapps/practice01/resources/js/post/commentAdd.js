function addCheck(){
	if($("#cmWriter").val() == ""){
		alert("작성자를 입력해주세요");
		$("#cmWriter").focus();
		return;
	}else if($("#cmContent").val() == ""){
		alert("내용을 입력해주세요");
		$("#cmContent").focus();
		return;
	}else{
		var form = document.getElementById('commentAddForm');
		form.action="CommentAdd.do";
		form.method = "POST";
		form.submit();
	}
}

//var idx = getParmeter("idx");
console.log(" idx : " + idx1);

function update(idx){
	location.href = "updatForm.do?idx="+idx;
	
}

function delete1(idx){
	location.href  = "delete.do?idx="+idx; 
}

function home(){
	location.href = "/controller";
}
