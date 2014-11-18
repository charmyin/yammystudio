/***
 * author: charmyin
 * datetime: 2013-9-9 
 * title: Used to handle the permission part of menuManage.jsp ~
 ***/

 
function getPermissionString(){
	var gridData = $('#permissionGrid').datagrid('getData');
	//检验grid数据有效性
	for(var i=0; i<gridData.total; i++){
		//存在校验未通过
		var result = $('#permissionGrid').datagrid('validateRow',i);
		if(!result){
			return false;
		}
	}
	//确认无误，保存状态，使得可以获取编辑中的数据
	accept();
	return JSON.stringify(gridData.rows);
}

var editIndex = undefined;
function endEditing(){
    if (editIndex == undefined){return true}
    if ($('#permissionGrid').datagrid('validateRow', editIndex)){
        var ed = $('#permissionGrid').datagrid('getEditor', {index:editIndex,field:'menuId'});
        //var productname = $(ed.target).combobox('getText');
        //$('#permissionGrid').datagrid('getRows')[editIndex]['productname'] = productname;
        $('#permissionGrid').datagrid('endEdit', editIndex);
        editIndex = undefined;
        return true;
    } else {
        return false;
    }
}
function onClickRow(index){
    if (editIndex != index){
        if (endEditing()){
            $('#permissionGrid').datagrid('selectRow', index).datagrid('beginEdit', index);
            editIndex = index;
        } else {
            $('#permissionGrid').datagrid('selectRow', editIndex);
        }
    }
}
function append(){
    if (endEditing()){
        $('#permissionGrid').datagrid('appendRow',{});
        editIndex = $('#permissionGrid').datagrid('getRows').length-1;
        $('#permissionGrid').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
    }
}
function removeit(){
    if (editIndex == undefined){return}
    $('#permissionGrid').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
    editIndex = undefined;
}
function accept(){
    if (endEditing()){
        $('#permissionGrid').datagrid('acceptChanges');
    }
}
function reject(){
    $('#permissionGrid').datagrid('rejectChanges');
    editIndex = undefined;
}
function getChanges(){
    var rows = $('#permissionGrid').datagrid('getChanges');
    alert(rows.length+' rows are changed!');
}
 