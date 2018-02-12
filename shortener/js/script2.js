$(document).ready(function() { 
// Include data for accessing Google APIs

const apiKey = 'AIzaSyDkYv6lazimCXbSal7wjK2gb8nyh3r3_X0';
const url = 'https://www.googleapis.com/urlshortener/v1/url';
const projection = 'FULL';

// Some page elements

const $inputField = $('#input');
const $expandButton = $('#expand');
const $shortenButton = $('#shorten');
const $responseField = $('#link-box');

// AJAX functions

function expandUrl() {
const urlToExpand = url + '?key=' + apiKey + '&shortUrl=' + $inputField.val();
 $.ajax({
   url: urlToExpand,
   type: 'GET',
   dataType: 'json',
   success(response) {
     $responseField.append('<p>Your expanded url is: </p><p>' + response.longUrl + '</p>');
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
    data: JSON.stringify({longUrl: urlToShorten}),
    dataType: 'json',
    contentType: 'application/json',
    success(response) {
      $responseField.append('<p>Your shortened url is: </p><p>' + response.id + '</p>');
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