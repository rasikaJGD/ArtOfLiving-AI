package com.aol.ai.DAL;

import com.aol.ai.model.GeneratedPosts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
This class will write and read the data to DynamoDB.
 */
@Component
public class SaveDataToDB {

    @Autowired
    private final GeneratedPostsRepository generatedPostsRepository;
    @Autowired
    public SaveDataToDB(GeneratedPostsRepository generatedPostsRepository) {
        this.generatedPostsRepository = generatedPostsRepository;
    }

    public void SaveGeneratedPosts(GeneratedPosts generatedPosts) {
        generatedPostsRepository.save(generatedPosts);
    }
}
