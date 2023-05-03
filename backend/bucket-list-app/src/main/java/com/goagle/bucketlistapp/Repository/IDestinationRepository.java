package com.goagle.bucketlistapp.Repository;

import com.goagle.bucketlistapp.Model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDestinationRepository extends JpaRepository<Destination,Long> {
}
