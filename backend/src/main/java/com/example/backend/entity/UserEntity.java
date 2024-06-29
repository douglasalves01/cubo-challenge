package com.example.backend.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "tb-users")
public class UserEntity {
    @MongoId
    private String userId;
    private String firstName;
    private String lastName;
    private Float participation;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Float getParticipation() {
        return participation;
    }

    public void setParticipation(Float participation) {
        this.participation = participation;
    }
}
