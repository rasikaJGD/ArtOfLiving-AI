package com.aol.ai.model;

import com.aol.ai.model.enums.PostStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import java.util.UUID;

@With()
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
public class Post {
  private UUID postId;
  private String imageLink;
  private String textSuggestion;
  private PostMetadata postMetadata;
  private PostStatus postStatus;
}
