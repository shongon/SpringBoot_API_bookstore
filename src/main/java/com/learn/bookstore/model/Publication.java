package com.learn.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "publications")
public class Publication {
    @Id
    private Integer publication_id;
    private String publication_name;
}
