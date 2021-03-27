package com.groupproj.marketsearch.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Type",
"Key",
"Value"
})
public class Attribute {

@JsonProperty("Type")
private Object type;
@JsonProperty("Key")
private String key;
@JsonProperty("Value")
private String value;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Type")
public Object getType() {
return type;
}

@JsonProperty("Type")
public void setType(Object type) {
this.type = type;
}

@JsonProperty("Key")
public String getKey() {
return key;
}

@JsonProperty("Key")
public void setKey(String key) {
this.key = key;
}

@JsonProperty("Value")
public String getValue() {
return value;
}

@JsonProperty("Value")
public void setValue(String value) {
this.value = value;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}
}
