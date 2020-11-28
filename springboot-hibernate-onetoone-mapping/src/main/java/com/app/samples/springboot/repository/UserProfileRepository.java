package com.app.samples.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.samples.springboot.entity.UserProfile;

/**
 * The Interface UserProfileRepository.
 */
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
