import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.LinkedList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "errors"
})
public class ErrorDetailsTO {
    /**
     * (Required)
     */
    @JsonProperty("errors")
    private List<ErrorDetails> errors;

    /**
     * (Required)
     *
     * @return The errors
     */
    @JsonProperty("errors")
    public List<ErrorDetails> getIssues() {
        if (errors == null) {
            errors = new LinkedList<>();
        }
        return errors;
    }

    /**
     * (Required)
     *
     * @param issues The errors
     */
    @JsonProperty("errors")
    public void setIssues(List<ErrorDetails> errors) {
        this.errors = errors;
    }
}
