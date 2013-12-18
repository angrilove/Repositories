<?php

function fib($digit) {
	return ($digit < 2 ? $digit : fib($digit - 2) + fib($digit - 1));
}

$digit = $_REQUEST['digit'];
if (!is_null($digit) && is_numeric($digit)) {
	echo '<div $style="border:dotted 1px red;">' . fib($digit) . '</div>';
} else {
	echo '<div $style="border:dotted 1px red;"> null </div>';
}