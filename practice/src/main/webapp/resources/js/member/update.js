/**
 * 
 */
function updateCheck(){	
	if($("#custname").val() == ""){
		alert("이름을 입력해주세요");
		$("#custname").focus();
		return;
	}else if($("#phone").val() =="" ){
		alert("전화번호를 입력하세요");
		$("#phone").focus();
		return;
	}else if($("#address").val() == ""){
		alert("주소를 입력해주세요");
		$("#address").focus();
		return;
	}else if($("#grade").val() == ""){
		alert("고객등급을 입력해주세요");
		$("#grade").focus();
		return;
	}else if($("#city").val() == ""){
		alert("도시코드를 입력해주세요");
		$("#city").focus();
		return;
	}
	if($("#grade").val() != 'A' && $("#grade").val() != 'B' && $("#grade").val() != 'C'){
		alert("고객 등급은 A, B, C 코드만 입력해주세요");
		$("#grade").focus();
		return false;
	}else {
	var form = document.updateForm;
	form.action = "update.do";
	form.method = "POST";
	form.submit();
	
}

	
}
