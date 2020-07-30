package com.example.demo.player;


import javax.persistence.*;

@Entity
@Table(name="PLAYER")
public class Player {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="PLAYER_ID")
    private int Id;
    @Column(name="PLAYER_NAME")
    private String Name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
