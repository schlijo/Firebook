package ch.basler.fire.dom;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestHeaderAction {
  private String name;
  private String value;
  private String actionType;
  private RequestHeaderName requestHeaderName;
  private RequestHeaderValue requestHeaderValue;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public RequestHeaderName getRequestHeaderName() {
    return requestHeaderName;
  }

  public void setRequestHeaderName(RequestHeaderName requestHeaderName) {
    this.requestHeaderName = requestHeaderName;
  }

  public RequestHeaderValue getRequestHeaderValue() {
    return requestHeaderValue;
  }

  public void setRequestHeaderValue(RequestHeaderValue requestHeaderValue) {
    this.requestHeaderValue = requestHeaderValue;
  }
}
