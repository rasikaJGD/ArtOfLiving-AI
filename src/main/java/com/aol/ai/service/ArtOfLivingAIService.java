package com.aol.ai.service;
import com.aol.ai.model.*;
import reactor.core.publisher.Mono;

/**
 * this service is responsible to
 * get the latest feed
 * get suggestion
 * postFeed in social media
 */
public interface ArtOfLivingAIService {

  Mono<LatestPostsResponse> getLatestFeed(GetLatesPostsRequest getLatesPostsRequest);
  Mono<SuggestionsPreviewResponse>  getSuggestionsPreview(GetSuggestionsPreviewRequest getSuggestionsPreviewRequest);
  Mono<SharePostResponse> sharePost(SharePostRequest sharePostRequest);
}
