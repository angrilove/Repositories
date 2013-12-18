<?php
$link = mysql_connect('localhost:3306','root','a');
if (!$link) {
	die('Could not connect to MySQL: ' . mysql_error());
} 
echo 'Connection OK'; mysql_close($link);
?>