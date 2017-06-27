/**
 * Responsible to format all value to HUF format with currency class
 */

(function() {
	var elements = document.getElementsByClassName('currency');
	
	for (var i = 0; i < elements.length; i++) {
		var formatted = Number(elements[i].innerHTML).toLocaleString('hu');
		formatted += " Ft";
		
		elements[i].innerHTML = formatted;
	}
})();