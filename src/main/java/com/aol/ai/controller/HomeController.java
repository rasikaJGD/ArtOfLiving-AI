package com.aol.ai.controller;

import com.aol.ai.model.*;
import com.aol.ai.service.ArtOfLivingAIService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


/**
 * Home Controller.
 */
@RestController
@RequestMapping(value = "v1/")
@AllArgsConstructor
public class HomeController {

  private final ArtOfLivingAIService artOfLivingAIService;

  @GetMapping("getLatestFeeds")
  public Mono<LatestPostsResponse> getLatestFeeds(
        @RequestBody GetLatesPostsRequest getLatesPostsRequest){
      return artOfLivingAIService.getLatestFeed(getLatesPostsRequest);
  }

  @GetMapping("getSuggestionsPreview")
    public Mono<SuggestionsPreviewResponse> getSuggestionsPreview(
          @RequestBody GetSuggestionsPreviewRequest getSuggestionsPreviewRequest){
         return artOfLivingAIService.getSuggestionsPreview(getSuggestionsPreviewRequest);
  }

  @PutMapping("sharePost")
    public Mono<SharePostResponse> sharePost(
            @RequestBody SharePostRequest sharePostRequest) {
            return artOfLivingAIService.sharePost(sharePostRequest);
  }
}
