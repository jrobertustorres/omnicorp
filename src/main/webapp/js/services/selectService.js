angular.module('omnicontrol').service('Select', function($http){
	var self = this;
	self.getOptions = getOptions;

	function getOptions(url) {
		return	$http.get(url, {cache: true});
	}
});
