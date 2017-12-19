$(document).ready(function() {

	var addComment = function() {

		var $card;
		var $cardBody;
		var $formCheck;
		var $formCheckLabel;

		if($("#comment").val() !== "") {

			$card = $("<div>").addClass("card bg-success text-white mt-3");
			$cardBody = $("<div>").addClass("card-body");
			$formCheck = $("<div>").addClass("form-check");
			$formCheckLabel = $("<label>").addClass("form-check-label");
			$($formCheckLabel).text($("#comment").val());

			$($formCheckLabel).append('<input type = "checkbox" class="form-check-input shift">');

			$($formCheck).append($formCheckLabel);
			$($cardBody).append($formCheck);
			$($card).append($cardBody);

			$(".todos").append($card);
			$("#comment").val("");
	
		} 

		
	};

		$("#btn").on("click", function(event) {
        	addComment();
    });
		$("#comment").on("keypress", function (event) {
        if (event.keyCode === 13) {
            addComment();
        }
    });
});