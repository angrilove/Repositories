<?php

function getNewSize($width, $height, $imagesInfo) {
	$size["width"] = $imagesInfo["width"];
	$size["height"] = $imagesInfo["height"];

	if ($width < $imagesInfo["width"]) {
		$size["width"] = $width;
	}
	if ($height < $imagesInfo["height"]) {
		$size["height"] = $height;
	}

	if ($imagesInfo["width"] * $size["width"] > $imagesInfo["height"] * $size["height"]) {
		$size["height"] = round($imagesInfo["height"] * $size["width"] / $imagesInfo["width"]);
	} else {
		$size["width"] = round($imagesInfo["width"] * $size["height"] / $imagesInfo["height"]);
	}
	return $size;
}
$imagesInfo = Array("width" => 400, "height" => 700);

// 300 * 400 = 120,000
// 400 * 200 = 80,000
// 300 * 150 = 45,000
print_r(getNewSize(500, 400, $imagesInfo));