package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Configurable(preConstruction = true)
public class PersonEntity {

    @Autowired
    @Transient
    private IdService idService;

    @Id
    private int id;
    private String name;

    public PersonEntity(String name) {
        generateId();
        this.name = name;
    }

    void generateId() {
        this.id = idService.generateId();
    }
}
