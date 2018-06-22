function Channel(name) {
  this.name = name;
  this.type = 'saved';

  this.compareTo = null;
  this.setting = null;

  this.setType = function(type) {
    this.type = type;
  };

  this.getType = function() {
    return this.type;
  };
}
