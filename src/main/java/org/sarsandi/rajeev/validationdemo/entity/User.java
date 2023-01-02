package org.sarsandi.rajeev.validationdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {
    @Id
    @GeneratedValue
    int userId;
    String userName;
    String email;
    String nationality;
    String phoneNo;

}
