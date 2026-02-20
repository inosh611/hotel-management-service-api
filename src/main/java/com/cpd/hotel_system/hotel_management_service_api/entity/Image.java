package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "room_image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Embedded
    private FileFormater fileFormater;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
