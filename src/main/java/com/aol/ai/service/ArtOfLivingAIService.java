package com.aol.ai.service;
import com.aol.ai.model.GetLatesPostsRequest;
import reactor.core.publisher.Mono;
import com.aol.ai.model.LatestPostsResponse;

/**
 * this service is responsible to
 * get the latest feed
 * get suggestion
 * postFeed in social media
 */
public interface ArtOfLivingAIService {

  Mono<LatestPostsResponse> getLatestFeed(GetLatesPostsRequest getLatesPostsRequest);
}
