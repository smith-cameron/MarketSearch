package com.groupproj.marketsearch.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"XImage",
"OriginalWidth",
"OriginalHeight",
"AverageColor",
"DominantColor",
"ImageAlternatives"
})
public class Media {

@JsonProperty("XImage")
private String xImage;
@JsonProperty("OriginalWidth")
private Integer originalWidth;
@JsonProperty("OriginalHeight")
private Integer originalHeight;
@JsonProperty("AverageColor")
private String averageColor;
@JsonProperty("DominantColor")
private String dominantColor;
@JsonProperty("ImageAlternatives")
private List<String> imageAlternatives = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("XImage")
public String getXImage() {
return xImage;
}

@JsonProperty("XImage")
public void setXImage(String xImage) {
this.xImage = xImage;
}

@JsonProperty("OriginalWidth")
public Integer getOriginalWidth() {
return originalWidth;
}

@JsonProperty("OriginalWidth")
public void setOriginalWidth(Integer originalWidth) {
this.originalWidth = originalWidth;
}

@JsonProperty("OriginalHeight")
public Integer getOriginalHeight() {
return originalHeight;
}

@JsonProperty("OriginalHeight")
public void setOriginalHeight(Integer originalHeight) {
this.originalHeight = originalHeight;
}

@JsonProperty("AverageColor")
public String getAverageColor() {
return averageColor;
}

@JsonProperty("AverageColor")
public void setAverageColor(String averageColor) {
this.averageColor = averageColor;
}

@JsonProperty("DominantColor")
public String getDominantColor() {
return dominantColor;
}

@JsonProperty("DominantColor")
public void setDominantColor(String dominantColor) {
this.dominantColor = dominantColor;
}

@JsonProperty("ImageAlternatives")
public List<String> getImageAlternatives() {
return imageAlternatives;
}

@JsonProperty("ImageAlternatives")
public void setImageAlternatives(List<String> imageAlternatives) {
this.imageAlternatives = imageAlternatives;
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
