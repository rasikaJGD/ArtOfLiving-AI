package com.aol.ai.service;

import com.aol.ai.model.*;
import com.aol.ai.model.enums.PostContext;
import com.aol.ai.model.enums.PostStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/*
This class has the business logic for all the APIs Art of living Service hosts.
 */
@Service
public class ArtOfLivingServiceImpl implements ArtOfLivingAIService{

    @Override
    public Mono<LatestPostsResponse> getLatestFeed(GetLatesPostsRequest getLatesPostsRequest) {

        Post post = Post.builder().imageLink(String.valueOf(getLatesPostsRequest.getNumberOfPosts()))
                .textSuggestion("AOL & Gurudev has received message input and sharing it with universe")
                .postStatus(PostStatus.ORIGINAL_USER_EDITED)
                .postMetadata(PostMetadata.builder().postContext(PostContext.SKY).Timestamp(new Date()).build())
                .build();
        List<Post> postList = new ArrayList<>();
        postList.add(post);
        LatestPostsResponse latestPostsResponse = LatestPostsResponse.builder().posts(postList).build();
        return Mono.just(latestPostsResponse);

    }

    @Override
    public Mono<SuggestionsPreviewResponse> getSuggestionsPreview
             (GetSuggestionsPreviewRequest getSuggestionsPreviewRequest) {

        Post post = Post.builder().imageLink(getSuggestionsPreviewRequest.getImageS3URL())
                .textSuggestion(getSuggestionsPreviewRequest.getText() + "." + "AOL & Gurudev has received your message and sharing it with universe" + ".")
                .postStatus(PostStatus.ORIGINAL_USER_EDITED)
                .postMetadata(PostMetadata.builder().postContext(PostContext.SKY).Timestamp(new Date()).build())
                .build();
        List<Post> postList = new ArrayList<>();
        postList.add(post);
        SuggestionsPreviewResponse suggestionsPreviewResponse = SuggestionsPreviewResponse.builder()
                .posts(postList).build();

        // Save the Generated Post object in Dynamo DB here.
        GeneratedPosts generatedPosts = GeneratedPosts.builder()
                .PostId_UserId("123_456")
                .PostContext_Timestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")))
                .GeneratedPosts(postList)
                .UserInput(getSuggestionsPreviewRequest)
                .build();

        //generatedPostsRepository.save(generatedPosts);

        return Mono.just(suggestionsPreviewResponse);
    }

    @Override
    public Mono<SharePostResponse> sharePost(SharePostRequest sharePostRequest) {
           SharePostResponse sharePostResponse = SharePostResponse.builder()
                   .thirdPartyCallbackEndPointURL("")
                   .thirdPartyUserGeneratedContent("Content received and API Development in progress..")
                   .build();

           return Mono.just(sharePostResponse);
    }
}
