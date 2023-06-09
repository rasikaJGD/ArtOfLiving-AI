package com.aol.ai.model;

import com.aol.ai.model.enums.PostContext;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import java.util.Date;

@With()
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
/*
This class is used in Post object to capture post meta data.
 */
public class PostMetadata {
    private Date Timestamp;
    private PostContext postContext;
}
