package com.lukash.jsonpostgres.entities;


import javax.persistence.*;

@Entity
@Table(schema="space",name="lords")
public class Lord implements Comparable<Lord> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lord() {
    }

    public Lord(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Lord o) {
        Lord tmp = (Lord) o;
        if (this.age < tmp.age) {
            /* текущее меньше полученного */
            return -1;
        } else if (this.age > tmp.age) {
            /* текущее больше полученного */
            return 1;
        }else return 0;
        // текущее равно по
    }


}
