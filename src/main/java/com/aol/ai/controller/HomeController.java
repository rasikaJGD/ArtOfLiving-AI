package com.aol.ai.controller;

import com.aol.ai.model.GetLatesPostsRequest;
import com.aol.ai.model.LatestPostsResponse;
import com.aol.ai.service.ArtOfLivingAIService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Home Controller.
 */
@RestController
@RequestMapping("v1/")
@AllArgsConstructor
public class HomeController {

  private final ArtOfLivingAIService artOfLivingAIService;

  @GetMapping("getLatestFeeds")
  public Mono<LatestPostsResponse> getLatestFeeds(
        @RequestBody GetLatesPostsRequest getLatesPostsRequest){
      return artOfLivingAIService.getLatestFeed(getLatesPostsRequest);
  }
}
