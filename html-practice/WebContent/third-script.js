buttons = document.getElementsByClassName("button");

onbuttonclick = function(event) {
	//event = arguments[0];
	console.log(event);
	source = event.srcElement;
	id = source.id;
	
	if (id == '01') {
		console.log('button 01 gets pressed.');
	} else if (id == '02') {
		alert('button 02 gets pressed');
	} else if (id == '03') {
		console.warn('button 3 gets pressed');
	} else {
		console.error('Something wrong happened.');
	}
}

for (var i = 0; i < buttons.length; i++) {
	buttons[i].onclick = onbuttonclick;
}