
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
    "findItemsByKeywordsResponse"
})
@Generated("jsonschema2pojo")
public class EbayProduct {

    @JsonProperty("findItemsByKeywordsResponse")
    private List<FindItemsByKeywordsResponse> findItemsByKeywordsResponse = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EbayProduct() {
    }

    /**
     * 
     * @param findItemsByKeywordsResponse
     */
    public EbayProduct(List<FindItemsByKeywordsResponse> findItemsByKeywordsResponse) {
        super();
        this.findItemsByKeywordsResponse = findItemsByKeywordsResponse;
    }

    @JsonProperty("findItemsByKeywordsResponse")
    public List<FindItemsByKeywordsResponse> getFindItemsByKeywordsResponse() {
        return findItemsByKeywordsResponse;
    }

    @JsonProperty("findItemsByKeywordsResponse")
    public void setFindItemsByKeywordsResponse(List<FindItemsByKeywordsResponse> findItemsByKeywordsResponse) {
        this.findItemsByKeywordsResponse = findItemsByKeywordsResponse;
    }

    public EbayProduct withFindItemsByKeywordsResponse(List<FindItemsByKeywordsResponse> findItemsByKeywordsResponse) {
        this.findItemsByKeywordsResponse = findItemsByKeywordsResponse;
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

    public EbayProduct withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EbayProduct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("findItemsByKeywordsResponse");
        sb.append('=');
        sb.append(((this.findItemsByKeywordsResponse == null)?"<null>":this.findItemsByKeywordsResponse));
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
