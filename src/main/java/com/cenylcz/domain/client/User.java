package com.cenylcz.domain.client;

import com.cenylcz.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "user", schema = "client")
public class User extends Model implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_key", unique = true, nullable = false)
    private Integer userKey;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "boa", nullable = false)
    private Date boa;

    public Integer getUserKey() {
        return userKey;
    }

    public void setUserKey(Integer userKey) {
        this.userKey = userKey;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBoa() {
        return boa;
    }

    public void setBoa(Date boa) {
        this.boa = boa;
    }

    @Override
    public String toString() {
        return "User{" +
                "userKey=" + userKey +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", boa=" + boa +
                '}';
    }
}
