package com.aol.ai.service;

import com.aol.ai.model.GetLatesPostsRequest;
import com.aol.ai.model.LatestPostsResponse;
import com.aol.ai.model.Post;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Setter
@Slf4j
public class ArtOfLivingServiceImpl implements ArtOfLivingAIService {


  @Override
  public Mono<LatestPostsResponse> getLatestFeed(GetLatesPostsRequest getLatesPostsRequest) {
    return null;
  }
}
