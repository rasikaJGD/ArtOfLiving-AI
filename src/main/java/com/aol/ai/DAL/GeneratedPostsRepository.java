package com.aol.ai.DAL;

import com.aol.ai.model.GeneratedPosts;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface GeneratedPostsRepository extends CrudRepository<GeneratedPosts, String> {

    GeneratedPosts save(GeneratedPosts generatedPosts);
}
