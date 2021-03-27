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
"AffiliateLink",
"CashbackLink",
"ParentLink",
"ParentAffiliateLink",
"ParentCashbackLink"
})
public class Links {

@JsonProperty("AffiliateLink")
private String affiliateLink;
@JsonProperty("CashbackLink")
private Object cashbackLink;
@JsonProperty("ParentLink")
private Object parentLink;
@JsonProperty("ParentAffiliateLink")
private Object parentAffiliateLink;
@JsonProperty("ParentCashbackLink")
private Object parentCashbackLink;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("AffiliateLink")
public String getAffiliateLink() {
return affiliateLink;
}

@JsonProperty("AffiliateLink")
public void setAffiliateLink(String affiliateLink) {
this.affiliateLink = affiliateLink;
}

@JsonProperty("CashbackLink")
public Object getCashbackLink() {
return cashbackLink;
}

@JsonProperty("CashbackLink")
public void setCashbackLink(Object cashbackLink) {
this.cashbackLink = cashbackLink;
}

@JsonProperty("ParentLink")
public Object getParentLink() {
return parentLink;
}

@JsonProperty("ParentLink")
public void setParentLink(Object parentLink) {
this.parentLink = parentLink;
}

@JsonProperty("ParentAffiliateLink")
public Object getParentAffiliateLink() {
return parentAffiliateLink;
}

@JsonProperty("ParentAffiliateLink")
public void setParentAffiliateLink(Object parentAffiliateLink) {
this.parentAffiliateLink = parentAffiliateLink;
}

@JsonProperty("ParentCashbackLink")
public Object getParentCashbackLink() {
return parentCashbackLink;
}

@JsonProperty("ParentCashbackLink")
public void setParentCashbackLink(Object parentCashbackLink) {
this.parentCashbackLink = parentCashbackLink;
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