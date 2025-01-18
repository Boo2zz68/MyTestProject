package petstore.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@With
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tags {
    @JsonProperty("id")
    private Integer Id;
    @JsonProperty("name")
    private String name;
}
