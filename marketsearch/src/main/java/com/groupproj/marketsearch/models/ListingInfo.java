
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
    "bestOfferEnabled",
    "buyItNowAvailable",
    "startTime",
    "endTime",
    "listingType",
    "gift",
    "watchCount"
})
@Generated("jsonschema2pojo")
public class ListingInfo {

    @JsonProperty("bestOfferEnabled")
    private List<String> bestOfferEnabled = null;
    @JsonProperty("buyItNowAvailable")
    private List<String> buyItNowAvailable = null;
    @JsonProperty("startTime")
    private List<String> startTime = null;
    @JsonProperty("endTime")
    private List<String> endTime = null;
    @JsonProperty("listingType")
    private List<String> listingType = null;
    @JsonProperty("gift")
    private List<String> gift = null;
    @JsonProperty("watchCount")
    private List<String> watchCount = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListingInfo() {
    }

    /**
     * 
     * @param gift
     * @param buyItNowAvailable
     * @param bestOfferEnabled
     * @param listingType
     * @param startTime
     * @param endTime
     * @param watchCount
     */
    public ListingInfo(List<String> bestOfferEnabled, List<String> buyItNowAvailable, List<String> startTime, List<String> endTime, List<String> listingType, List<String> gift, List<String> watchCount) {
        super();
        this.bestOfferEnabled = bestOfferEnabled;
        this.buyItNowAvailable = buyItNowAvailable;
        this.startTime = startTime;
        this.endTime = endTime;
        this.listingType = listingType;
        this.gift = gift;
        this.watchCount = watchCount;
    }

    @JsonProperty("bestOfferEnabled")
    public List<String> getBestOfferEnabled() {
        return bestOfferEnabled;
    }

    @JsonProperty("bestOfferEnabled")
    public void setBestOfferEnabled(List<String> bestOfferEnabled) {
        this.bestOfferEnabled = bestOfferEnabled;
    }

    public ListingInfo withBestOfferEnabled(List<String> bestOfferEnabled) {
        this.bestOfferEnabled = bestOfferEnabled;
        return this;
    }

    @JsonProperty("buyItNowAvailable")
    public List<String> getBuyItNowAvailable() {
        return buyItNowAvailable;
    }

    @JsonProperty("buyItNowAvailable")
    public void setBuyItNowAvailable(List<String> buyItNowAvailable) {
        this.buyItNowAvailable = buyItNowAvailable;
    }

    public ListingInfo withBuyItNowAvailable(List<String> buyItNowAvailable) {
        this.buyItNowAvailable = buyItNowAvailable;
        return this;
    }

    @JsonProperty("startTime")
    public List<String> getStartTime() {
        return startTime;
    }

    @JsonProperty("startTime")
    public void setStartTime(List<String> startTime) {
        this.startTime = startTime;
    }

    public ListingInfo withStartTime(List<String> startTime) {
        this.startTime = startTime;
        return this;
    }

    @JsonProperty("endTime")
    public List<String> getEndTime() {
        return endTime;
    }

    @JsonProperty("endTime")
    public void setEndTime(List<String> endTime) {
        this.endTime = endTime;
    }

    public ListingInfo withEndTime(List<String> endTime) {
        this.endTime = endTime;
        return this;
    }

    @JsonProperty("listingType")
    public List<String> getListingType() {
        return listingType;
    }

    @JsonProperty("listingType")
    public void setListingType(List<String> listingType) {
        this.listingType = listingType;
    }

    public ListingInfo withListingType(List<String> listingType) {
        this.listingType = listingType;
        return this;
    }

    @JsonProperty("gift")
    public List<String> getGift() {
        return gift;
    }

    @JsonProperty("gift")
    public void setGift(List<String> gift) {
        this.gift = gift;
    }

    public ListingInfo withGift(List<String> gift) {
        this.gift = gift;
        return this;
    }

    @JsonProperty("watchCount")
    public List<String> getWatchCount() {
        return watchCount;
    }

    @JsonProperty("watchCount")
    public void setWatchCount(List<String> watchCount) {
        this.watchCount = watchCount;
    }

    public ListingInfo withWatchCount(List<String> watchCount) {
        this.watchCount = watchCount;
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

    public ListingInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListingInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bestOfferEnabled");
        sb.append('=');
        sb.append(((this.bestOfferEnabled == null)?"<null>":this.bestOfferEnabled));
        sb.append(',');
        sb.append("buyItNowAvailable");
        sb.append('=');
        sb.append(((this.buyItNowAvailable == null)?"<null>":this.buyItNowAvailable));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("listingType");
        sb.append('=');
        sb.append(((this.listingType == null)?"<null>":this.listingType));
        sb.append(',');
        sb.append("gift");
        sb.append('=');
        sb.append(((this.gift == null)?"<null>":this.gift));
        sb.append(',');
        sb.append("watchCount");
        sb.append('=');
        sb.append(((this.watchCount == null)?"<null>":this.watchCount));
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
