/* Load the PolymerElement base class and html helper function */
import { PolymerElement, html } from '@polymer/polymer/polymer-element.js';
import '@polymer/paper-icon-button/paper-icon-button.js'
import 'firewall-env.js'
/* Load shared styles. All view elements use these styles */
import './shared-styles.js';

/* Extend the base PolymerElement class */
class ChannelView extends PolymerElement {
    /* Define a template for the new element */
    static get template() {
        return html`
      
      <style include="shared-styles">
        :host {
          display: block;

          padding: 10px;
        }
      </style>

      <div class="card">
      
          <table width="100%">
            <tr>
              <td>
                
                <h1 style="display: inline-block">Test {{selectedFirechannelsettings.channelSetting.name}}</h1>
              </td>
              <td align="right">

                <paper-icon-button hidden$="{{mutationMode}}" icon="add-circle" id="newButton" onclick="app.newConfig()" style="color:red"></paper-icon-button>
                <paper-icon-button hidden$="{{mutationMode}}" icon="create" id="editButton" onclick="app.editConfig()" style="color:red"></paper-icon-button>
                <paper-icon-button hidden$="{{mutationMode}}" icon="cloud-download" id="downloadButton" onclick="app.download()" style="color:red"></paper-icon-button>
              </td>
            </tr>


          </table>
          <firewall-env language="de" id="channelView" localesjson="/FirebookClient/rest/locales"></firewall-env>


      </div>
    `;
    }

    static get properties() {
        return {


            channelsettings: {
                type: String,
                observer: '_showSettings'
            }
        };
    }

    _showSettings(channel) {
        this.$.channelView.channelsettings = channel;
    }


}
/* Register the new element with the browser */
window.customElements.define('channel-view', ChannelView);
