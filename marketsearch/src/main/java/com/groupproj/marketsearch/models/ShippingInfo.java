
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
    "shippingServiceCost",
    "shippingType",
    "shipToLocations",
    "expeditedShipping",
    "oneDayShippingAvailable",
    "handlingTime"
})
@Generated("jsonschema2pojo")
public class ShippingInfo {

    @JsonProperty("shippingServiceCost")
    private List<ShippingServiceCost> shippingServiceCost = null;
    @JsonProperty("shippingType")
    private List<String> shippingType = null;
    @JsonProperty("shipToLocations")
    private List<String> shipToLocations = null;
    @JsonProperty("expeditedShipping")
    private List<String> expeditedShipping = null;
    @JsonProperty("oneDayShippingAvailable")
    private List<String> oneDayShippingAvailable = null;
    @JsonProperty("handlingTime")
    private List<String> handlingTime = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShippingInfo() {
    }

    /**
     * 
     * @param handlingTime
     * @param oneDayShippingAvailable
     * @param shippingType
     * @param shippingServiceCost
     * @param shipToLocations
     * @param expeditedShipping
     */
    public ShippingInfo(List<ShippingServiceCost> shippingServiceCost, List<String> shippingType, List<String> shipToLocations, List<String> expeditedShipping, List<String> oneDayShippingAvailable, List<String> handlingTime) {
        super();
        this.shippingServiceCost = shippingServiceCost;
        this.shippingType = shippingType;
        this.shipToLocations = shipToLocations;
        this.expeditedShipping = expeditedShipping;
        this.oneDayShippingAvailable = oneDayShippingAvailable;
        this.handlingTime = handlingTime;
    }

    @JsonProperty("shippingServiceCost")
    public List<ShippingServiceCost> getShippingServiceCost() {
        return shippingServiceCost;
    }

    @JsonProperty("shippingServiceCost")
    public void setShippingServiceCost(List<ShippingServiceCost> shippingServiceCost) {
        this.shippingServiceCost = shippingServiceCost;
    }

    public ShippingInfo withShippingServiceCost(List<ShippingServiceCost> shippingServiceCost) {
        this.shippingServiceCost = shippingServiceCost;
        return this;
    }

    @JsonProperty("shippingType")
    public List<String> getShippingType() {
        return shippingType;
    }

    @JsonProperty("shippingType")
    public void setShippingType(List<String> shippingType) {
        this.shippingType = shippingType;
    }

    public ShippingInfo withShippingType(List<String> shippingType) {
        this.shippingType = shippingType;
        return this;
    }

    @JsonProperty("shipToLocations")
    public List<String> getShipToLocations() {
        return shipToLocations;
    }

    @JsonProperty("shipToLocations")
    public void setShipToLocations(List<String> shipToLocations) {
        this.shipToLocations = shipToLocations;
    }

    public ShippingInfo withShipToLocations(List<String> shipToLocations) {
        this.shipToLocations = shipToLocations;
        return this;
    }

    @JsonProperty("expeditedShipping")
    public List<String> getExpeditedShipping() {
        return expeditedShipping;
    }

    @JsonProperty("expeditedShipping")
    public void setExpeditedShipping(List<String> expeditedShipping) {
        this.expeditedShipping = expeditedShipping;
    }

    public ShippingInfo withExpeditedShipping(List<String> expeditedShipping) {
        this.expeditedShipping = expeditedShipping;
        return this;
    }

    @JsonProperty("oneDayShippingAvailable")
    public List<String> getOneDayShippingAvailable() {
        return oneDayShippingAvailable;
    }

    @JsonProperty("oneDayShippingAvailable")
    public void setOneDayShippingAvailable(List<String> oneDayShippingAvailable) {
        this.oneDayShippingAvailable = oneDayShippingAvailable;
    }

    public ShippingInfo withOneDayShippingAvailable(List<String> oneDayShippingAvailable) {
        this.oneDayShippingAvailable = oneDayShippingAvailable;
        return this;
    }

    @JsonProperty("handlingTime")
    public List<String> getHandlingTime() {
        return handlingTime;
    }

    @JsonProperty("handlingTime")
    public void setHandlingTime(List<String> handlingTime) {
        this.handlingTime = handlingTime;
    }

    public ShippingInfo withHandlingTime(List<String> handlingTime) {
        this.handlingTime = handlingTime;
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

    public ShippingInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShippingInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shippingServiceCost");
        sb.append('=');
        sb.append(((this.shippingServiceCost == null)?"<null>":this.shippingServiceCost));
        sb.append(',');
        sb.append("shippingType");
        sb.append('=');
        sb.append(((this.shippingType == null)?"<null>":this.shippingType));
        sb.append(',');
        sb.append("shipToLocations");
        sb.append('=');
        sb.append(((this.shipToLocations == null)?"<null>":this.shipToLocations));
        sb.append(',');
        sb.append("expeditedShipping");
        sb.append('=');
        sb.append(((this.expeditedShipping == null)?"<null>":this.expeditedShipping));
        sb.append(',');
        sb.append("oneDayShippingAvailable");
        sb.append('=');
        sb.append(((this.oneDayShippingAvailable == null)?"<null>":this.oneDayShippingAvailable));
        sb.append(',');
        sb.append("handlingTime");
        sb.append('=');
        sb.append(((this.handlingTime == null)?"<null>":this.handlingTime));
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
