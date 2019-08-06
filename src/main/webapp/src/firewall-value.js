/* Load the PolymerElement base class and html helper function */
import {PolymerElement, html} from '@polymer/polymer/polymer-element.js';
import {mixinBehaviors} from '@polymer/polymer/lib/legacy/class.js';
import {AppLocalizeBehavior} from '@polymer/app-localize-behavior/app-localize-behavior.js';

/* Load shared styles. All view elements use these styles */
import './shared-styles.js';

/* Extend the base PolymerElement class */
class FirewallValue extends mixinBehaviors([AppLocalizeBehavior], PolymerElement) {
    /* Define a template for the new element */
    static get template() {
        return html`
      
      <style include="shared-styles">
        :host {
          display: block;

          padding: 10px;
        }
      </style>

      <div>
      dgdsgsd
      <template is="dom-if" if="{{item.isValue}}">
        <paper-input class$="{{item.styleclass}}" label="{{localize(item.name)}}" id="mu{{item.name}}" value="{{item.value::input}}"
        readonly always-float-label on-change="onchangeValue" ></paper-input>
        <paper-tooltip>Text Input({{item.name}})</paper-tooltip>
      </template>

      <template is="dom-if" if="{{!item.isValue}}">
        <paper-card heading="{{localize(item.name)}}" style="width:100%">

          <div class="card-content" style="padding:6px;">
            <!--<div><b>{{item.name}}:</b></div>-->
            <template is="dom-if" if="{{item.isArray}}">
              <div role="listbox">
                <template id="repeater2" is="dom-repeat" items="{{item.value}}" as="textarea">
                  <template is="dom-if" if="{{item.isValueArray}}">
                    <table width="100%">
                      <tr>
                        <template id="repeater3" is="dom-repeat" items="{{textarea.value}}" as="areas">
                          <td width="50%" valign="bottom">
                            <paper-textarea class$="{{styleclass}}" label="{{localize(textarea.name, 'dir', index)}}" value="{{areas}}" on-change="onchangeValueArrayValue" readonly></paper-textarea>
                            <paper-tooltip>Textarea Value Array({{textarea.name}})</paper-tooltip>
                          </td>
                        </template>
                      </tr>
                    </table>


                  </template>
                  <template is="dom-if" if="{{!item.isValueArray}}">
                    <paper-textarea class$="{{styleclass}}" label="{{localize(textarea.name)}}" value="{{textarea.value}}" on-change="onchangeArrayValue" readonly></paper-textarea>
                    <paper-tooltip>Textarea Not Value Array({{textarea.name}})</paper-tooltip>
                  </template>

                  <!--<paper-input value="{{item.value}}" label="{{item.name}}"></paper-input>-->

                </template>
              </div>
            </template>

            <template is="dom-if" if="{{!item.isArray}}">
              <paper-input class$="{{item.value.styleclass}}" value="{{item.value.value}}" label="{{localize(item.name)}}" on-change="onchangeValue" readonly></paper-input>
              <paper-tooltip>Textinput Card({{item.name}})</paper-tooltip>
            </template>
          </div>
        </paper-card>
        <paper-tooltip >{{item.name}}</paper-tooltip><br/><br/>
      </template>
      
      </div>
    `;
    }


    static get properties() {
        return {


            channeldata: {
                type: String,
                observer: '_showSettings'
            },
            mutable: {

                observer: '_editMode'
            },

            language: {
                value: 'de',
                type: String
            },

            localesjson: {

                observer: '_attached'
                // value: 'locales.json'
            }

            // readonlyflag: String,
            // channelsettings: {
            //     type: String,
            //     observer: '_showSettings'
            // },
            // comparetosettings: Object,
            // localesjson: Object,
            // language: Object
        };
    }

    /*
    channelsettings: {

            notify: true,
            observer: '_showSettings'
          },
     */

    /*
     properties: {

          channeldata: {
            notify: true,
            observer: '_showSettings'
          },
          mutable: {
            notify: true,
            observer: '_editMode'
          },

          language: {
            value: 'de',
            type: String
          },

          localesjson: {
            notify: true,
            observer: '_attached'
            // value: 'locales.json'
          }
        },
     */

    ready() {
        super.ready();


    }

    attached() {
        this.loadResources(this.resolveUrl(this.localesjson));

    }

    _attached() {
        this.loadResources(this.resolveUrl(this.localesjson));
    }

    _editMode(editMode) {
        this._setReadOnly(!editMode, false);
    }

    enableEdit() {
        var inputElement = this.$$('#muname');
        if (inputElement !== null) {
            inputElement.readonly = false;
        }
    }

    _setReadOnly(readonly, newMode) {
        Polymer.dom(this.root).querySelectorAll('paper-input').forEach(function(paperInput) {
            if (newMode) {
                paperInput.readonly = readonly;
            } else {

                if (paperInput.id === 'muname' || paperInput.id === 'mulatestCommitDate') {
                    paperInput.readonly = true;
                } else {
                    paperInput.readonly = readonly;
                }
            }
        });

        Polymer.dom(this.root).querySelectorAll('paper-textarea').forEach(function(paperInput) {
            if (newMode) {
                paperInput.readonly = readonly;
            } else {

                if (paperInput.id === 'muname' || paperInput.id === 'mulatestCommitDate') {
                    paperInput.readonly = true;
                } else {
                    paperInput.readonly = readonly;
                }
            }
        });
    }

    _showSettings(channel) {

        if (channel !== null && typeof channel !== 'undefined') {
            if (channel.orgValue !== null && typeof channel.orgValue !== 'undefined') {
                this._highligtValue(channel.orgValue, channel);

                // if (this.tog) {
                //   this.styleclass = 'different-class';
                // } else {
                //   this.styleclass = '';
                // }

                // if (this._highligtValue(channel.orgValue, channel)) {
                //   console.log('jjjjjjjjjjjjjj');
                //   this.styleclass = 'different-class';
                // } else {
                //   this.styleclass = '';
                // }

            }
            this.item = channel;
        }
    }

    _getRow() {

    }

    onchangeValueArrayValue(event) {
        var row = this._getRow(event.model);
        var col = event.model.index;

    }

    onchangeArrayValue() {

    }

    onchangeValue(event) {
        this._toggleClass(this._markDifferent(this.item.orgValue, this.item), event.currentTarget);
    }

    _toggleClass(on, target) {
        if (target !== null) {
            this.toggleClass('different-class', on, target);
        }
        this.updateStyles();
    }

    _markDifferent(orgValue, newValue) {
        if (orgValue.isValue) {
            if (this._getObjectStringValue(orgValue) !== this._getObjectStringValue(newValue)) {
                newValue.styleclass = 'different-class';
                return true;
            } else {
                // newValue.styleclass = 'different-class1';
                // newValue.styleclass = 'different-class';
                return false;
            }
        } else {
            if (orgValue.isArray) {
                if (orgValue.value[0].value.toString() !== newValue.value[0].value.toString()) {

                }
            } else {

                if (this._getObjectStringValue(orgValue.value) !==
                    this._getObjectStringValue(newValue.value)) {
                    newValue.value.styleclass = 'different-class';
                    return true;
                } else {
                    // newValue.value.styleclass = 'different-class';
                    // newValue.value.styleclass = 'different-class1';
                    return false;
                }
            }

        }
    }

    _getObjectStringValue(obj) {
        if (obj === null || typeof obj === 'undefined') {
            return '';
        } else {
            if (obj.value === null || typeof obj.value === 'undefined') {
                return '';
            } else {
                return obj.value.toString();
            }
        }
    }

    _highligtValue(orgValue, newValue) {
        this._toggleClass(this._markDifferent(orgValue, newValue), this.$$('#mu' + newValue.name));

    }
















}

/* Register the new element with the browser */
window.customElements.define('firewall-value', FirewallValue);
