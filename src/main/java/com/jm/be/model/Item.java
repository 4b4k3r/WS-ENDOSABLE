package com.jm.be.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item
{
    @Id
    @GeneratedValue()
    private Long id;
    private String name;
    private String description;
    private Integer quantity;
}
