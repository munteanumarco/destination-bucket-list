package com.goagle.bucketlistapp.Model;


import com.goagle.bucketlistapp.Utils.DestinationType;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Table(name = "DESTINATION")
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destinationId;

    @Column(name = "DESTINATION_NAME", nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "DESTINATION_TYPE", nullable = false)
    private DestinationType destinationType;

    @ManyToMany(mappedBy = "destinations")
    private Set<BucketList> bucketLists = new HashSet<>();

    @Autowired
    public Destination(String name, DestinationType destinationType, Set<BucketList> bucketLists) {
        this.name = name;
        this.destinationType = destinationType;
        this.bucketLists = bucketLists;
    }

    public Set<BucketList> getBucketLists() {
        return bucketLists;
    }

    public void setBucketLists(Set<BucketList> bucketLists) {
        this.bucketLists = bucketLists;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destinationId=" + destinationId +
                ", name='" + name + '\'' +
                ", destinationType=" + destinationType +
                ", bucketLists=" + bucketLists +
                '}';
    }
}
