
package org.esupportail.dining.web.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "code",
    "ingredients",
    "name",
    "nutritionitems"
})
public class Dish {

    /**
     * 
     */
    @JsonProperty("code")
    private List<Integer> code = new ArrayList<Integer>();
    /**
     * 
     */
    @JsonProperty("ingredients")
    private String ingredients;
    /**
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     */
    @JsonProperty("nutritionitems")
    private List<Nutritionitem> nutritionitems = new ArrayList<Nutritionitem>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     */
    @JsonProperty("code")
    public List<Integer> getCode() {
        return code;
    }

    /**
     * 
     */
    @JsonProperty("code")
    public void setCode(List<Integer> code) {
        this.code = code;
    }

    /**
     * 
     */
    @JsonProperty("ingredients")
    public String getIngredients() {
        return ingredients;
    }

    /**
     * 
     */
    @JsonProperty("ingredients")
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    @JsonProperty("nutritionitems")
    public List<Nutritionitem> getNutritionitems() {
        return nutritionitems;
    }

    /**
     * 
     */
    @JsonProperty("nutritionitems")
    public void setNutritionitems(List<Nutritionitem> nutritionitems) {
        this.nutritionitems = nutritionitems;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
