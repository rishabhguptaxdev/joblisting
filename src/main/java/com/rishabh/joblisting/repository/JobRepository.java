package com.rishabh.joblisting.repository;

import com.rishabh.joblisting.models.Job;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface JobRepository extends MongoRepository<Job, String> {
}
