package com.app.samples.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.samples.springboot.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
