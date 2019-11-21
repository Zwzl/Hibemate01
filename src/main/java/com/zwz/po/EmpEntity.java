package com.zwz.po;

import javax.persistence.*;

/**
 * @author 张唯卓
 * @reate 2019-11-20-10:03
 */
@Entity
@Table(name = "emp", schema = "empa", catalog = "")
public class EmpEntity {
    private int id;
    private String name;
    private String email;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmpEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}


        if (o == null || getClass() != o.getClass()){ return false;}

        EmpEntity empEntity = (EmpEntity) o;

        if (id != empEntity.id) {return false;}
        if (name != null ? !name.equals(empEntity.name) : empEntity.name != null) {return false;}
        if (email != null ? !email.equals(empEntity.email) : empEntity.email != null) {return false;}

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
