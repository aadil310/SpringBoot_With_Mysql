package com.sprin_practice.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hotel")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Hotel_id;

    @Column
    String Hotel_name;
    
    @Column
    String Hotel_address;

    @Column
    String Hotel_Rent;

    @Column
    String Star_quality;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int hotel_id, String hotel_name, String hotel_address, String hotel_Rent,
            String star_quality) {
        Hotel_id = hotel_id;
        Hotel_name = hotel_name;
        Hotel_address = hotel_address;
        Hotel_Rent = hotel_Rent;
        Star_quality = star_quality;
    }

    public int getHotel_id() {
        return Hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        Hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return Hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        Hotel_name = hotel_name;
    }

    public String getHotel_address() {
        return Hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        Hotel_address = hotel_address;
    }

    public String getHotel_Rent() {
        return Hotel_Rent;
    }

    public void setHotel_Rent(String hotel_Rent) {
        Hotel_Rent = hotel_Rent;
    }

    public String getStar_quality() {
        return Star_quality;
    }

    public void setStar_quality(String star_quality) {
        Star_quality = star_quality;
    }
    

    
}
