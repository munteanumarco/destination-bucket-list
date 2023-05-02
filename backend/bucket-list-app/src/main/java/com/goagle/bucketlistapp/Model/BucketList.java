package com.goagle.bucketlistapp.Model;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            name = "BUCKET_LIST_DESTINATION",
            joinColumns = @JoinColumn(name = "bucket_list_id"),
            inverseJoinColumns = @JoinColumn(name = "destination_id")
    )
    private Set<Destination> destinations = new HashSet<>(); // a destination can be in more buckets and a bucket has multiple destinations so many-to-many

    @OneToOne(mappedBy = "bucketList", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private User user;

    public BucketList(String name, Set<Destination> destinations, User user) {
        this.name = name;
        this.destinations = destinations;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getBucketListId() {
        return bucketListId;
    }

    public void setBucketListId(Long bucketListId) {
        this.bucketListId = bucketListId;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(Set<Destination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "BucketList{" +
                "bucketListId=" + bucketListId +
                ", created=" + created +
                ", name='" + name + '\'' +
                ", destinations=" + destinations +
                ", user=" + user +
                '}';
    }
}
