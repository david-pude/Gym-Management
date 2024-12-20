/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

/**
 *
 * @author David Pude
 */
public class ReservationEntity {
    private int reserverId;
    private String reservationDate;
    private String area;
    private int participants;

    public ReservationEntity(int reserverId, String reservationDate, String area, int participants) {
        this.reserverId = reserverId;
        this.reservationDate = reservationDate;
        this.area = area;
        this.participants = participants;
    }

    public int getReserverId() {
        return reserverId;
    }

    public void setReserverId(int reserverId) {
        this.reserverId = reserverId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
}
