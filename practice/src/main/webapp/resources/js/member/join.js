function joinCheck(){	
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
	var form = document.joinForm;
	form.action = "join.do";
	form.method = "POST";
	form.submit();
	
}

//$("#phone").on("keyup",function(input){
//	var inputVal = $(this).val();
//	console.log("inputVal : " + inputVal);
//	$(this).val(inputVal.replace(/[^0-9]$/g,""));
//});
//
//$("#city").on("keyup",function(input){
//	var inputVal = $(this).val();
//	$(this).val(inputVal.replace(/[^0-9]/gi,""));
//});

$("#grade").on("keyup",function(input){
	var inputVal = $(this).val();
	$(this).val(inputVal.reaplace(/^[A-Z]+$/));
});
	
}
