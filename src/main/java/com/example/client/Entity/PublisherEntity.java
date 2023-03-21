package com.example.client.Entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class PublisherEntity {
    private Long id;
    private String name;
    private String city;
    private String year;

}