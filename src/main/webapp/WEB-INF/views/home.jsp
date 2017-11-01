<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <title>jsTree test</title>
  2 load the theme CSS file
  <link rel="stylesheet" href="resources/css/style.min.css" />
  CSS
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
 
JS
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
<script type="text/javascript">
$(function() {
    var tree = ${bnfTree};
    $('#jstree').jstree({
        'core': {
            'data': tree,
            "themes" : { "stripes" : true },
            "check_callback" : function (operation, node, parent, position, more) {
                if(operation === "copy_node" || operation === "move_node") {
                  if(parent.id === "#") {
                    return false; // prevent moving a child above or below the root
                  }
                }
                return true; // allow everything else
              }
            },
            "plugins" : ["dnd","search","state", "types", "wholerow"]
            
        
    });
    
    $('#jstree').on("changed.jstree", function (e, data) {
        console.log('node selected' +data.selected);
      });
     
	    
});

function demo_create() {
	var ref = $('#jstree').jstree(true),
		sel = ref.get_selected();
	if(!sel.length) { return false; }
	sel = sel[0];
	sel = ref.create_node(sel, {"type":"file"});
	if(sel) {
		ref.edit(sel);
	}
};
function demo_rename() {
	var ref = $('#jstree').jstree(true),
		sel = ref.get_selected();
	if(!sel.length) { return false; }
	sel = sel[0];
	ref.edit(sel);
};
function demo_delete() {
	var ref = $('#jstree').jstree(true),
		sel = ref.get_selected();
	if(!sel.length) { return false; }
	ref.delete_node(sel);
};


	function search() {
		var to = false;
		$('#demo_q').keydown(function () {
			console.log('inside demo q')
			if(to) { clearTimeout(to); }
			to = setTimeout(function () {
				var v = $('#demo_q').val();
				$('#jstree').jstree(true).search(v);
			}, 250);});
	};


</script>



  
</head>
<body>
	<div class="row">
					<div class="col-md-4 col-sm-8 col-xs-8">
						<button type="button" class="btn btn-success btn-sm" onclick="demo_create();"><i class="glyphicon glyphicon-asterisk"></i> Create</button>
						<button type="button" class="btn btn-warning btn-sm" onclick="demo_rename();"><i class="glyphicon glyphicon-pencil"></i> Rename</button>
						<button type="button" class="btn btn-danger btn-sm" onclick="demo_delete();"><i class="glyphicon glyphicon-remove"></i> Delete</button>
					</div>
					<div class="col-md-2 col-sm-4 col-xs-4" style="text-align:right;">
						<input type="text" value="" onkeydown="search()" style="box-shadow:inset 0 0 4px #eee; width:120px; margin:0; padding:6px 12px; border-radius:4px; border:1px solid silver; font-size:1.1em;" id="demo_q" placeholder="Search" />
					</div>
				</div>
	
  <!-- 3 setup a container element -->
  <div id="jstree" class="demo jstree jstree-1 jstree-default"></div>



  </script> 
</body>





</html>
