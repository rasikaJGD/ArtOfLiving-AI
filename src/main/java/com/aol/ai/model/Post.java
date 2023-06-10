package com.aol.ai.model;

import com.aol.ai.model.enums.PostContext;
import com.aol.ai.model.enums.PostStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Post {
  private UUID postId;
  private String imageLink;
  private String textSuggestion;
  private PostMetadata postMetadata;
  private LocalDateTime timestamp;
  private PostContext postContext;
  private PostStatus postStatus;
}
