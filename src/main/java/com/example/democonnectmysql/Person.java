package com.example.democonnectmysql;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "thongtin")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Person {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String ten;
     private String nghenghiep;
     private int tuoi;
}
