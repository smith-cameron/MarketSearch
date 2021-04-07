
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
    "conditionId",
    "conditionDisplayName"
})
@Generated("jsonschema2pojo")
public class Condition {

    @JsonProperty("conditionId")
    private List<String> conditionId = null;
    @JsonProperty("conditionDisplayName")
    private List<String> conditionDisplayName = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Condition() {
    }

    /**
     * 
     * @param conditionDisplayName
     * @param conditionId
     */
    public Condition(List<String> conditionId, List<String> conditionDisplayName) {
        super();
        this.conditionId = conditionId;
        this.conditionDisplayName = conditionDisplayName;
    }

    @JsonProperty("conditionId")
    public List<String> getConditionId() {
        return conditionId;
    }

    @JsonProperty("conditionId")
    public void setConditionId(List<String> conditionId) {
        this.conditionId = conditionId;
    }

    public Condition withConditionId(List<String> conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    @JsonProperty("conditionDisplayName")
    public List<String> getConditionDisplayName() {
        return conditionDisplayName;
    }

    @JsonProperty("conditionDisplayName")
    public void setConditionDisplayName(List<String> conditionDisplayName) {
        this.conditionDisplayName = conditionDisplayName;
    }

    public Condition withConditionDisplayName(List<String> conditionDisplayName) {
        this.conditionDisplayName = conditionDisplayName;
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

    public Condition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Condition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("conditionId");
        sb.append('=');
        sb.append(((this.conditionId == null)?"<null>":this.conditionId));
        sb.append(',');
        sb.append("conditionDisplayName");
        sb.append('=');
        sb.append(((this.conditionDisplayName == null)?"<null>":this.conditionDisplayName));
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
