package com.aol.ai.model;

import com.aol.ai.model.enums.PostStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@With()
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
/*
This class is to capture the SharePost API request object.
 */
public class SharePostRequest {
    private List<Post> post;
    private String toChannel;
    private UserMetaData userMetaData;
    private Permissions permissions;
    private PostStatus postStatus;
}
