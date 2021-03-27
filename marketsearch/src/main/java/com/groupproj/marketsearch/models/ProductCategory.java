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
"Source",
"Name",
"FullName"
})
public class ProductCategory {

@JsonProperty("Source")
private String source;
@JsonProperty("Name")
private String name;
@JsonProperty("FullName")
private String fullName;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("Source")
public String getSource() {
return source;
}

@JsonProperty("Source")
public void setSource(String source) {
this.source = source;
}

@JsonProperty("Name")
public String getName() {
return name;
}

@JsonProperty("Name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("FullName")
public String getFullName() {
return fullName;
}

@JsonProperty("FullName")
public void setFullName(String fullName) {
this.fullName = fullName;
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
