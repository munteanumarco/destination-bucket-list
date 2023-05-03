package com.goagle.bucketlistapp.Repository;

import com.goagle.bucketlistapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {
}
