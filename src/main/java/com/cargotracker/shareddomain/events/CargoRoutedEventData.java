package com.cargotracker.shareddomain.events;

/**
 * Event Data for the Cargo Booked Event
 */
public class CargoRoutedEventData {
    private String bookingId;
    
    public CargoRoutedEventData() {}
    public CargoRoutedEventData(String bookingId){
        this.bookingId = bookingId;
    }
    
    public String getBookingId(){return this.bookingId;}
}