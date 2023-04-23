package com.example.hw12.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    long id;
    String title;
    String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
