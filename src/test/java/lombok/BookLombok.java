package lombok;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class BookLombok {
    private Long isbn;
    private String title;
    private String author;
    @JsonProperty("publish_date")
    private String publishDate;
}
