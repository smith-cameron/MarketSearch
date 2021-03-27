const settings = {
	"async": true,
	"crossDomain": true,
	"url": "https://ebay-com.p.rapidapi.com/products/647865100010",
	"method": "GET",
	"headers": {
		"x-rapidapi-key": "5f6d2d6ce7msh94ea67f8eb9f318p1f2ddbjsnb92025009f9f",
		"x-rapidapi-host": "ebay-com.p.rapidapi.com"
	}
};

$.ajax(settings).done(function (response) {
	console.log(response);
});