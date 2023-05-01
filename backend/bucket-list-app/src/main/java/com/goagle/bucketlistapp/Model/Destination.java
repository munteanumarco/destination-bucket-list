package com.goagle.bucketlistapp.Model;


import com.goagle.bucketlistapp.Utils.DestinationType;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Autowired
    public Destination(String name, DestinationType destinationType) {
        this.name = name;
        this.destinationType = destinationType;
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
                '}';
    }
}
