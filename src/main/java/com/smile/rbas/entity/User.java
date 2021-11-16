package com.smile.rbas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="USER_AUTH_TBL")
public class User {

    private int id;
    private String userName;
    private String password;
    private boolean active;
    private String roles;
}
