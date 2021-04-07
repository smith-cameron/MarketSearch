
package com.groupproj.marketsearch.models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "@currencyId",
    "__value__"
})
@Generated("jsonschema2pojo")
public class ConvertedCurrentPrice {

    @JsonProperty("@currencyId")
    private String currencyId;
    @JsonProperty("__value__")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConvertedCurrentPrice() {
    }

    /**
     * 
     * @param currencyId
     * @param value
     */
    public ConvertedCurrentPrice(String currencyId, String value) {
        super();
        this.currencyId = currencyId;
        this.value = value;
    }

    @JsonProperty("@currencyId")
    public String getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("@currencyId")
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public ConvertedCurrentPrice withCurrencyId(String currencyId) {
        this.currencyId = currencyId;
        return this;
    }

    @JsonProperty("__value__")
    public String getValue() {
        return value;
    }

    @JsonProperty("__value__")
    public void setValue(String value) {
        this.value = value;
    }

    public ConvertedCurrentPrice withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ConvertedCurrentPrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConvertedCurrentPrice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currencyId");
        sb.append('=');
        sb.append(((this.currencyId == null)?"<null>":this.currencyId));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
