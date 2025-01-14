package petstore.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class GetOrder {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("petId")
    private Integer petId;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("shipDate")
    private String shipDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("status")
    private Boolean complete;
}
