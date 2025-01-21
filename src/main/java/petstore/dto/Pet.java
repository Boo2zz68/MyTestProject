package petstore.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@With
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pet {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("name")
    private String name;
    @JsonProperty("photoUrls")
    private List<String> photoUrls = new ArrayList<String>();
    @JsonProperty("tags")
    private List<Tags> tags = new ArrayList<Tags>();
    @JsonProperty("status")
    private String status;
}

