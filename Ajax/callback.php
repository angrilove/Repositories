<?php

function my_callback_function() {
	echo "hello world!";
}

class BaseClass {
	static function myCallbackMethod() {
		echo "Callback!!";
	}
}

# call_user_func('my_callback_function');

# call_user_func(array('BaseClass', 'myCallbackMethod'));

$class = new BaseClass();
# call_user_func(array($class, 'myCallbackMethod'));

# call_user_func("BaseClass::myCallbackMethod");

######################################
$double = function($arg) {
	return $arg * 2;
};

$numbers = range(1, 5);
$new_numbers = array_map($double, $numbers);
/*
print_r($new_numbers);
print implode(' ', $new_numbers); */

function filter($arr, $callback) {
	$i = 0;$len = $arr.length;$ret;
	for (;$i < $len; $i++) {
		if ($callback($arr[$i])) {
			$ret[$i] = $arr[$i];
		}
	}
	return $ret;
}

function even($item) {
	$ret;
	if (!is_numeric($item)) {
		$ret = false;
	} else {
		try {
			$ret = !(intval($item) & 1);
		} catch(e) {
			$ret = false;
		}
	}
	return $ret;
}

$arr = array(1, 2, 3, 4, 5, 6);
print_r(filter($arr, even));
?>
