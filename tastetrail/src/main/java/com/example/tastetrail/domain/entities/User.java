package com.example.tastetrail.domain.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String username;

    @Field(type = FieldType.Text)
    private String givenName;

    @Field(type = FieldType.Text)
    private String familyName;

}

//summary:
//create a user entity to store basic user information
//Used Lombok annotation to reduce boilerplate code
//configured @Field annotation for Elasticsearch
//Used FieldType.Keyword for extract matching of IDs
//Used FieldType.Text for searchable name fields
