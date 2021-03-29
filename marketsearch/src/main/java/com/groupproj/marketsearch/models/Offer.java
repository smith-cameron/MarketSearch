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
"ID",
"Merchant",
"ProductID",
"Quality",
"Venue",
"Price",
"FormattedPrice",
"Link",
"Links",
"InStockStatus",
"BasePrice",
"FormattedBasePrice"
})
public class Offer {

@JsonProperty("ID")
private Object iD;
@JsonProperty("Merchant")
private String merchant;
@JsonProperty("ProductID")
private String productID;
@JsonProperty("Quality")
private String quality;
@JsonProperty("Venue")
private String venue;
@JsonProperty("Price")
private Double price;
@JsonProperty("FormattedPrice")
private String formattedPrice;
@JsonProperty("Link")
private String link;
@JsonProperty("Links")
private Links links;
@JsonProperty("InStockStatus")
private String inStockStatus;
@JsonProperty("BasePrice")
private Integer basePrice;
@JsonProperty("FormattedBasePrice")
private String formattedBasePrice;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("ID")
public Object getID() {
return iD;
}

@JsonProperty("ID")
public void setID(Object iD) {
this.iD = iD;
}

@JsonProperty("Merchant")
public String getMerchant() {
return merchant;
}

@JsonProperty("Merchant")
public void setMerchant(String merchant) {
this.merchant = merchant;
}

@JsonProperty("ProductID")
public String getProductID() {
return productID;
}

@JsonProperty("ProductID")
public void setProductID(String productID) {
this.productID = productID;
}

@JsonProperty("Quality")
public String getQuality() {
return quality;
}

@JsonProperty("Quality")
public void setQuality(String quality) {
this.quality = quality;
}

@JsonProperty("Venue")
public String getVenue() {
return venue;
}

@JsonProperty("Venue")
public void setVenue(String venue) {
this.venue = venue;
}

@JsonProperty("Price")
public Double getPrice() {
return price;
}

@JsonProperty("Price")
public void setPrice(Double price) {
this.price = price;
}

@JsonProperty("FormattedPrice")
public String getFormattedPrice() {
return formattedPrice;
}

@JsonProperty("FormattedPrice")
public void setFormattedPrice(String formattedPrice) {
this.formattedPrice = formattedPrice;
}

@JsonProperty("Link")
public String getLink() {
return link;
}

@JsonProperty("Link")
public void setLink(String link) {
this.link = link;
}

@JsonProperty("Links")
public Links getLinks() {
return links;
}

@JsonProperty("Links")
public void setLinks(Links links) {
this.links = links;
}

@JsonProperty("InStockStatus")
public String getInStockStatus() {
return inStockStatus;
}

@JsonProperty("InStockStatus")
public void setInStockStatus(String inStockStatus) {
this.inStockStatus = inStockStatus;
}

@JsonProperty("BasePrice")
public Integer getBasePrice() {
return basePrice;
}

@JsonProperty("BasePrice")
public void setBasePrice(Integer basePrice) {
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
