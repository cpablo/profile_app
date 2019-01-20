
function getIDParamValue(){
	var paramFields = window.location.search.substring(1);	
	
	return paramFields.split("=")[1];
}