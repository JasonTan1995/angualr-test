package com.angular.test.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "hero")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Hero implements Serializable {

    @Id
    @Column(name = "hero_id")
    @GeneratedValue
    private int heroId;

    @Column(name = "hero_name")
    private String heroName;
}
