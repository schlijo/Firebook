/* Load the PolymerElement base class and html helper function */
import {PolymerElement, html} from '@polymer/polymer/polymer-element.js';
import "firewall-value.js";
/* Load shared styles. All view elements use these styles */
import './shared-styles.js';

/* Extend the base PolymerElement class */
class FirewallEnv extends PolymerElement {
    /* Define a template for the new element */
    static get template() {
        return html`
      
      <style include="shared-styles">
        :host {
          display: block;

          padding: 10px;
        }
      </style>

      <div >
      
      
        <table width="100%">
            <tr>
                <td colspan="2">
                    <paper-textarea id="freetext" label="Informationen"></paper-textarea>
                </td>
            </tr>
            <tr>
                <td>ttttt</td>
            </tr>
            <template id="repeater" is="dom-repeat">
            <tr>
                
                <td>
                ff
                    <firewall-value language="{{language}}" localesjson="{{localesjson}}" id="mu{{item.name}}" channeldata="{{item}}"></firewall-value>
                </td>
                <td hidden$="{{!compareMode}}">
                    <firewall-value language="{{language}}" localesjson="{{localesjson}}" id="ro{{item.name}}" mutable$="{{mutationMode}}" channeldata="{{item.compareTo}}"></firewall-value>
                </td>
            </tr>
      

            </template>
        </table>

      </div>
    `;
    }

    static get properties() {
        return {

            readonlyflag: String,
            channelsettings: {
                type: String,
                observer: '_showSettings'
            },
            comparetosettings: Object,
            localesjson: Object,
            language: Object
        };
    }

    ready() {
        super.ready();
        this.$.repeater.items = [{"name": "mysuper dude", "value": "test"}];

    }

    _showSettings(channel) {
        this.gitChannels = channel;
        this.editedChannels = null;
        this.newChannels = null;
        this.$.freetext.value = '';

        // this.settingFields = fields;

        this._showFields(this._getFields(channel), this._isReadOnly(), true);

    }

    _showFields(fields, readonly, newMode) {
        this.compareMode = false;
        this.mutationMode = false;
        this.$.repeater.items = [];
        this.$.repeater.render();
        this.$.repeater.items = fields;
        this.$.repeater.render();
    }

    _getFields(channel) {
        var fields = [];
        if (typeof channel !== 'undefined') {
            for (var i = 0; i < channel.displayOrder.length; i++) {

                var isArray = Array.isArray(channel.channelSetting[channel.displayOrder[i]]);
                var isValueArray = false;
                if (isArray) {
                    if (channel.channelSetting[channel.displayOrder[i]].length > 0) {
                        var val = channel.channelSetting[channel.displayOrder[i]][0];
                        isValueArray = Array.isArray(val.value);
                    }
                } else {
                    if (typeof channel.channelSetting[channel.displayOrder[i]] !== 'undefined') {
                        isValueArray = Array.isArray(channel.channelSetting[channel.displayOrder[i]].value);
                    }
                }

                fields.push({
                    name: channel.displayOrder[i],
                    value: channel.channelSetting[channel.displayOrder[i]],
                    isValue: typeof channel.channelSetting[channel.displayOrder[i]] !== 'object',
                    isArray: isArray,
                    isValueArray: isValueArray
                });

            }
        }
        return fields;
    }

    _isReadOnly() {
        return this.readonlyflag === 'true';
    }
}

/* Register the new element with the browser */
window.customElements.define('firewall-env', FirewallEnv);
