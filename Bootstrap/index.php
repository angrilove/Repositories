<?php
$echo = <<< ECHOEND
<!DOCTYPE html>
<html lang="zh">
<head>
	<title>Bootstrap 101 Template</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="stylesheet" type="text/css" media="screen" href="bootstrap/css/bootstrap.css">
	<link rel="stylesheet" type="text/css" media="screen" href="bootstrap/css/bootstrap-responsive.css">

	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
	<script type="text/javascript" src="bootstrap/js/bootstrap.js"></script>

</head>
<body>
	<h1>Hello, world!</h1>
	<table>
		<thead>
			<tr>
				<td>NAME</td>
				<td>VALUE</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>HTTP_HOST</td>
				<td></td>
			</tr>
		</tbdoy>
	</table>
</body>
</html>

ECHOEND;

function filter($arr) {
	$i;$ret;
	for ($i = $arr.length;$i > 0; $i--) {
		if (even($arr[$i])) {
			$ret.push($arr[$i]);
		}
	}
	return $ret;
}

function even($item) {
	$ret;
	if (!is_numeric($item)) {
		$ret = false;
	} else {
		$ret = !($item & 1);
	}
	return $ret;
}

$arr = new array(1,2,3,4,5,6,7,8,9,10);
PRINT_R(filter($arr));

?>
