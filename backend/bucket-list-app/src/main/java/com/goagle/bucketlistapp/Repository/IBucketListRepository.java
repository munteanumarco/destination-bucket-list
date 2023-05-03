package com.goagle.bucketlistapp.Repository;

import com.goagle.bucketlistapp.Model.BucketList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBucketListRepository extends JpaRepository<BucketList,Long> {
}
