package com.tutorials.user.service.usersercice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "micro_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "ID")
    private String userId;

    @Column(name = "NAME", length = 25)
    private String name;

    private String email;

    private String about;

}
