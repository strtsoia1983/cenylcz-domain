package com.cenylcz.domain.client;

import com.cenylcz.Model;
import com.cenylcz.domain.DateDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

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
    private ZonedDateTime boa;

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

    @JsonFormat(pattern = "MM/dd/yyyy HH:mm:ss.S")
    public Timestamp getBoa() {
        if (boa != null) {
            return Timestamp.from(boa.toInstant());
        }
        return null;
    }

    @JsonDeserialize(using = DateDeserializer.class)
    public void setBoa(Timestamp boa) {
        if (boa != null) {
            this.boa = boa.toLocalDateTime().atZone(ZoneId.of("Z"));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userKey, user.userKey) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(boa, user.boa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userKey, firstName, lastName, boa);
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
