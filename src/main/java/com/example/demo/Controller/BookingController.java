package com.example.demo.Controller;

import com.example.demo.Booking.BookingRepository;
import com.example.demo.Booking.HotelBooking;
import org.jsondoc.core.annotation.ApiPathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(value = "/bookings")
    public class BookingController {

        private BookingRepository bookingRepository;

        @Autowired
        public BookingController(BookingRepository bookingRepository) {
            this.bookingRepository = bookingRepository;
        }

        @RequestMapping(value = "/all", method = RequestMethod.GET)
        public List<HotelBooking> getAll() {
            return bookingRepository.findAll();
        }

        @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
        public List<HotelBooking> getAffordable(@ApiPathParam(name = "price") @PathVariable double price) {
            return bookingRepository.findByPricePerNightLessThan(price);
        }

        @RequestMapping(value = "/create", method = RequestMethod.POST)
        public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking) {
            bookingRepository.save(hotelBooking);

            return bookingRepository.findAll();
        }

        @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
        public List<HotelBooking> remove(@ApiPathParam(name = "id") @PathVariable long id) {
            bookingRepository.deleteById(id);

            return bookingRepository.findAll();
        }
    }
