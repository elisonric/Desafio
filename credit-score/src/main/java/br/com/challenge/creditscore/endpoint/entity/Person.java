package br.com.challenge.creditscore.endpoint.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
    private List<PersonProperty> personPropertyList;

}
