package com.avenuecode.webmvcapp.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private String id;
    private String name;
    private Date birthday;

}
