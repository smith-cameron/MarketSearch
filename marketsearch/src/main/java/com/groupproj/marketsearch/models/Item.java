
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
    "itemId",
    "title",
    "globalId",
    "primaryCategory",
    "galleryURL",
    "viewItemURL",
    "paymentMethod",
    "autoPay",
    "postalCode",
    "location",
    "country",
    "shippingInfo",
    "sellingStatus",
    "listingInfo",
    "returnsAccepted",
    "condition",
    "isMultiVariationListing",
    "topRatedListing"
})
@Generated("jsonschema2pojo")
public class Item {

    @JsonProperty("itemId")
    private List<String> itemId = null;
    @JsonProperty("title")
    private List<String> title = null;
    @JsonProperty("globalId")
    private List<String> globalId = null;
    @JsonProperty("primaryCategory")
    private List<PrimaryCategory> primaryCategory = null;
    @JsonProperty("galleryURL")
    private List<String> galleryURL = null;
    @JsonProperty("viewItemURL")
    private List<String> viewItemURL = null;
    @JsonProperty("paymentMethod")
    private List<String> paymentMethod = null;
    @JsonProperty("autoPay")
    private List<String> autoPay = null;
    @JsonProperty("postalCode")
    private List<String> postalCode = null;
    @JsonProperty("location")
    private List<String> location = null;
    @JsonProperty("country")
    private List<String> country = null;
    @JsonProperty("shippingInfo")
    private List<ShippingInfo> shippingInfo = null;
    @JsonProperty("sellingStatus")
    private List<Sellingstatus> sellingStatus = null;
    @JsonProperty("listingInfo")
    private List<ListingInfo> listingInfo = null;
    @JsonProperty("returnsAccepted")
    private List<String> returnsAccepted = null;
    @JsonProperty("condition")
    private List<Condition> condition = null;
    @JsonProperty("isMultiVariationListing")
    private List<String> isMultiVariationListing = null;
    @JsonProperty("topRatedListing")
    private List<String> topRatedListing = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param autoPay
     * @param listingInfo
     * @param country
     * @param viewItemURL
     * @param postalCode
     * @param shippingInfo
     * @param globalId
     * @param title
     * @param galleryURL
     * @param itemId
     * @param sellingStatus
     * @param condition
     * @param topRatedListing
     * @param primaryCategory
     * @param returnsAccepted
     * @param paymentMethod
     * @param location
     * @param isMultiVariationListing
     */
    public Item(List<String> itemId, List<String> title, List<String> globalId, List<PrimaryCategory> primaryCategory, List<String> galleryURL, List<String> viewItemURL, List<String> paymentMethod, List<String> autoPay, List<String> postalCode, List<String> location, List<String> country, List<ShippingInfo> shippingInfo, List<Sellingstatus> sellingStatus, List<ListingInfo> listingInfo, List<String> returnsAccepted, List<Condition> condition, List<String> isMultiVariationListing, List<String> topRatedListing) {
        super();
        this.itemId = itemId;
        this.title = title;
        this.globalId = globalId;
        this.primaryCategory = primaryCategory;
        this.galleryURL = galleryURL;
        this.viewItemURL = viewItemURL;
        this.paymentMethod = paymentMethod;
        this.autoPay = autoPay;
        this.postalCode = postalCode;
        this.location = location;
        this.country = country;
        this.shippingInfo = shippingInfo;
        this.sellingStatus = sellingStatus;
        this.listingInfo = listingInfo;
        this.returnsAccepted = returnsAccepted;
        this.condition = condition;
        this.isMultiVariationListing = isMultiVariationListing;
        this.topRatedListing = topRatedListing;
    }

    @JsonProperty("itemId")
    public List<String> getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(List<String> itemId) {
        this.itemId = itemId;
    }

    public Item withItemId(List<String> itemId) {
        this.itemId = itemId;
        return this;
    }

    @JsonProperty("title")
    public List<String> getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(List<String> title) {
        this.title = title;
    }

    public Item withTitle(List<String> title) {
        this.title = title;
        return this;
    }

    @JsonProperty("globalId")
    public List<String> getGlobalId() {
        return globalId;
    }

    @JsonProperty("globalId")
    public void setGlobalId(List<String> globalId) {
        this.globalId = globalId;
    }

    public Item withGlobalId(List<String> globalId) {
        this.globalId = globalId;
        return this;
    }

    @JsonProperty("primaryCategory")
    public List<PrimaryCategory> getPrimaryCategory() {
        return primaryCategory;
    }

    @JsonProperty("primaryCategory")
    public void setPrimaryCategory(List<PrimaryCategory> primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public Item withPrimaryCategory(List<PrimaryCategory> primaryCategory) {
        this.primaryCategory = primaryCategory;
        return this;
    }

    @JsonProperty("galleryURL")
    public List<String> getGalleryURL() {
        return galleryURL;
    }

    @JsonProperty("galleryURL")
    public void setGalleryURL(List<String> galleryURL) {
        this.galleryURL = galleryURL;
    }

    public Item withGalleryURL(List<String> galleryURL) {
        this.galleryURL = galleryURL;
        return this;
    }

    @JsonProperty("viewItemURL")
    public List<String> getViewItemURL() {
        return viewItemURL;
    }

    @JsonProperty("viewItemURL")
    public void setViewItemURL(List<String> viewItemURL) {
        this.viewItemURL = viewItemURL;
    }

    public Item withViewItemURL(List<String> viewItemURL) {
        this.viewItemURL = viewItemURL;
        return this;
    }

    @JsonProperty("paymentMethod")
    public List<String> getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public void setPaymentMethod(List<String> paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Item withPaymentMethod(List<String> paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @JsonProperty("autoPay")
    public List<String> getAutoPay() {
        return autoPay;
    }

    @JsonProperty("autoPay")
    public void setAutoPay(List<String> autoPay) {
        this.autoPay = autoPay;
    }

    public Item withAutoPay(List<String> autoPay) {
        this.autoPay = autoPay;
        return this;
    }

    @JsonProperty("postalCode")
    public List<String> getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(List<String> postalCode) {
        this.postalCode = postalCode;
    }

    public Item withPostalCode(List<String> postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonProperty("location")
    public List<String> getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(List<String> location) {
        this.location = location;
    }

    public Item withLocation(List<String> location) {
        this.location = location;
        return this;
    }

    @JsonProperty("country")
    public List<String> getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(List<String> country) {
        this.country = country;
    }

    public Item withCountry(List<String> country) {
        this.country = country;
        return this;
    }

    @JsonProperty("shippingInfo")
    public List<ShippingInfo> getShippingInfo() {
        return shippingInfo;
    }

    @JsonProperty("shippingInfo")
    public void setShippingInfo(List<ShippingInfo> shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public Item withShippingInfo(List<ShippingInfo> shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    @JsonProperty("sellingStatus")
    public List<Sellingstatus> getSellingStatus() {
        return sellingStatus;
    }

    @JsonProperty("sellingStatus")
    public void setSellingStatus(List<Sellingstatus> sellingStatus) {
        this.sellingStatus = sellingStatus;
    }

    public Item withSellingStatus(List<Sellingstatus> sellingStatus) {
        this.sellingStatus = sellingStatus;
        return this;
    }

    @JsonProperty("listingInfo")
    public List<ListingInfo> getListingInfo() {
        return listingInfo;
    }

    @JsonProperty("listingInfo")
    public void setListingInfo(List<ListingInfo> listingInfo) {
        this.listingInfo = listingInfo;
    }

    public Item withListingInfo(List<ListingInfo> listingInfo) {
        this.listingInfo = listingInfo;
        return this;
    }

    @JsonProperty("returnsAccepted")
    public List<String> getReturnsAccepted() {
        return returnsAccepted;
    }

    @JsonProperty("returnsAccepted")
    public void setReturnsAccepted(List<String> returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
    }

    public Item withReturnsAccepted(List<String> returnsAccepted) {
        this.returnsAccepted = returnsAccepted;
        return this;
    }

    @JsonProperty("condition")
    public List<Condition> getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(List<Condition> condition) {
        this.condition = condition;
    }

    public Item withCondition(List<Condition> condition) {
        this.condition = condition;
        return this;
    }

    @JsonProperty("isMultiVariationListing")
    public List<String> getIsMultiVariationListing() {
        return isMultiVariationListing;
    }

    @JsonProperty("isMultiVariationListing")
    public void setIsMultiVariationListing(List<String> isMultiVariationListing) {
        this.isMultiVariationListing = isMultiVariationListing;
    }

    public Item withIsMultiVariationListing(List<String> isMultiVariationListing) {
        this.isMultiVariationListing = isMultiVariationListing;
        return this;
    }

    @JsonProperty("topRatedListing")
    public List<String> getTopRatedListing() {
        return topRatedListing;
    }

    @JsonProperty("topRatedListing")
    public void setTopRatedListing(List<String> topRatedListing) {
        this.topRatedListing = topRatedListing;
    }

    public Item withTopRatedListing(List<String> topRatedListing) {
        this.topRatedListing = topRatedListing;
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

    public Item withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("itemId");
        sb.append('=');
        sb.append(((this.itemId == null)?"<null>":this.itemId));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("globalId");
        sb.append('=');
        sb.append(((this.globalId == null)?"<null>":this.globalId));
        sb.append(',');
        sb.append("primaryCategory");
        sb.append('=');
        sb.append(((this.primaryCategory == null)?"<null>":this.primaryCategory));
        sb.append(',');
        sb.append("galleryURL");
        sb.append('=');
        sb.append(((this.galleryURL == null)?"<null>":this.galleryURL));
        sb.append(',');
        sb.append("viewItemURL");
        sb.append('=');
        sb.append(((this.viewItemURL == null)?"<null>":this.viewItemURL));
        sb.append(',');
        sb.append("paymentMethod");
        sb.append('=');
        sb.append(((this.paymentMethod == null)?"<null>":this.paymentMethod));
        sb.append(',');
        sb.append("autoPay");
        sb.append('=');
        sb.append(((this.autoPay == null)?"<null>":this.autoPay));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("shippingInfo");
        sb.append('=');
        sb.append(((this.shippingInfo == null)?"<null>":this.shippingInfo));
        sb.append(',');
        sb.append("sellingStatus");
        sb.append('=');
        sb.append(((this.sellingStatus == null)?"<null>":this.sellingStatus));
        sb.append(',');
        sb.append("listingInfo");
        sb.append('=');
        sb.append(((this.listingInfo == null)?"<null>":this.listingInfo));
        sb.append(',');
        sb.append("returnsAccepted");
        sb.append('=');
        sb.append(((this.returnsAccepted == null)?"<null>":this.returnsAccepted));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("isMultiVariationListing");
        sb.append('=');
        sb.append(((this.isMultiVariationListing == null)?"<null>":this.isMultiVariationListing));
        sb.append(',');
        sb.append("topRatedListing");
        sb.append('=');
        sb.append(((this.topRatedListing == null)?"<null>":this.topRatedListing));
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
