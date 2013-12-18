<?php

function ajax() {
	$response = <<< EORES
$_REQUEST[callback](
{
	"status": "200",
	"message": "$_REQUEST",
	"navTabId": "",
	"callbackType": "closeCurrent",
	"forwardUrl": "http://www.baidu.com/"
})
EORES;
	return $response;
}
echo ajax();
?>