/* Load the PolymerElement base class and html helper function */
import {PolymerElement, html} from '@polymer/polymer/polymer-element.js';

/* Load shared styles. All view elements use these styles */
import './shared-styles.js';

/* Extend the base PolymerElement class */
class FirewallValue extends PolymerElement {
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
      
      <template is="dom-if" if="{{item.isValue}}">
        <paper-input class$="{{item.styleclass}}" label="{{localize(item.name)}}" id="mu{{item.name}}" value="{{item.value::input}}"
        readonly always-float-label on-change="onchangeValue" ></paper-input>
        <paper-tooltip>Text Input({{item.name}})</paper-tooltip>
      </template>

      <!--<template is="dom-if" if="{{!item.isValue}}">-->
        <!--<paper-card heading="{{localize(item.name)}}" style="width:100%">-->

          <!--<div class="card-content" style="padding:6px;">-->
            <!--&lt;!&ndash;<div><b>{{item.name}}:</b></div>&ndash;&gt;-->
            <!--<template is="dom-if" if="{{item.isArray}}">-->
              <!--<div role="listbox">-->
                <!--<template id="repeater2" is="dom-repeat" items="{{item.value}}" as="textarea">-->
                  <!--<template is="dom-if" if="{{item.isValueArray}}">-->
                    <!--<table width="100%">-->
                      <!--<tr>-->
                        <!--<template id="repeater3" is="dom-repeat" items="{{textarea.value}}" as="areas">-->
                          <!--<td width="50%" valign="bottom">-->
                            <!--<paper-textarea class$="{{styleclass}}" label="{{localize(textarea.name, 'dir', index)}}" value="{{areas}}" on-change="onchangeValueArrayValue" readonly></paper-textarea>-->
                            <!--<paper-tooltip>Textarea Value Array({{textarea.name}})</paper-tooltip>-->
                          <!--</td>-->
                        <!--</template>-->
                      <!--</tr>-->
                    <!--</table>-->


                  <!--</template>-->
                  <!--<template is="dom-if" if="{{!item.isValueArray}}">-->
                    <!--<paper-textarea class$="{{styleclass}}" label="{{localize(textarea.name)}}" value="{{textarea.value}}" on-change="onchangeArrayValue" readonly></paper-textarea>-->
                    <!--<paper-tooltip>Textarea Not Value Array({{textarea.name}})</paper-tooltip>-->
                  <!--</template>-->

                  <!--&lt;!&ndash;<paper-input value="{{item.value}}" label="{{item.name}}"></paper-input>&ndash;&gt;-->

                <!--</template>-->
              <!--</div>-->
            <!--</template>-->

            <!--<template is="dom-if" if="{{!item.isArray}}">-->
              <!--<paper-input class$="{{item.value.styleclass}}" value="{{item.value.value}}" label="{{localize(item.name)}}" on-change="onchangeValue" readonly></paper-input>-->
              <!--<paper-tooltip>Textinput Card({{item.name}})</paper-tooltip>-->
            <!--</template>-->
          <!--</div>-->
        <!--</paper-card>-->
        <!--<paper-tooltip >{{item.name}}</paper-tooltip><br/><br/>-->
      <!--</template>-->
      
      </div>
    `;
    }

    ready() {
        super.ready();


    }
}

/* Register the new element with the browser */
window.customElements.define('firewall-value', FirewallValue);
