<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="pageContent">
	<div id="tt" class="easyui-tabs" style="width:500px;height:250px;"
		data-options="
			tools:[{
				iconCls:'icon-mini-refresh',
				handler: function() {
					alert('refresh');
				}
			},{
				iconCls: 'icon-mini-add',
				handler: function() {
					alert('add');
				}
			}],
			plain: true,
			border: false,
			scrollIncrement: 100,
			scrollDuration: 400,
			toolPosition: 'right',
			tabPosition: 'left',
			headerWidth: 100,
			onContextMenu: function(e, title, index) {
				alert(e, title, index);
				e.preventDefault();
				console.log( e );
			}
		">
		<div title="Tab1" style="padding:20px;">
			<p>arguments.callee
HISTORY EDIT
TABLE OF CONTENTS

Summary
Description
Example: Using arguments.callee in an anonymous recursive function
A bug after the deprecation of arguments.callee?
TAGS FILES
Summary

Specifies the currently executing function.

Property of arguments
Implemented in	JavaScript 1.2
ECMAScript Edition	3rd Edition
Description

callee is a property of the arguments object. It can be used to refer to the currently executing function inside the function body of that function. This is for example useful when you don't know the name of this function, which is for example the case with anonymous functions.

Note: You should avoid using arguments.callee() and just give every function (expression) a name.
Warning: The 5th edition of ECMAScript forbids use of arguments.callee() in strict mode.
Example: Using arguments.callee in an anonymous recursive function

A recursive function must be able to refer to itself. Typically, a function refers to itself by its name. However, an anonymous function does not have a name, and if there is no accessible variable referring to it, i.e. the function is not assigned to any variable, the function cannot refer to itself. (Anonymous functions can be created by a function expression or the Function constructor.) This is where arguments.callee comes in.

The following example defines a function, which, in turn, defines and returns a factorial function. This example isn't very practical, and there are nearly no cases where the same result can not be archived with named function expressions.

1
2
3
4
5
6
7
8
9
function create() {
   return function(n) {
      if (n &lt;= 1)
         return 1;
      return n * arguments.callee(n - 1);
   };
}
 
var result = create()(5); // returns 120 (5 * 4 * 3 * 2 * 1)
A bug after the deprecation of arguments.callee?

Early versions of JavaScript did not allow named function expressions, and for this reason you could not make a recursive function expression.

For example, this syntax worked:

1
2
3
4
5
function factorial (n) {
    return !(n &gt; 1) ? 1 : factorial(n - 1) * n;
}
 
[1,2,3,4,5].map(factorial);
but:

1
2
3
[1,2,3,4,5].map(function (n) {
    return !(n &gt; 1) ? 1 : /* what goes here? */ (n - 1) * n;
});
did not. To get around this arguments.callee was added so you could do

1
2
3
[1,2,3,4,5].map(function (n) {
    return !(n &gt; 1) ? 1 : arguments.callee(n - 1) * n;
});
However this was actually a really bad solution as this (in conjunction with other arguments, callee, and caller issues) make inlining and tail recursion impossible in the general case (you can achieve it in select cases through tracing etc, but even the best code is sub optimal due to checks that would not otherwise be necessary). The other major issue is that the recursive call will get a different this value, eg.

1
2
3
4
5
6
7
8
9
10
11
12
var global = this;
 
var sillyFunction = function (recursed) {
    if (!recursed) { return arguments.callee(true); }
    if (this !== global) {
        alert("This is: " + this);
    } else {
        alert("This is the global");
    }
}
 
sillyFunction();
ECMAScript 3 resolved these issues by allowing named function expressions. For example:

1
2
3
[1,2,3,4,5].map(function factorial (n) {
    return !(n &gt; 1) ? 1 : factorial(n-1)*n;
});
This has numerous benefits

the function can be called like any other from inside your code
it does not pollute the namespace
the value of this does not change
it's more performant (accessing the arguments object is expensive)
In addition to everything else, the question was about arguments.callee.caller, or more specifically Function.caller. At any point in time you can find the deepest caller of any function on the stack, and as I said above looking at the call stack has one single major effect: It makes a large number of optimizations impossible, or much much more difficult. For example, if you cannot guarantee that a function f will not call an unknown function it is not possible to inline f. Basically it means that any call site that may have been trivially inlinable accumulates a large number of guards, take:

1
function f (a, b, c, d, e) { return a ? b * c : d * e; }
If the JavaScript interpreter cannot guarantee that all the provided arguments are numbers at the point that the call is made, it needs to either insert checks for all the arguments before the inlined code, or it cannot inline the function. Now in this particular case a smart interpreter should be able to rearrange the checks to be more optimal and not check any values that would not be used. However in many cases that's just not possible and therefore it becomes impossible to inline.

However in a case like the following there are not alternatives to arguments.callee, so its deprecation could be a bug (see bug 725398):

1
2
3
4
5
6
7
8
9
function createPerson (sIdentity) {
    var oPerson = new Function("alert(arguments.callee.identity);");
    oPerson.identity = sIdentity;
    return oPerson;
}
 
var john = createPerson("John Smith");
 
john();</p>
		</div>
		<div title="Tab2" data-options="closable:true" style="overflow:auto;padding:20px;display:none;">
			tab2
		</div>
		<div title="Tab3" style="padding:20px;" data-options="iconCls:'icon-reload',closable:true">
			tab3
		</div>
	</div>
	<script type="text/javascript">
		console.log($('#tt'));
	</script>
</div>
