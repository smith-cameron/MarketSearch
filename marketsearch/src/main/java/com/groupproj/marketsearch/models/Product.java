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
"ID",
"ASIN",
"Title",
"BasePrice",
"FormattedBasePrice",
"BestPrice",
"FormattedBestPrice",
"ProductCategories",
"Media",
"Attributes",
"Offers",
"Raw"
})
public class Product {

@JsonProperty("ID")
private Integer iD;
@JsonProperty("ASIN")
private String aSIN;
@JsonProperty("Title")
private String title;
@JsonProperty("BasePrice")
private Double basePrice;
@JsonProperty("FormattedBasePrice")
private String formattedBasePrice;
@JsonProperty("BestPrice")
private Double bestPrice;
@JsonProperty("FormattedBestPrice")
private String formattedBestPrice;
@JsonProperty("ProductCategories")
private List<ProductCategory> productCategories = null;
@JsonProperty("Media")
private Media media;
@JsonProperty("Attributes")
private List<Attribute> attributes = null;
@JsonProperty("Offers")
private List<Offer> offers = null;
@JsonProperty("Raw")
private Object raw;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ID")
public Integer getID() {
return iD;
}

@JsonProperty("ID")
public void setID(Integer iD) {
this.iD = iD;
}

@JsonProperty("ASIN")
public String getASIN() {
return aSIN;
}

@JsonProperty("ASIN")
public void setASIN(String aSIN) {
this.aSIN = aSIN;
}

@JsonProperty("Title")
public String getTitle() {
return title;
}

@JsonProperty("Title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("BasePrice")
public Double getBasePrice() {
return basePrice;
}

@JsonProperty("BasePrice")
public void setBasePrice(Double basePrice) {
this.basePrice = basePrice;
}

@JsonProperty("FormattedBasePrice")
public String getFormattedBasePrice() {
return formattedBasePrice;
}

@JsonProperty("FormattedBasePrice")
public void setFormattedBasePrice(String formattedBasePrice) {
this.formattedBasePrice = formattedBasePrice;
}

@JsonProperty("BestPrice")
public Double getBestPrice() {
return bestPrice;
}

@JsonProperty("BestPrice")
public void setBestPrice(Double bestPrice) {
this.bestPrice = bestPrice;
}

@JsonProperty("FormattedBestPrice")
public String getFormattedBestPrice() {
return formattedBestPrice;
}

@JsonProperty("FormattedBestPrice")
public void setFormattedBestPrice(String formattedBestPrice) {
this.formattedBestPrice = formattedBestPrice;
}

@JsonProperty("ProductCategories")
public List<ProductCategory> getProductCategories() {
return productCategories;
}

@JsonProperty("ProductCategories")
public void setProductCategories(List<ProductCategory> productCategories) {
this.productCategories = productCategories;
}

@JsonProperty("Media")
public Media getMedia() {
return media;
}

@JsonProperty("Media")
public void setMedia(Media media) {
this.media = media;
}

@JsonProperty("Attributes")
public List<Attribute> getAttributes() {
return attributes;
}

@JsonProperty("Attributes")
public void setAttributes(List<Attribute> attributes) {
this.attributes = attributes;
}

@JsonProperty("Offers")
public List<Offer> getOffers() {
return offers;
}

@JsonProperty("Offers")
public void setOffers(List<Offer> offers) {
this.offers = offers;
}

@JsonProperty("Raw")
public Object getRaw() {
return raw;
}

@JsonProperty("Raw")
public void setRaw(Object raw) {
this.raw = raw;
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
