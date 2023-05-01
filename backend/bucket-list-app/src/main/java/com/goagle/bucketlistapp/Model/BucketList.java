package com.goagle.bucketlistapp.Model;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "BUCKET_LIST")
public class BucketList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bucketListId;

    @Column(name = "BUCKET_LIST_CREATED", nullable = false, updatable = false) // You can't modify when you created the bucket list.
    @CreationTimestamp
    private LocalDateTime created;

    @Column(name = "BUCKET_LIST_NAME", nullable = true) // It can be null
    private String name;



}
