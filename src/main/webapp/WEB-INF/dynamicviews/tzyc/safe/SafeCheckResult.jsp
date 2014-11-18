<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/WEB-INF/tlds/cmstudio.tld" prefix="cmstudio"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>安全任务检查结果</title>
<cmstudio:htmlBase />
<!--Start importing the jquery files -->
<cmstudio:importJsCss name="jquery" version="${jquery_version}" />
<!--End import the jquery files -->
<!--Start importing the jeasyui files -->
<cmstudio:importJsCss name="jeasyui" version="${jeasyui_version}" />
<!--End importing the jeasyui files -->

</head>
<body>
	<table id="dg" title="安全任务检查结果" class="easyui-datagrid"
		url="safeCheckResult/all" toolbar="#tb"
		pagination="true" rownumbers="true" fitColumns="true"
		singleSelect="true" >
		<thead>
			<tr>
				<th field="deviceName" width="50">设备名</th>
				<th field="taskType" width="50"data-options='formatter:function(value,row,index){
                				switch(row.taskType){
                					case 0 : 
                						return "单次";
                					case 1 :
                						return "每日";
                					case 2 :
                						return "每周";
                					case 3 :
                						return "每月";
                					case 4 :
                						return "每季度";
                					case 5 :
                						return "每年";
                					default :
                						break;
                				};
                				
        		  			}'>任务类型</th>  
        		  			
        		 <th field="inspectStatus" width="50" data-options="align:'center',
					formatter: function(value,row,index){
						if (!row.inspecttime || row.inspecttime==''){
							 return '未检查';
						} else {
							 if(row.taskStatus==0){
							 	return '不合格';
							 }else if(row.taskStatus==1){
							 	return '全部合格';
							 }
						}
					}
				" >检查状态</th>
				<th field="taskResult" data-options="align:'center',
					formatter: function(value,row,index){
						if (row.taskStatus==1){
							return '一切正常';
						} else if(row.taskStatus==0){
							return formatHTML+row.taskResult+formatHTML1;
						}
					}
				" width="50">任务结果</th>
				<th field="filePath" width="50" data-options="align:'center',
					formatter: function(value,row,index){
						if(!row.filePath || row.filePath.length<3){
			    			return '无图片';
			    		}
						return formatHTML3+row.filePath+formatHTML4;
					}
				" >图片记录</th>
				<th field="inspectName" width="50">检查员</th>
				<th field="inspecttime" width="50">检查时间</th>
				
				<th field="taskStartTime" width="50">开始时间</th>   
                <th field="taskEndTime" width="50">结束时间</th>
                <th field="creatorName" width="50">创建者</th>
				<th field="taskCreateTime" width="50">创建时间</th>
				
				<!-- <th field="createTime" width="50">创建时间</th> -->
			</tr>
		</thead>
	</table>
	
	<div id="dialog-issueResult" closed="true" class="easyui-dialog" title="检查问题列表" style="width:800px;height:372px;"
	        data-options="iconCls:'icon-save',resizable:true,modal:true">
        <table id="standardErrorResultGrid"></table>
	</div>
	<div id="tb">
       	开始时间: <input class="easyui-datebox" style="width:180px" readonly="readonly" id="startTime">
       	结束时间: <input class="easyui-datebox" style="width:180px" readonly="readonly" id="endTime">
        <a href="javascript:searchResult();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="length()">导出</a>
    </div>
	
	<div id="dialog-images" data-options="maximizable:true" closed="true" class="easyui-dialog" title="检查问题列表" style="padding:10px 0 0 0 ;text-align:center;width:800px;height:600px;"
	        data-options="iconCls:'icon-save',resizable:true,modal:true">
	        <div id="inner-dialog-images"></div>
	</div>
	
	<script type="text/javascript">

	function searchResult(){
		$("#dg").datagrid("load", {
		    startTime: $('#startTime').datebox('getValue'),
		    endTime: $('#endTime').datebox('getValue')
		});
	}
	
	function length() {
		//取到开始,结束时间
		var startDate = $("#startTime").datebox("getValue");  
		var endDate = $("#endTime").datebox("getValue");
		
		//格式化开始,结束时间
		var start=new Date(startDate.replace("-", "/").replace("-", "/"));  
		var end=new Date(endDate.replace("-", "/").replace("-", "/"));  
		
		//判断日期非空
		/* if((startDate!="" && endDate != "")||(startDate == "" && endDate == "")){
			//结束时间应晚于开始时间
			if(end<start){
				alert("结束时间应晚于开始时间");
			}
			else{ */
		    	$.post('/tzyc/safe/task/exportExcel',{exportfield:[1],
		    		exportheaders:[2],
		    		startDate : startDate,
					endDate : endDate,
					title:'安全任务检查结果'
		    		},
		    		function(result){
		    		var result = eval('('+result+')');
		    		if (result.suc){
		    			location.href = $("base").attr("href")+"resources/download/report.xls";
		            } else {
		                $.messager.show({    // show error message
		                    title: '错误',
		                    msg: result.errorMsg
		                });
		            }
		        });
			}	
		/* }else{
			alert("请输入日期");			
		}
			
		
	} */
    
		var url;
		function newObject() {
			$('#dlg').dialog('open').dialog('setTitle', '新建');
			$('#fm').form('clear');
			url = 'logistic/save?typeId=4';
		}
		function editObject() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$('#dlg').dialog('open').dialog('setTitle', '修改');
				$('#fm').form('load', row);
				url = 'logistic/update?id=' + row.id;
			}
		}
		function saveObject() {
			$('#fm').form('submit', {
				url : url,
				onSubmit : function() {
					return $(this).form('validate');
				},
				success : function(result) {
					var result = eval('(' + result + ')');
					if (result.errorMsg) {
						$.messager.show({
							title : 'Error',
							msg : result.errorMsg
						});
					} else {
						$('#dlg').dialog('close'); // close the dialog
						$('#dg').datagrid('reload'); // reload the user data
					}
				}
			});
		}
		function destroyObject() {
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$.messager.confirm('删除', '确定删除吗', function(r) {
					if (r) {
						$.post('logistic/delete', {
							id : row.id
						}, function(result) {
							if (result.suc) {
								$('#dg').datagrid('reload'); // reload the user data
							} else {
								$.messager.show({ // show error message
									title : 'Error',
									msg : result.errorMsg
								});
							}
						}, 'json');
					}
				});
			}
		}
		
 
		
		function getData(){
           
            return rows;
        }
        
        function pagerFilter(data){
            if (typeof data.length == 'number' && typeof data.splice == 'function'){    // is array
                data = {
                    total: data.length,
                    rows: data
                }
            }
            var dg = $(this);
            var opts = dg.datagrid('options');
            var pager = dg.datagrid('getPager');
            pager.pagination({
                onSelectPage:function(pageNum, pageSize){
                    opts.pageNumber = pageNum;
                    opts.pageSize = pageSize;
                    pager.pagination('refresh',{
                        pageNumber:pageNum,
                        pageSize:pageSize
                    });
                    dg.datagrid('loadData',data);
                }
            });
            if (!data.originalRows){
                data.originalRows = (data.rows);
            }
            var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
            var end = start + parseInt(opts.pageSize);
            data.rows = (data.originalRows.slice(start, end));
            return data;
        }
        
        var standardResultDataGrid;
    	
    	function showIssueResults(taskResult){
    		
    		$("#dialog-issueResult").dialog("open");
    		
    		 //初始化commonDevice
          	 standardResultDataGrid = $('#standardErrorResultGrid').datagrid({
    			    url:'safe/inspect/standard/findAllErrorStandardWithOptions',
    			    method:'POST', 
    			    queryParams:{
    			    	ids:taskResult
    			    },
    			    title:"7S检查标准问题列表",
    			    closed:false,
    			    pagination:true,
    			    loadFilter:pagerFilter,
    	            rownumbers:true,
    	            fitColumns:true,
    	            singleSelect:true,
    			    columns:[[
    			        {field:'decription',title:'标准描述',width:200},
    			        {field:'remark',title:'备注',width:100},
    			        {field:'recordStatus',title:'状态',width:100,formatter: function(value,row,index){
    						return "不合格"
    					}},
    			      
    			    ]]
    			});
    		
    	}
    	
    	function showResultsImages(filePaths){
    		//alert(taskResult);
    		$("#dialog-images").dialog("open");
    		
    		var arr = filePaths.split(";");
    		$("#inner-dialog-images").html('');
    		for(var i=0; i<arr.length-1; i++){
    			var imgstr = '<div><img src="resources/download/'+arr[i]+'" style="height:350px;width:650px;margin:5px 0 5px 0;"/></div>';
    			$("#inner-dialog-images").append($(imgstr));
    			console.log(arr[i]);
    		}
    		
    		//$("#dialog-images").text(filePaths);
    	}
    	//检查问题详细查看
    	var formatHTML="<a href='javascript:void(0)' class='easyui-linkbutton' iconCls='icon-search' onclick='showIssueResults(\"";
    	var formatHTML1 = "\")'>检查问题详细</a>";
    	//检查图片详细查看
    	var formatHTML3="<a href='javascript:void(0)' class='easyui-linkbutton' iconCls='icon-search' onclick='showResultsImages(\"";
    	var formatHTML4 = "\")'>查看</a>";
    	
    	
	</script>
	<style type="text/css">
		#fm {
			margin: 0;
			padding: 10px 30px;
		}
		
		.ftitle {
			font-size: 14px;
			font-weight: bold;
			padding: 5px 0;
			margin-bottom: 10px;
			border-bottom: 1px solid #ccc;
		}
		
		.fitem {
			margin-bottom: 5px;
		}
		
		.fitem label {
			display: inline-block;
			width: 80px;
		}
	</style>
</body>
</html>