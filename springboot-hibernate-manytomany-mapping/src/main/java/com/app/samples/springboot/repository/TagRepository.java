package com.app.samples.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.samples.springboot.entity.Tag;

/**
 * The Interface TagRepository.
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
