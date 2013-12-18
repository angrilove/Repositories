jQuery(document).ready(function($) {
	var loading = $('#loading');
	$(document).ajaxStart(function() {
		if (loading.length == 0) {
			loading = $('<div id="loading" />').appendTo(document);
		}
		loading.dialog({
			title: '等待提示',
			width: 200,
			height: 72,
			cache: false,
			closable: false,
			content: '<img src="./resources/themes/default/images/loading.gif" alt="正在加载，请稍后。。。" /> 正在加载，请稍后。。。',
			modal: true,
			resizable: false
		});
	}).ajaxStop(function() {
		loading.dialog('close');
	});
	
	initUI();
	
});

function initUI() {
	var $p = arguments[0] || document;
	$('a[target="navTab"]', $p).each(function() {
		$(this).click(function(e) {
			Smse.navTab(this);
			e.preventDefault();
		});
	});
	
	$('a[target="dialog"]', $p).each(function() {
		$(this).click(function(e) {
			Smse.dialog(this);
			e.preventDefault();
		});
	});
}

var Smse = {
	navTab: function(node) {
		var $this = $(node);
		var url = $this.attr('href');
		var title = $this.attr('title') || $this.text();
		var external = eval( $this.attr('external') || 'false' );
		var $navTab = $('#navTab');
		if (url) {
			if (!$navTab.tabs('exists', title)) {
				if (external) {
					$navTab.tabs('add', {
						title: title,
						content: this.createFrame(url),
						closable: true
					});
				} else {
					$navTab.tabs('add', {
						title: title,
						href: url,
						closable: true
					});
				}
			} else {
				$navTab.tabs('select', title);
				var currTab = $('#navTab').tabs('getSelected');
				if (external) {
					$navTab.tabs('update', {
						tab: currTab,
						options: {
							content: createFrame(url)
						}
					});
				} else {
					$navTab.tabs('update', {
						tab: currTab,
						options: {
							href: url
						}
					});
				}
			}
			
			initUI($navTab.tabs('getSelected'));
		}
		
	},
	dialog: function(node) {
		var $this = $(node);
		var url = $this.attr('href');
		var title = $this.attr('title') || $this.text();
		var external = eval( $this.attr('external') || 'false');
		var rel = $this.attr('rel');
		var width = $this.attr('width');
		var height = $this.attr('height');
		var modal = $this.attr('modal') == 'false' ? false : true;
		var refresh = $this.attr('resizable') || true; 
		var dlg = null;
		if (rel) {
			dlg = $('#' + rel);
			if (dlg.length === 0) {
				dlg = $('<div id="' + rel + '" />').appendTo(document);
			}
		} else {
			dlg = $('#dialog');
			if (dlg.length === 0) {
				dlg = $('<div id="dialog" />').appendTo(document);
			}
		}
		if (url) {
			width = (!width || width < 120) ? 120 : width;
			height = (!height || height < 100) ? 100 : height;
			console.log(width, height, modal);
			if (external) {
				dlg.dialog({
					title: title,
					width: width,
					height: height,
					cache: false,
					content: this.createFrame(url),
					modal: modal,
					resizable: true
				});
			} else {
				dlg.dialog({
					title: title,
					width: width,
					height: height,
					cache: false,
					href: url,
					modal: modal,
					resizable: true
				});
			}
			
			initUI(dlg.dialog('dialog'));
		}
	},
	createFrame: function(url) {
	    var iframe = '<div class="pageContent" style="padding:10px;height:95%;"><iframe scrolling="no" frameborder="0" border="0" marginwidth="0" marginheight="0" src="' + url + '" style="width:100%;height:98%;"></iframe></div>';
	    return iframe;
	}
}

