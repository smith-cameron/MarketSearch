
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
    "ack",
    "version",
    "timestamp",
    "searchResult",
    "paginationOutput",
    "itemSearchURL"
})
@Generated("jsonschema2pojo")
public class FindItemsByKeywordsResponse {

    @JsonProperty("ack")
    private List<String> ack = null;
    @JsonProperty("version")
    private List<String> version = null;
    @JsonProperty("timestamp")
    private List<String> timestamp = null;
    @JsonProperty("searchResult")
    private List<SearchResult> searchResult = null;
    @JsonProperty("paginationOutput")
    private List<PaginationOutput> paginationOutput = null;
    @JsonProperty("itemSearchURL")
    private List<String> itemSearchURL = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public FindItemsByKeywordsResponse() {
    }

    /**
     * 
     * @param searchResult
     * @param paginationOutput
     * @param ack
     * @param version
     * @param timestamp
     * @param itemSearchURL
     */
    public FindItemsByKeywordsResponse(List<String> ack, List<String> version, List<String> timestamp, List<SearchResult> searchResult, List<PaginationOutput> paginationOutput, List<String> itemSearchURL) {
        super();
        this.ack = ack;
        this.version = version;
        this.timestamp = timestamp;
        this.searchResult = searchResult;
        this.paginationOutput = paginationOutput;
        this.itemSearchURL = itemSearchURL;
    }

    @JsonProperty("ack")
    public List<String> getAck() {
        return ack;
    }

    @JsonProperty("ack")
    public void setAck(List<String> ack) {
        this.ack = ack;
    }

    public FindItemsByKeywordsResponse withAck(List<String> ack) {
        this.ack = ack;
        return this;
    }

    @JsonProperty("version")
    public List<String> getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(List<String> version) {
        this.version = version;
    }

    public FindItemsByKeywordsResponse withVersion(List<String> version) {
        this.version = version;
        return this;
    }

    @JsonProperty("timestamp")
    public List<String> getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
    }

    public FindItemsByKeywordsResponse withTimestamp(List<String> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("searchResult")
    public List<SearchResult> getSearchResult() {
        return searchResult;
    }

    @JsonProperty("searchResult")
    public void setSearchResult(List<SearchResult> searchResult) {
        this.searchResult = searchResult;
    }

    public FindItemsByKeywordsResponse withSearchResult(List<SearchResult> searchResult) {
        this.searchResult = searchResult;
        return this;
    }

    @JsonProperty("paginationOutput")
    public List<PaginationOutput> getPaginationOutput() {
        return paginationOutput;
    }

    @JsonProperty("paginationOutput")
    public void setPaginationOutput(List<PaginationOutput> paginationOutput) {
        this.paginationOutput = paginationOutput;
    }

    public FindItemsByKeywordsResponse withPaginationOutput(List<PaginationOutput> paginationOutput) {
        this.paginationOutput = paginationOutput;
        return this;
    }

    @JsonProperty("itemSearchURL")
    public List<String> getItemSearchURL() {
        return itemSearchURL;
    }

    @JsonProperty("itemSearchURL")
    public void setItemSearchURL(List<String> itemSearchURL) {
        this.itemSearchURL = itemSearchURL;
    }

    public FindItemsByKeywordsResponse withItemSearchURL(List<String> itemSearchURL) {
        this.itemSearchURL = itemSearchURL;
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

    public FindItemsByKeywordsResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FindItemsByKeywordsResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ack");
        sb.append('=');
        sb.append(((this.ack == null)?"<null>":this.ack));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("searchResult");
        sb.append('=');
        sb.append(((this.searchResult == null)?"<null>":this.searchResult));
        sb.append(',');
        sb.append("paginationOutput");
        sb.append('=');
        sb.append(((this.paginationOutput == null)?"<null>":this.paginationOutput));
        sb.append(',');
        sb.append("itemSearchURL");
        sb.append('=');
        sb.append(((this.itemSearchURL == null)?"<null>":this.itemSearchURL));
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
