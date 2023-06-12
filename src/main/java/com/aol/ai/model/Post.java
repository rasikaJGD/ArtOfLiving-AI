package com.aol.ai.model;

import com.aol.ai.model.enums.PostContext;
import com.aol.ai.model.enums.PostStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
public class Post {
  private UUID postId;
  private String imageLink;
  private String textSuggestion;
  private PostMetadata postMetadata;
  private LocalDateTime timestamp;
  private PostContext postContext;
  private PostStatus postStatus;
}
