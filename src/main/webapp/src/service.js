function ServiceImpl(xhr, theApp) {
  'use strict';
  var service = xhr;
  var app = theApp;

  this.navigateTo = function(channel) {
    // app.startActivity();
    app.$.xhr.url = 'http://localhost:3000/firewallchannel';
    app.$.xhr.params = {'channel': "BIA"};
    app.$.xhr.generateRequest();
  };
}
