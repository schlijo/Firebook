/*global Channel */
function Firewallconfig(theService, theApp) {
  this.channels = [];
  this.displayOrder = [];
  this.service = theService;
  this.selectedChannel = null;
  var app = theApp;
  var self = this;
  this.setChannels = function(channelList) {
    // self.channels = channelList;
    channelList.forEach(function(item) {
      app.push('fireconfigs.channels', new Channel(item.name));
      // self.channels.push(new Channel(item.name));
    });
  };

  this.createChannel = function(name) {
    return new Channel(name);
  };
  // this.setChannelSettings = function(name, settings) {
  //   this.channels.forEach(function(item) {
  //     console.log(item + name + settings);
  //   });
  // };

  // this.setService = function(theService) {
  //   self.service = theService;
  // };

  this.indexOfChannel = function(channelName) {
    var foundIndex = -1;
    var found = self.channels.find(function(channel, index) {
      if (channel.name === channelName) {
        foundIndex = index;
      }
      return channel.name === channelName;
    });
    return foundIndex;
  };

  this.navigateTo = function(channelName) {
    if (self.channels.length > 0) {

      var foundChannel = self.getChannel(channelName);
      if (foundChannel.getType() === 'saved') {
        self.service.navigateTo(foundChannel, app);
      } else {
        if (foundChannel.getType() === 'new') {
          this.selectChannel(foundChannel);
        } else {
          var response = {
            channelSetting: foundChannel.settings,
            displayOrder: foundChannel.displayOrder
          };
          this.selectChannel(response);
        }

      }
    }
  };

  this.selectChannel = function(response) {
    if (response !== null && typeof response.channelSetting !== 'undefined') {
      var foundChannel = null;
      if (typeof response.name === 'undefined') {
        foundChannel = self.getChannel(response.channelSetting.name);
      } else {
        foundChannel = self.getChannel(response.name);
      }
      // var foundChannel = self.getChannel(response.channelSetting.name);
      // var foundChannel = self.getChannel(response.name);
      var compare = self.hasDifferentValues(foundChannel, response.channelSetting);

      // if (compare) {
      //   foundChannel.compareTo.channelSetting = response.channelSetting;
      // } else {
      foundChannel.settings = response.channelSetting;
      // }
      this.displayOrder = response.displayOrder;
      self.selectedChannel = foundChannel;
      if (typeof response.name === 'undefined') {
        self.showChannel(response.channelSetting.name, compare);
      } else {
        self.showChannel(response.name, compare);
      }

      // app.$.channelView.channelsettings = response;
      // app.route = 'channel';

    } else {

      self.showChannel(self.channels[app.$.mainmenu.selected].name, false);
    }
  };

  this.hasDifferentValues = function(found, ch2) {
    if (typeof found.compareTo !== 'undefined' && found.compareTo !== null) {
      return true;
    }
    var ch1 = found.settings;
    if (self.isValue(ch1) && self.isValue(ch2)) {
      return JSON.stringify(ch1) !== JSON.stringify(ch2);
    }
    return false;
  };

  this.isValue = function(value) {
    if (value === null || typeof value === 'undefined') {
      return false;
    }
    return true;
  };

  this.getSelectedSettings = function() {
    return {'channelSetting': self.selectedChannel.settings, 'displayOrder': self.displayOrder};
  };

  this.showChannel = function(channelName, compare) {
    var foundChannel = self.getChannel(channelName);
    if (foundChannel !== null && typeof foundChannel.settings !== 'undefined') {

      if (compare) {
        var viewObjectOrg = {
          'channelSetting': foundChannel.settings,
          'displayOrder': self.displayOrder
        };
        var viewObjectCompare = {
          'org': foundChannel.settings,
          'uploaded': foundChannel.compareTo,
          'displayOrder': self.displayOrder
        };
        // app.$.compareView.channelcomparesettings = viewObject;
        // app.route = 'compare';
        app.$.channelView.channelsettings = viewObjectOrg;
        app.$.channelView.comparetosettings = viewObjectCompare;
        app.route = 'channel';
      } else {
        var viewObject = {
          'channelSetting': foundChannel.settings,
          'displayOrder': self.displayOrder
        };
        app.$.channelView.channelsettings = viewObject;
        app.route = 'channel';
      }
    }
  };

  this.getChannel = function(channelName) {
    var found = self.channels.find(function(channel) {
      return channel.name === channelName;
    });
    if (self.isValue(found)) {
      return found;
    } else {
      var newChannel = new Channel(channelName);
      newChannel.setType('new');
      app.push('fireconfigs.channels', newChannel);
      // app.$.mainmenu.selected = self.channels.length - 1;
      return newChannel;
    }

  };

  this.getChannels = function() {
    return this.channels;
  };

  this.addNewChannel = function(channel) {
    // var newChannel = new Channel(channel.channelSetting.name);
    channel.setType('new');
    channel.displayOrder = self.displayOrder;
    app.push('fireconfigs.channels', channel);
    // app.$.mainmenu.select(self.channels.length - 1);
    // app.$.mainmenu.selected = self.channels.length - 1;
  };

}
