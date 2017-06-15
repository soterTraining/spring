isHidden = false;

switchDiv = function() {
	myContentDiv = document.getElementsByClassName('content')[0];
	myDivsClass = 'content';
	if (!isHidden) {
		myDivsClass = 'content hidden';
	}
	myContentDiv.className = myDivsClass;
	isHidden = !isHidden;
}

document.getElementsByClassName("button")[0].onclick = switchDiv;