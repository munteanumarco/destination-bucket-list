package com.goagle.bucketlistapp.Repository;

import com.goagle.bucketlistapp.Model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserProfileRepository extends JpaRepository<UserProfile, Long> {
}
