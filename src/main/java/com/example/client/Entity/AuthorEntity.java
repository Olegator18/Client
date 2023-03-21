package com.example.client.Entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class AuthorEntity {
    private Long id;
    private String name;
    private String otch;
    private String surname;
}
