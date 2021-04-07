
package com.groupproj.marketsearch.models;

import java.util.HashMap;
import java.util.List;
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
    "currentPrice",
    "convertedCurrentPrice",
    "sellingState",
    "timeLeft"
})
@Generated("jsonschema2pojo")
public class Sellingstatus {

    @JsonProperty("currentPrice")
    private List<CurrentPrice> currentPrice = null;
    @JsonProperty("convertedCurrentPrice")
    private List<ConvertedCurrentPrice> convertedCurrentPrice = null;
    @JsonProperty("sellingState")
    private List<String> sellingState = null;
    @JsonProperty("timeLeft")
    private List<String> timeLeft = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sellingstatus() {
    }

    /**
     * 
     * @param convertedCurrentPrice
     * @param sellingState
     * @param currentPrice
     * @param timeLeft
     */
    public Sellingstatus(List<CurrentPrice> currentPrice, List<ConvertedCurrentPrice> convertedCurrentPrice, List<String> sellingState, List<String> timeLeft) {
        super();
        this.currentPrice = currentPrice;
        this.convertedCurrentPrice = convertedCurrentPrice;
        this.sellingState = sellingState;
        this.timeLeft = timeLeft;
    }

    @JsonProperty("currentPrice")
    public List<CurrentPrice> getCurrentPrice() {
        return currentPrice;
    }

    @JsonProperty("currentPrice")
    public void setCurrentPrice(List<CurrentPrice> currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Sellingstatus withCurrentPrice(List<CurrentPrice> currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    @JsonProperty("convertedCurrentPrice")
    public List<ConvertedCurrentPrice> getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    @JsonProperty("convertedCurrentPrice")
    public void setConvertedCurrentPrice(List<ConvertedCurrentPrice> convertedCurrentPrice) {
        this.convertedCurrentPrice = convertedCurrentPrice;
    }

    public Sellingstatus withConvertedCurrentPrice(List<ConvertedCurrentPrice> convertedCurrentPrice) {
        this.convertedCurrentPrice = convertedCurrentPrice;
        return this;
    }

    @JsonProperty("sellingState")
    public List<String> getSellingState() {
        return sellingState;
    }

    @JsonProperty("sellingState")
    public void setSellingState(List<String> sellingState) {
        this.sellingState = sellingState;
    }

    public Sellingstatus withSellingState(List<String> sellingState) {
        this.sellingState = sellingState;
        return this;
    }

    @JsonProperty("timeLeft")
    public List<String> getTimeLeft() {
        return timeLeft;
    }

    @JsonProperty("timeLeft")
    public void setTimeLeft(List<String> timeLeft) {
        this.timeLeft = timeLeft;
    }

    public Sellingstatus withTimeLeft(List<String> timeLeft) {
        this.timeLeft = timeLeft;
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

    public Sellingstatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sellingstatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currentPrice");
        sb.append('=');
        sb.append(((this.currentPrice == null)?"<null>":this.currentPrice));
        sb.append(',');
        sb.append("convertedCurrentPrice");
        sb.append('=');
        sb.append(((this.convertedCurrentPrice == null)?"<null>":this.convertedCurrentPrice));
        sb.append(',');
        sb.append("sellingState");
        sb.append('=');
        sb.append(((this.sellingState == null)?"<null>":this.sellingState));
        sb.append(',');
        sb.append("timeLeft");
        sb.append('=');
        sb.append(((this.timeLeft == null)?"<null>":this.timeLeft));
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
