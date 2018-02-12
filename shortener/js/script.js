$(document).ready(function() {
	const apiKey = 'AIzaSyDkYv6lazimCXbSal7wjK2gb8nyh3r3_X0';
	const url = 'https://www.googleapis.com/urlshortener/v1/url';
	const projection = "FULL";

	const $inputField = $('#input');
	const $expandButton = $('#expand');
	const $shortenButton = $('#shorten');
	const $responseField = $('#link-box');

	function expandUrl() {
		const urlToExpand = url + '?key=' + apiKey + '&shortUrl=' + $inputField.val();

		$.ajax({
			url: urlToExpand,
			dataType: 'json',
			type: 'GET',
			success(response) {
				$responseField.append('<p>Expanded Url: </p><p>' + response.longUrl + '</p>');
			},
			error(jqXHR, status, errorThrown) {

			}
		});
	}

	function shortenUrl() {
		const urlWithKey = url + '?key=' + apiKey;
		const urlToShorten = $inputField.val();
		const data = JSON.stringify({longUrl: urlToShorten});

		$.ajax({
			url: urlWithKey,
			type: 'POST',
			dataType: 'json',
			data: JSON.stringify({longUrl: urlToShorten}),
			contentType: 'application/json',
			success(response) {
				$responseField.append('<p>ShortenedUrl: </p><p>' + response.id + '</p>');
			},
			error(jqXHR, status, errorThrown) {

			}
		});
	}

	function expand() {
	  $responseField.empty();
	  expandUrl();
	  return false;
	}

	function shorten() {
	  $responseField.empty();
	  shortenUrl();
	  return false;
	}

	// Call functions on submit

	$expandButton.click(expand);
	$shortenButton.click(shorten);
});