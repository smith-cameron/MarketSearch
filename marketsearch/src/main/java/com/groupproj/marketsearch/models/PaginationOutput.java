
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
    "pageNumber",
    "entriesPerPage",
    "totalPages",
    "totalEntries"
})
@Generated("jsonschema2pojo")
public class PaginationOutput {

    @JsonProperty("pageNumber")
    private List<String> pageNumber = null;
    @JsonProperty("entriesPerPage")
    private List<String> entriesPerPage = null;
    @JsonProperty("totalPages")
    private List<String> totalPages = null;
    @JsonProperty("totalEntries")
    private List<String> totalEntries = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaginationOutput() {
    }

    /**
     * 
     * @param pageNumber
     * @param totalPages
     * @param totalEntries
     * @param entriesPerPage
     */
    public PaginationOutput(List<String> pageNumber, List<String> entriesPerPage, List<String> totalPages, List<String> totalEntries) {
        super();
        this.pageNumber = pageNumber;
        this.entriesPerPage = entriesPerPage;
        this.totalPages = totalPages;
        this.totalEntries = totalEntries;
    }

    @JsonProperty("pageNumber")
    public List<String> getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("pageNumber")
    public void setPageNumber(List<String> pageNumber) {
        this.pageNumber = pageNumber;
    }

    public PaginationOutput withPageNumber(List<String> pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    @JsonProperty("entriesPerPage")
    public List<String> getEntriesPerPage() {
        return entriesPerPage;
    }

    @JsonProperty("entriesPerPage")
    public void setEntriesPerPage(List<String> entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
    }

    public PaginationOutput withEntriesPerPage(List<String> entriesPerPage) {
        this.entriesPerPage = entriesPerPage;
        return this;
    }

    @JsonProperty("totalPages")
    public List<String> getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(List<String> totalPages) {
        this.totalPages = totalPages;
    }

    public PaginationOutput withTotalPages(List<String> totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    @JsonProperty("totalEntries")
    public List<String> getTotalEntries() {
        return totalEntries;
    }

    @JsonProperty("totalEntries")
    public void setTotalEntries(List<String> totalEntries) {
        this.totalEntries = totalEntries;
    }

    public PaginationOutput withTotalEntries(List<String> totalEntries) {
        this.totalEntries = totalEntries;
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

    public PaginationOutput withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaginationOutput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pageNumber");
        sb.append('=');
        sb.append(((this.pageNumber == null)?"<null>":this.pageNumber));
        sb.append(',');
        sb.append("entriesPerPage");
        sb.append('=');
        sb.append(((this.entriesPerPage == null)?"<null>":this.entriesPerPage));
        sb.append(',');
        sb.append("totalPages");
        sb.append('=');
        sb.append(((this.totalPages == null)?"<null>":this.totalPages));
        sb.append(',');
        sb.append("totalEntries");
        sb.append('=');
        sb.append(((this.totalEntries == null)?"<null>":this.totalEntries));
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
