swapColor= function(){
	document.getElementById("topLeft").className = 'square blue';
	document.getElementById("topRight").className = 'square red';
}

document.getElementsByClassName("square red")[0].onmouseover=swapColor;

resetColor= function(){
	document.getElementById("topLeft").className = 'square red';
	document.getElementById("topRight").className = 'square blue';
}

document.getElementsByClassName("square red")[0].onmouseleave=resetColor;

document.getElementsByClassName("square placeholder")[0].onmouseover = function() {
	document.getElementsByClassName("square green")[0].className = "square green moved";
}

document.getElementsByClassName("square placeholder")[0].onmouseleave = function() {
	document.getElementsByClassName("square green")[0].className = "square green";
}
