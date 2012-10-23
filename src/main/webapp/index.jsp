<html>
<head>
<meta charset="UTF-8">
<title>JQuery sample 1</title>
<link rel="stylesheet" href="css/general.css">
<script type="Text/javascript" src="js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="js/library.js"></script>
</head>
<body>
	<div id=orderQty>
		<label>Order Quantity : </label> <input id="qty" type="text" /> <input
			type="button" value="add" onclick="addToBranch()" />
	</div>

	<h2>Branch Allocation</h2>
	<hr>
	<div id="outputTable">
		<table>
			<tr>
				<th>Id</th>
				<th>Branch Name</th>
				<th>Qty</th>
			</tr>
			<tr>
				<td>AA</td>
				<td>1</td>
				<td>0</td>
			</tr>
		</table>
	</div>

</body>
</html>
