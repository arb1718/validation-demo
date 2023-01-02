package org.sarsandi.rajeev.validationdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
