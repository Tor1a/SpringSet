var crId = document.getElementById('vo.crId');

function deleteBtn(crId){
	if(confirm("삭제 하시겠습니까?")){
		var form = document.getElementById('delCourse');
		form.action = 'deleteCourseForm.do?crId='+crId;
		form.method = "GET";
		form.submit();
		
		return true;
	}else{
		
		return false;
	}
}


function add(){
	location.href = "courseAddForm.do";
}
