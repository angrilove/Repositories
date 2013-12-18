<?php
define('APP_DEBUG', TRUE);

define('THINKPHP_PATH', '../ThinkPHP/');

define('APP_NAME', 'App');
define('APP_PATH', './');
// 将入口文件定义到外部
// define('APP_PATH', './App/');

require(THINKPHP_PATH."/ThinkPHP.php");
App::run();
?>
