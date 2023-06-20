package com.aol.ai.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.*;
import java.util.List;


@With()
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
//@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
@DynamoDbBean
public class GeneratedPosts {
  private String PostId_UserId;
  private String PostContext_Timestamp;
  private List<Post> GeneratedPosts;
  private GetSuggestionsPreviewRequest UserInput;
}
