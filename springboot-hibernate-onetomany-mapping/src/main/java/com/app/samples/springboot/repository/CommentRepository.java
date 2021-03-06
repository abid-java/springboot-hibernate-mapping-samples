package com.app.samples.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.samples.springboot.entity.Comment;

/**
 * The Interface CommentRepository.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
