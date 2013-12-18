<%@ page pageEncoding="UTF-8"%>
<div class="pageContent">
	<input type="text" id="combo" name="combo" value="Type Value"><br>
	<select id="selectcombo" name="selectcombo">
		<option value="javascript">Javascript</option>
		<option value="java">Java</option>
		<option value="C">C</option>
		<option value="C++">C++</option>
	</select>
	
	<div id="combo_select">
		<div style="color:#99BBE8;background:#fafafa;padding:5px;">Select a language</div>
		<input type="radio" name="lang" value="01"><span>Java</span><br/>
		<input type="radio" name="lang" value="02"><span>C#</span><br/>
		<input type="radio" name="lang" value="03"><span>Ruby</span><br/>
		<input type="radio" name="lang" value="04"><span>Basic</span><br/>
		<input type="radio" name="lang" value="05"><span>Fortran</span>
	</div>
</div>
<script type="text/javascript">
$('#combo').combo({
	required: true,
	multiple: true,
	editable: true,
	width: 200,
	keyHandler: {
		up: function(e) {
			console.log('keyHandler up', e);
		},
		down: function(e) {
			console.log('keyHandler down', e);
		},
		enter: function(e) {
			console.log('keyHandler enter', e);
		},
		query: function(e) {
			console.log('keyHandler query', e);
		}
	}
});
$('#combo').combo('setText', '设置文本');
$('#combo_select').appendTo($('#combo').combo('panel'));
$('#combo_select input').click(function() {
	var v = $(this).val() + $('#combo').combo('getValue');
	var s = $(this).next().text() + $('#combo').combo('getText');
	$('#combo').combo('setValue', v).combo('setText', s).combo('hidePanel');
	console.log($('#combo').combo('textbox'));
});

$('#selectcombo').combo({
	multiple: true,
	editable: false,
	separator: ';',
	width: 200
});
</script>
