$("document").ready(function() {
	addStyle();

});

function addStyle() {
	$("table tr:odd").addClass("nice");
	$("#outputTable tr").mouseover(function() {
		$(this).addClass("mouseover");
	});
	$("#outputTable tr").mouseout(function() {
		$(this).removeClass("mouseover");
	});
}

function success(data) {
	addToOutput(data);
	addStyle();
}

function addToBranch() {
	var orderQty = $("#qty").val();
	var branches = $("#inputTable table tr").length - 1;

	$.ajax({
		type : 'post',
		url : 'addtobranch.do',
		data : orderQty,
		async : 'true',
		success : success
	});
}

function addToOutput(json) {
	var json_parsed = $.parseJSON(json);

	var qty = 0;
	var rowNumber = 1;

	for ( var index = 0; index < json_parsed.branches.length; index++) {
		var branch = json_parsed.branches[index];

		rowNumber++;

		if (rowNumber > $("#outputTable tr").length) {
			addToRow1();
		}
		$("#outputTable tr:nth-child(" + rowNumber + ") td:nth-child(1)").html(
				branch.id);
		$("#outputTable tr:nth-child(" + rowNumber + ") td:nth-child(2)").html(
				branch.name);
		$("#outputTable tr:nth-child(" + rowNumber + ") td:nth-child(3)").html(
				branch.weight);
	}
}

function addToRow() {

	$('#outputTable tr:last').after('<tr><td></td><td></td><td></td></tr>');

}

function addToRow1() {
	$("#outputTable").find('tbody').append(
			'<tr><td></td><td></td><td></td></tr>s');

}

function removeRow() {
	$('#test_table tr:last').remove();

}
