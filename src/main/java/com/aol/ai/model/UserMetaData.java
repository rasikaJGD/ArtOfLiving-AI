package com.aol.ai.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import lombok.extern.jackson.Jacksonized;

@With()
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Jacksonized
/*
This class is used in GetSuggestionsPreviewRequest object to capture user data.
 */
public class UserMetaData {
    private String deviceId;
    private String ip;
    private String email;
    private String userCookies;
}
