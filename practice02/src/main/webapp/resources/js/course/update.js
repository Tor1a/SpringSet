function updateCheck(){
	if($("#crId").val() == ""){
		alert("과목코드를 입력해주세요");
		$("#crId").focus();
		return;
	}else if($("#crName").val() == ""){
		alert("과목명을 입력해주세요");
		$("#crName").focus();
		return;
	}else if($("#lecturer").val() == "0"){
		alert("담당강사를 선택해주세요");
		return;	
	}
	else if($("#credit").val() == ""){
		alert("학점을 입력해주세요");
		$("#credit").focus();
		return;
	}else if($("input:radio[name=week]:checked").length<1){
		alert("요일을 선택해주세요");
		return;
	}else if($("#start_hour").val() == "" ){
		alert("시작시간을 작성해주세요");
		$("#start_hour").focus();
		return;
	}else if($("#end_end").val() == ""){
		alert("종료시간을 작성해주세요");
		$("#end_end").focus();
		return;
	}else{
	var form = document.courseUpdate;
	form.action = "updateCourse.do";
	form.method = "POST";
	form.submit();
}	
}
function home(){
	location.href = "/controller";
}

